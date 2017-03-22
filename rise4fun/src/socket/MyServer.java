package socket;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.nio.file.Files;
import java.nio.file.Paths;


import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class MyServer {

    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8085), 10);
        server.createContext("/metadata", new MyHandler());
        server.createContext("/run", new MyRunHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
    }
    
    static class MyHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
        	String response= new String(Files.readAllBytes(Paths.get("/home/waghon/IdeaProjects/rise4fun/src/socket/metadata")));
            //String response = "This is the response"; 
            //System.out.println(response);
        	t.sendResponseHeaders(200, response.getBytes().length);
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            //os.close();
        }
    }
    
    static class MyRunHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
        	InputStream is=t.getRequestBody();
        	//TODO: the size should be changed.
        	byte[] request = new byte[2048];
        	String request_s = "";
        	//System.out.println(request_s);
        	while ((is.read(request)) != -1) {
        		String temp=new String(request, "GB2312");
        		request_s = request_s + temp;
        		//System.out.println(request_s);
            }
        	//is.read(request);        	
        	//String request_s = new String(request, "GB2312");
            System.out.println(request_s);
            
            JSONObject inJsonObject=JSONObject.fromObject(request_s);
            String inString = (String) inJsonObject.get("Source");
            System.out.println(inString);
            String fileName, paraments, fileContent;
            //String strSplit[]=inString.split("#");
            fileName="rise4funTemp";
            //paraments=strSplit[1];
            //fileContent=strSplit[2];
            System.out.println(fileName);
            //System.out.println(paraments);
            System.out.println(inString);
            String filePath="/home/waghon/Projects/ImpSynt/examples/rise4fun/"+fileName+".imp";
            PrintWriter fileOut = new PrintWriter(filePath);   
            fileOut.print(inString);
            fileOut.close(); // 关闭数据流  
            String myCommand="java -jar /home/waghon/Projects/ImpSynt/NaturalSynthesis.jar rise4fun " + fileName;
            System.out.println(myCommand);
            File execPath = new File("/home/waghon/Projects/ImpSynt/");
            try {
				Runtime.getRuntime().exec(myCommand,null,execPath).waitFor();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println("done");
            String result = new String(Files.readAllBytes(Paths.get("/home/waghon/Projects/ImpSynt/output/rise4fun/"+fileName+".imp")));
        	//String response= new String(Files.readAllBytes(Paths.get("/home/waghon/workspace/MyServer/src/socket/run")));
        	//JSONObject outJsonObject=JSONObject.fromObject(response);
        	
            
            JSONObject jsonResponse = new JSONObject();
            jsonResponse.put("Version", "1.0");
            JSONArray outputs = new JSONArray();
            JSONObject node = new JSONObject();
            node.put("MimeType", "text/plain");
            node.put("Value", result);
            outputs.add(node);
            jsonResponse.put("Outputs", outputs);
            String response = jsonResponse.toString();
        	//String response = "This is the response"; 
            System.out.println(response);
        	t.sendResponseHeaders(200, response.getBytes().length);
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            is.close();
            os.close();
        }
    }

}