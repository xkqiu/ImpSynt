public class Triple <T, U, V>
{
   private final T first;
   private final U second;
   private final V third;
   private transient final int hash;

   public Triple( T f, U s, V t)
   {
    this.first = f;
    this.second = s;
    this.third = t;
    hash = (first == null? 0 : first.hashCode() * 31 * 31)
          +(second == null? 0 : second.hashCode() * 31)
          +(third == null? 0 : third.hashCode());
   }

   public T getFirst()
   {
    return first;
   }
   public U getSecond()
   {
    return second;
   }
   public V getThird()
   {
    return third;
   }

   @Override
   public int hashCode()
   {
    return hash;
   }

   @SuppressWarnings("unchecked")
   @Override
   public boolean equals( Object oth )
   {
    if ( this == oth )
    {
      return true;
    }
    if ( oth == null || !(getClass().isInstance( oth )) )
    {
      return false;
    }
    Triple<T, U, V> other = getClass().cast( oth );
    return (first == null? other.first == null : first.equals( other.first ))
     && (second == null? other.second == null : second.equals( other.second ))
     && (third == null? other.third == null : third.equals( other.second ));
   }

}