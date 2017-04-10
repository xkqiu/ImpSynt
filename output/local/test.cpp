#include <cstdio>
#include <assert.h>
#include <iostream>
using namespace std;
#include "vops.h"
#include "test.h"
namespace ANONYMOUS{

void list_find_min_rec__Wrapper(int* llocvars/* len = 2 */, int* lintvars/* len = 2 */, int* lnext/* len = 3 */, int* lsupernext/* len = 3 */, int* lkey/* len = 3 */, bool* lsymbolic/* len = 3 */, bool* lactive/* len = 3 */, int ret_value, bool* new_symbolic/* len = 3 */, int* new_next/* len = 3 */, int* new_supernext/* len = 3 */, int* new_key/* len = 3 */) {
  int  ts__ANONYMOUS_s1044=0;
  glblInit_ts__ANONYMOUS_s1683(ts__ANONYMOUS_s1044);
  int  ret__ANONYMOUS_s1189=0;
  glblInit_ret__ANONYMOUS_s1681(ret__ANONYMOUS_s1189);
  int  ranking__ANONYMOUS_s1182=0;
  glblInit_ranking__ANONYMOUS_s1679(ranking__ANONYMOUS_s1182);
  int  malloc_budget__ANONYMOUS_s1279=0;
  glblInit_malloc_budget__ANONYMOUS_s1677(malloc_budget__ANONYMOUS_s1279);
  int  fake_unfold_to__ANONYMOUS_s1400=0;
  glblInit_fake_unfold_to__ANONYMOUS_s1675(fake_unfold_to__ANONYMOUS_s1400);
  int  fake_unfold__ANONYMOUS_s1039=0;
  glblInit_fake_unfold__ANONYMOUS_s1673(fake_unfold__ANONYMOUS_s1039);
  bool  error_flag__ANONYMOUS_s1022=0;
  glblInit_error_flag__ANONYMOUS_s1671(error_flag__ANONYMOUS_s1022);
  bool _tt0[4] = {0, 0, 0, 0};
  bool*  active__ANONYMOUS_s1038= new bool [4]; CopyArr<bool >(active__ANONYMOUS_s1038,_tt0, 4, 4);
  bool _tt1[4] = {0, 0, 0, 0};
  bool*  symbolic__ANONYMOUS_s1043= new bool [4]; CopyArr<bool >(symbolic__ANONYMOUS_s1043,_tt1, 4, 4);
  bool _tt2[4] = {0, 0, 0, 0};
  int*  supernext__ANONYMOUS_s1133= new int [4]; CopyArr<int >(supernext__ANONYMOUS_s1133,_tt2, 4, 4);
  bool _tt3[4] = {0, 0, 0, 0};
  int*  right__ANONYMOUS_s1165= new int [4]; CopyArr<int >(right__ANONYMOUS_s1165,_tt3, 4, 4);
  bool _tt4[4] = {0, 0, 0, 0};
  bool*  p_history__ANONYMOUS_s1181= new bool [4 * 4]; CopyArr<bool >(p_history__ANONYMOUS_s1181,_tt4, 4 * 4, 4);
  bool _tt5[4] = {0, 0, 0, 0};
  int*  next__ANONYMOUS_s1132= new int [4]; CopyArr<int >(next__ANONYMOUS_s1132,_tt5, 4, 4);
  bool _tt6[3] = {0, 0, 0};
  int*  locvars__ANONYMOUS_s1042= new int [3]; CopyArr<int >(locvars__ANONYMOUS_s1042,_tt6, 3, 3);
  bool _tt7[4] = {0, 0, 0, 0};
  int*  left__ANONYMOUS_s1164= new int [4]; CopyArr<int >(left__ANONYMOUS_s1164,_tt7, 4, 4);
  bool _tt8[4] = {0, 0, 0, 0};
  int*  key__ANONYMOUS_s1041= new int [4]; CopyArr<int >(key__ANONYMOUS_s1041,_tt8, 4, 4);
  bool _tt9[2] = {0, 0};
  int*  intvars__ANONYMOUS_s1040= new int [2]; CopyArr<int >(intvars__ANONYMOUS_s1040,_tt9, 2, 2);
  bool _tt10[4] = {0, 0, 0, 0};
  bool*  history__ANONYMOUS_s1134= new bool [4 * 4]; CopyArr<bool >(history__ANONYMOUS_s1134,_tt10, 4 * 4, 4);
  int  old_sll__ANONYMOUS_s1579=0;
  int  old_min__ANONYMOUS_s1578=0;
  int  newer_sll__ANONYMOUS_s1621=0;
  int  newer_min__ANONYMOUS_s1620=0;
  list_find_min_rec(llocvars, lintvars, lnext, lsupernext, lkey, lsymbolic, lactive, ret_value, new_symbolic, new_next, new_supernext, new_key, active__ANONYMOUS_s1038, error_flag__ANONYMOUS_s1022, fake_unfold__ANONYMOUS_s1039, fake_unfold_to__ANONYMOUS_s1400, history__ANONYMOUS_s1134, intvars__ANONYMOUS_s1040, key__ANONYMOUS_s1041, left__ANONYMOUS_s1164, locvars__ANONYMOUS_s1042, malloc_budget__ANONYMOUS_s1279, newer_min__ANONYMOUS_s1620, newer_sll__ANONYMOUS_s1621, next__ANONYMOUS_s1132, old_min__ANONYMOUS_s1578, old_sll__ANONYMOUS_s1579, p_history__ANONYMOUS_s1181, ranking__ANONYMOUS_s1182, ret__ANONYMOUS_s1189, right__ANONYMOUS_s1165, supernext__ANONYMOUS_s1133, symbolic__ANONYMOUS_s1043, ts__ANONYMOUS_s1044);
  delete[] active__ANONYMOUS_s1038;
  delete[] symbolic__ANONYMOUS_s1043;
  delete[] supernext__ANONYMOUS_s1133;
  delete[] right__ANONYMOUS_s1165;
  delete[] p_history__ANONYMOUS_s1181;
  delete[] next__ANONYMOUS_s1132;
  delete[] locvars__ANONYMOUS_s1042;
  delete[] left__ANONYMOUS_s1164;
  delete[] key__ANONYMOUS_s1041;
  delete[] intvars__ANONYMOUS_s1040;
  delete[] history__ANONYMOUS_s1134;
}
void list_find_min_rec__WrapperNospec(int* llocvars/* len = 2 */, int* lintvars/* len = 2 */, int* lnext/* len = 3 */, int* lsupernext/* len = 3 */, int* lkey/* len = 3 */, bool* lsymbolic/* len = 3 */, bool* lactive/* len = 3 */, int ret_value, bool* new_symbolic/* len = 3 */, int* new_next/* len = 3 */, int* new_supernext/* len = 3 */, int* new_key/* len = 3 */) {}
void glblInit_error_flag__ANONYMOUS_s1671(bool& error_flag__ANONYMOUS_s1670) {
  error_flag__ANONYMOUS_s1670 = 0;
}
void glblInit_fake_unfold__ANONYMOUS_s1673(int& fake_unfold__ANONYMOUS_s1672) {
  fake_unfold__ANONYMOUS_s1672 = 0;
}
void glblInit_fake_unfold_to__ANONYMOUS_s1675(int& fake_unfold_to__ANONYMOUS_s1674) {
  fake_unfold_to__ANONYMOUS_s1674 = 0;
}
void glblInit_malloc_budget__ANONYMOUS_s1677(int& malloc_budget__ANONYMOUS_s1676) {
  malloc_budget__ANONYMOUS_s1676 = 1;
}
void glblInit_ranking__ANONYMOUS_s1679(int& ranking__ANONYMOUS_s1678) {
  ranking__ANONYMOUS_s1678 = 0;
}
void glblInit_ret__ANONYMOUS_s1681(int& ret__ANONYMOUS_s1680) {
  ret__ANONYMOUS_s1680 = 0;
}
void glblInit_ts__ANONYMOUS_s1683(int& ts__ANONYMOUS_s1682) {
  ts__ANONYMOUS_s1682 = 0;
}
void list_find_min_rec(int* llocvars_0/* len = 2 */, int* lintvars_1/* len = 2 */, int* lnext_2/* len = 3 */, int* lsupernext_3/* len = 3 */, int* lkey_4/* len = 3 */, bool* lsymbolic_5/* len = 3 */, bool* lactive_6/* len = 3 */, int ret_value_7, bool* new_symbolic_8/* len = 3 */, int* new_next_9/* len = 3 */, int* new_supernext_10/* len = 3 */, int* new_key_11/* len = 3 */, bool* active__ANONYMOUS_s969/* len = 4 */, bool& error_flag__ANONYMOUS_s1078, int& fake_unfold__ANONYMOUS_s999, int& fake_unfold_to__ANONYMOUS_s1617, bool* history__ANONYMOUS_s977/* len = 4 * 4 */, int* intvars__ANONYMOUS_s1131/* len = 2 */, int* key__ANONYMOUS_s1108/* len = 4 */, int* left__ANONYMOUS_s1000/* len = 4 */, int* locvars__ANONYMOUS_s1001/* len = 3 */, int& malloc_budget__ANONYMOUS_s1149, int& newer_min__ANONYMOUS_s1632, int& newer_sll__ANONYMOUS_s1633, int* next__ANONYMOUS_s970/* len = 4 */, int& old_min__ANONYMOUS_s833, int& old_sll__ANONYMOUS_s834, bool* p_history__ANONYMOUS_s1079/* len = 4 * 4 */, int& ranking__ANONYMOUS_s1101, int& ret__ANONYMOUS_s835, int* right__ANONYMOUS_s1002/* len = 4 */, int* supernext__ANONYMOUS_s971/* len = 4 */, bool* symbolic__ANONYMOUS_s972/* len = 4 */, int& ts__ANONYMOUS_s973) {
  int*  new_key= new int [3]; CopyArr<int >(new_key,new_key_11, 3, 3);
  int*  new_supernext= new int [3]; CopyArr<int >(new_supernext,new_supernext_10, 3, 3);
  int*  new_next= new int [3]; CopyArr<int >(new_next,new_next_9, 3, 3);
  bool*  new_symbolic= new bool [3]; CopyArr<bool >(new_symbolic,new_symbolic_8, 3, 3);
  int  ret_value=ret_value_7;
  bool*  lactive= new bool [3]; CopyArr<bool >(lactive,lactive_6, 3, 3);
  bool*  lsymbolic= new bool [3]; CopyArr<bool >(lsymbolic,lsymbolic_5, 3, 3);
  int*  lkey= new int [3]; CopyArr<int >(lkey,lkey_4, 3, 3);
  int*  lsupernext= new int [3]; CopyArr<int >(lsupernext,lsupernext_3, 3, 3);
  int*  lnext= new int [3]; CopyArr<int >(lnext,lnext_2, 3, 3);
  int*  lintvars= new int [2]; CopyArr<int >(lintvars,lintvars_1, 2, 2);
  int*  llocvars= new int [2]; CopyArr<int >(llocvars,llocvars_0, 2, 2);
  int*  lleft= new int [3]; CopyArr<int >(lleft,NULL, 3, 0);
  int*  lright= new int [3]; CopyArr<int >(lright,NULL, 3, 0);
  init(llocvars, lintvars, lnext, lsupernext, lleft, lright, lkey, lsymbolic, lactive, active__ANONYMOUS_s969, intvars__ANONYMOUS_s1131, key__ANONYMOUS_s1108, left__ANONYMOUS_s1000, locvars__ANONYMOUS_s1001, next__ANONYMOUS_s970, right__ANONYMOUS_s1002, supernext__ANONYMOUS_s971, symbolic__ANONYMOUS_s972);
  bool  _pac_sc_s52_s54=0;
  basic_assumptions(_pac_sc_s52_s54, active__ANONYMOUS_s969, key__ANONYMOUS_s1108, left__ANONYMOUS_s1000, locvars__ANONYMOUS_s1001, next__ANONYMOUS_s970, right__ANONYMOUS_s1002, supernext__ANONYMOUS_s971, symbolic__ANONYMOUS_s972);
  bool  _pac_sc_s52=0;
  _pac_sc_s52 = _pac_sc_s52_s54;
  if (_pac_sc_s52_s54) {
    bool  _pac_sc_s52_s56=0;
    basic_axioms(_pac_sc_s52_s56, supernext__ANONYMOUS_s971, ts__ANONYMOUS_s973);
    _pac_sc_s52 = _pac_sc_s52_s56;
  }
  if(!(_pac_sc_s52)){ throw AssumptionFailedException();  };
  bool  _out_s58=0;
  pre_cond_list_find_min_rec(2, _out_s58, active__ANONYMOUS_s969, locvars__ANONYMOUS_s1001, next__ANONYMOUS_s970, supernext__ANONYMOUS_s971, symbolic__ANONYMOUS_s972);
  if(!(_out_s58)){ throw AssumptionFailedException();  };
  snapshot_list_find_min_rec(2, old_sll__ANONYMOUS_s834, old_min__ANONYMOUS_s833, active__ANONYMOUS_s969, history__ANONYMOUS_s977, key__ANONYMOUS_s1108, locvars__ANONYMOUS_s1001, next__ANONYMOUS_s970, p_history__ANONYMOUS_s1079, supernext__ANONYMOUS_s971, symbolic__ANONYMOUS_s972, ts__ANONYMOUS_s973);
  ranking_snapshot(1, 2, 1, active__ANONYMOUS_s969, history__ANONYMOUS_s977, key__ANONYMOUS_s1108, locvars__ANONYMOUS_s1001, next__ANONYMOUS_s970, p_history__ANONYMOUS_s1079, ranking__ANONYMOUS_s1101, supernext__ANONYMOUS_s971, symbolic__ANONYMOUS_s972, ts__ANONYMOUS_s973);
  bool  _out_s60=0;
  basic_cond0(2, 2, _out_s60, active__ANONYMOUS_s969, error_flag__ANONYMOUS_s1078, fake_unfold__ANONYMOUS_s999, fake_unfold_to__ANONYMOUS_s1617, history__ANONYMOUS_s977, intvars__ANONYMOUS_s1131, key__ANONYMOUS_s1108, locvars__ANONYMOUS_s1001, next__ANONYMOUS_s970, p_history__ANONYMOUS_s1079, supernext__ANONYMOUS_s971, symbolic__ANONYMOUS_s972, ts__ANONYMOUS_s973);
  if (_out_s60) {
    statement0(1, 2, 1, 0, active__ANONYMOUS_s969, error_flag__ANONYMOUS_s1078, fake_unfold__ANONYMOUS_s999, history__ANONYMOUS_s977, intvars__ANONYMOUS_s1131, key__ANONYMOUS_s1108, left__ANONYMOUS_s1000, locvars__ANONYMOUS_s1001, malloc_budget__ANONYMOUS_s1149, next__ANONYMOUS_s970, p_history__ANONYMOUS_s1079, right__ANONYMOUS_s1002, supernext__ANONYMOUS_s971, symbolic__ANONYMOUS_s972, ts__ANONYMOUS_s973);
    statement1(1, 2, 1, 0, active__ANONYMOUS_s969, error_flag__ANONYMOUS_s1078, fake_unfold__ANONYMOUS_s999, history__ANONYMOUS_s977, intvars__ANONYMOUS_s1131, key__ANONYMOUS_s1108, left__ANONYMOUS_s1000, locvars__ANONYMOUS_s1001, malloc_budget__ANONYMOUS_s1149, next__ANONYMOUS_s970, p_history__ANONYMOUS_s1079, right__ANONYMOUS_s1002, supernext__ANONYMOUS_s971, symbolic__ANONYMOUS_s972, ts__ANONYMOUS_s973);
  } else {
    statement2(1, 2, 1, 0, active__ANONYMOUS_s969, error_flag__ANONYMOUS_s1078, fake_unfold__ANONYMOUS_s999, history__ANONYMOUS_s977, intvars__ANONYMOUS_s1131, key__ANONYMOUS_s1108, left__ANONYMOUS_s1000, locvars__ANONYMOUS_s1001, malloc_budget__ANONYMOUS_s1149, next__ANONYMOUS_s970, p_history__ANONYMOUS_s1079, right__ANONYMOUS_s1002, supernext__ANONYMOUS_s971, symbolic__ANONYMOUS_s972, ts__ANONYMOUS_s973);
    int  rank_var_for_call_0_s62=0;
    loc_id0(2, rank_var_for_call_0_s62);
    bool  _out_s64=0;
    ranking_decreases(1, rank_var_for_call_0_s62, 1, _out_s64, active__ANONYMOUS_s969, history__ANONYMOUS_s977, key__ANONYMOUS_s1108, locvars__ANONYMOUS_s1001, next__ANONYMOUS_s970, p_history__ANONYMOUS_s1079, ranking__ANONYMOUS_s1101, supernext__ANONYMOUS_s971, symbolic__ANONYMOUS_s972, ts__ANONYMOUS_s973);
    assertPost(_out_s64, error_flag__ANONYMOUS_s1078);
    int  _out_s66=0;
    int_id0(2, _out_s66);
    rec_list_find_min_rec(rank_var_for_call_0_s62, _out_s66, ret_value, new_symbolic, new_next, new_supernext, new_key, active__ANONYMOUS_s969, error_flag__ANONYMOUS_s1078, history__ANONYMOUS_s977, intvars__ANONYMOUS_s1131, key__ANONYMOUS_s1108, locvars__ANONYMOUS_s1001, newer_min__ANONYMOUS_s1632, newer_sll__ANONYMOUS_s1633, next__ANONYMOUS_s970, p_history__ANONYMOUS_s1079, supernext__ANONYMOUS_s971, symbolic__ANONYMOUS_s972, ts__ANONYMOUS_s973);
    bool  _out_s68=0;
    basic_cond1(2, 2, _out_s68, active__ANONYMOUS_s969, error_flag__ANONYMOUS_s1078, fake_unfold__ANONYMOUS_s999, fake_unfold_to__ANONYMOUS_s1617, history__ANONYMOUS_s977, intvars__ANONYMOUS_s1131, key__ANONYMOUS_s1108, locvars__ANONYMOUS_s1001, next__ANONYMOUS_s970, p_history__ANONYMOUS_s1079, supernext__ANONYMOUS_s971, symbolic__ANONYMOUS_s972, ts__ANONYMOUS_s973);
    if (_out_s68) {
      statement3(1, 2, 1, 0, active__ANONYMOUS_s969, error_flag__ANONYMOUS_s1078, fake_unfold__ANONYMOUS_s999, history__ANONYMOUS_s977, intvars__ANONYMOUS_s1131, key__ANONYMOUS_s1108, left__ANONYMOUS_s1000, locvars__ANONYMOUS_s1001, malloc_budget__ANONYMOUS_s1149, next__ANONYMOUS_s970, p_history__ANONYMOUS_s1079, right__ANONYMOUS_s1002, supernext__ANONYMOUS_s971, symbolic__ANONYMOUS_s972, ts__ANONYMOUS_s973);
    }
  }
  ret_int(0, ret__ANONYMOUS_s835);
  bool  _out_s70=0;
  post_cond_list_find_min_rec(ret__ANONYMOUS_s835, 2, old_min__ANONYMOUS_s833, _out_s70, active__ANONYMOUS_s969, intvars__ANONYMOUS_s1131, locvars__ANONYMOUS_s1001, next__ANONYMOUS_s970, supernext__ANONYMOUS_s971, symbolic__ANONYMOUS_s972);
  assertPost(_out_s70, error_flag__ANONYMOUS_s1078);
}
void init(int* llocvars/* len = 2 */, int* lintvars/* len = 2 */, int* lnext/* len = 3 */, int* lsupernext/* len = 3 */, int* lleft/* len = 3 */, int* lright/* len = 3 */, int* lkey/* len = 3 */, bool* lsymbolic/* len = 3 */, bool* lactive/* len = 3 */, bool* active__ANONYMOUS_s748/* len = 4 */, int* intvars__ANONYMOUS_s749/* len = 2 */, int* key__ANONYMOUS_s750/* len = 4 */, int* left__ANONYMOUS_s751/* len = 4 */, int* locvars__ANONYMOUS_s752/* len = 3 */, int* next__ANONYMOUS_s753/* len = 4 */, int* right__ANONYMOUS_s754/* len = 4 */, int* supernext__ANONYMOUS_s755/* len = 4 */, bool* symbolic__ANONYMOUS_s756/* len = 4 */) {
  CopyArr<int >((locvars__ANONYMOUS_s752+ 1),llocvars, 2, 2);
  CopyArr<int >(intvars__ANONYMOUS_s749,lintvars, 2, 2);
  CopyArr<int >((next__ANONYMOUS_s753+ 1),lnext, 3, 3);
  CopyArr<int >((supernext__ANONYMOUS_s755+ 1),lsupernext, 3, 3);
  CopyArr<int >((left__ANONYMOUS_s751+ 1),lleft, 3, 3);
  CopyArr<int >((right__ANONYMOUS_s754+ 1),lright, 3, 3);
  CopyArr<int >((key__ANONYMOUS_s750+ 1),lkey, 3, 3);
  CopyArr<bool >((symbolic__ANONYMOUS_s756+ 1),lsymbolic, 3, 3);
  CopyArr<bool >((active__ANONYMOUS_s748+ 1),lactive, 3, 3);
  (active__ANONYMOUS_s748[0]) = 1;
}
void basic_assumptions(bool& _out, bool* active__ANONYMOUS_s854/* len = 4 */, int* key__ANONYMOUS_s855/* len = 4 */, int* left__ANONYMOUS_s856/* len = 4 */, int* locvars__ANONYMOUS_s857/* len = 3 */, int* next__ANONYMOUS_s858/* len = 4 */, int* right__ANONYMOUS_s859/* len = 4 */, int* supernext__ANONYMOUS_s860/* len = 4 */, bool* symbolic__ANONYMOUS_s861/* len = 4 */) {
  _out = 0;
  _out = (((((((((locvars__ANONYMOUS_s857[0])) == (0)) && (((next__ANONYMOUS_s858[0])) == (0))) && (((supernext__ANONYMOUS_s860[0])) == (0))) && (((left__ANONYMOUS_s856[0])) == (0))) && (((right__ANONYMOUS_s859[0])) == (0))) && (((key__ANONYMOUS_s855[0])) == (0))) && !((symbolic__ANONYMOUS_s861[0]))) && (active__ANONYMOUS_s854[0]);
  int  idx=2;
  while (((idx) <= (2)) && _out) {
    _out = !((active__ANONYMOUS_s854[idx]));
    idx = idx + 1;
  }
  return;
}
void basic_axioms(bool& _out, int* supernext__ANONYMOUS_s881/* len = 4 */, int& ts__ANONYMOUS_s882) {
  _out = 0;
  int  _pac_sc_s289_s291=0;
  len(0, ts__ANONYMOUS_s882, _pac_sc_s289_s291);
  bool  _pac_sc_s289=0;
  _pac_sc_s289 = (_pac_sc_s289_s291) == (0);
  if (_pac_sc_s289) {
    int  _pac_sc_s289_s293=0;
    min(0, ts__ANONYMOUS_s882, _pac_sc_s289_s293);
    _pac_sc_s289 = (_pac_sc_s289_s293) == (7);
  }
  bool  _pac_sc_s288=_pac_sc_s289;
  if (_pac_sc_s289) {
    int  _pac_sc_s288_s295=0;
    max(0, ts__ANONYMOUS_s882, _pac_sc_s288_s295);
    _pac_sc_s288 = (_pac_sc_s288_s295) == (0);
  }
  _out = _pac_sc_s288;
  int  idx=1;
  while (((idx) < (4)) && _out) {
    bool  _pac_sc_s298=((supernext__ANONYMOUS_s881[idx])) != (0);
    if (_pac_sc_s298) {
      int  _pac_sc_s298_s300=0;
      len(idx, ts__ANONYMOUS_s882, _pac_sc_s298_s300);
      _pac_sc_s298 = (_pac_sc_s298_s300) > (0);
    }
    bool  _pac_sc_s297=_pac_sc_s298;
    if (_pac_sc_s298) {
      int  _pac_sc_s297_s302=0;
      min(idx, ts__ANONYMOUS_s882, _pac_sc_s297_s302);
      int  _pac_sc_s297_s304=0;
      max(idx, ts__ANONYMOUS_s882, _pac_sc_s297_s304);
      _pac_sc_s297 = (_pac_sc_s297_s302) <= (_pac_sc_s297_s304);
    }
    bool  _pac_sc_s296=_pac_sc_s297;
    if (_pac_sc_s297) {
      int  _pac_sc_s296_s306=0;
      minseg(idx, ts__ANONYMOUS_s882, _pac_sc_s296_s306);
      int  _pac_sc_s296_s308=0;
      maxseg(idx, ts__ANONYMOUS_s882, _pac_sc_s296_s308);
      _pac_sc_s296 = (_pac_sc_s296_s306) <= (_pac_sc_s296_s308);
    }
    _out = _pac_sc_s296;
    idx = idx + 1;
  }
  return;
}
void pre_cond_list_find_min_rec(int x, bool& _out, bool* active__ANONYMOUS_s1611/* len = 4 */, int* locvars__ANONYMOUS_s1646/* len = 3 */, int* next__ANONYMOUS_s1612/* len = 4 */, int* supernext__ANONYMOUS_s1613/* len = 4 */, bool* symbolic__ANONYMOUS_s1614/* len = 4 */) {
  _out = 0;
  bool  _out_s247=0;
  tree_inv(x, _out_s247, active__ANONYMOUS_s1611, locvars__ANONYMOUS_s1646, next__ANONYMOUS_s1612, supernext__ANONYMOUS_s1613, symbolic__ANONYMOUS_s1614);
  _out = _out_s247;
  return;
}
void snapshot_list_find_min_rec(int x, int& osll, int& omin, bool* active__ANONYMOUS_s1596/* len = 4 */, bool* history__ANONYMOUS_s1551/* len = 4 * 4 */, int* key__ANONYMOUS_s1597/* len = 4 */, int* locvars__ANONYMOUS_s831/* len = 3 */, int* next__ANONYMOUS_s1598/* len = 4 */, bool* p_history__ANONYMOUS_s1599/* len = 4 * 4 */, int* supernext__ANONYMOUS_s1600/* len = 4 */, bool* symbolic__ANONYMOUS_s1601/* len = 4 */, int& ts__ANONYMOUS_s1552) {
  int  omin_s245=0;
  min_comp((locvars__ANONYMOUS_s831[x]), omin_s245, active__ANONYMOUS_s1596, history__ANONYMOUS_s1551, key__ANONYMOUS_s1597, next__ANONYMOUS_s1598, p_history__ANONYMOUS_s1599, supernext__ANONYMOUS_s1600, symbolic__ANONYMOUS_s1601, ts__ANONYMOUS_s1552);
  omin = omin_s245;
}
void ranking_snapshot(int rec, int v, int v2, bool* active__ANONYMOUS_s1434/* len = 4 */, bool* history__ANONYMOUS_s1528/* len = 4 * 4 */, int* key__ANONYMOUS_s1435/* len = 4 */, int* locvars__ANONYMOUS_s916/* len = 3 */, int* next__ANONYMOUS_s1436/* len = 4 */, bool* p_history__ANONYMOUS_s1529/* len = 4 * 4 */, int& ranking__ANONYMOUS_s917, int* supernext__ANONYMOUS_s1437/* len = 4 */, bool* symbolic__ANONYMOUS_s1438/* len = 4 */, int& ts__ANONYMOUS_s1439) {
  assert (((v) > (0)) && ((v) < (3)));;
  assert (((v2) > (0)) && ((v2) < (3)));;
  if ((((rec) == (1)) || ((rec) == (2))) || ((rec) == (3))) {
    if (!((((locvars__ANONYMOUS_s916[v])) >= (0)) && (((locvars__ANONYMOUS_s916[v])) < (4)))) {
      return;
    } else {
      bool  _out_s271=0;
      treeness((locvars__ANONYMOUS_s916[v]), _out_s271, active__ANONYMOUS_s1434, next__ANONYMOUS_s1436, supernext__ANONYMOUS_s1437, symbolic__ANONYMOUS_s1438);
      if (!(_out_s271)) {
        return;
      } else {
        if ((rec) == (1)) {
          int  ranking_s273=0;
          len_comp((locvars__ANONYMOUS_s916[v]), ranking_s273, active__ANONYMOUS_s1434, history__ANONYMOUS_s1528, next__ANONYMOUS_s1436, p_history__ANONYMOUS_s1529, supernext__ANONYMOUS_s1437, symbolic__ANONYMOUS_s1438, ts__ANONYMOUS_s1439);
          ranking__ANONYMOUS_s917 = ranking_s273;
        } else {
          if ((rec) == (2)) {
            int  ranking_s275=0;
            max_comp((locvars__ANONYMOUS_s916[v]), ranking_s275, active__ANONYMOUS_s1434, history__ANONYMOUS_s1528, key__ANONYMOUS_s1435, next__ANONYMOUS_s1436, p_history__ANONYMOUS_s1529, supernext__ANONYMOUS_s1437, symbolic__ANONYMOUS_s1438, ts__ANONYMOUS_s1439);
            ranking__ANONYMOUS_s917 = ranking_s275;
          } else {
            if ((rec) == (3)) {
              int  ranking_s277=0;
              min_comp((locvars__ANONYMOUS_s916[v]), ranking_s277, active__ANONYMOUS_s1434, history__ANONYMOUS_s1528, key__ANONYMOUS_s1435, next__ANONYMOUS_s1436, p_history__ANONYMOUS_s1529, supernext__ANONYMOUS_s1437, symbolic__ANONYMOUS_s1438, ts__ANONYMOUS_s1439);
              ranking__ANONYMOUS_s917 = ranking_s277;
            }
          }
        }
      }
    }
  } else {
    if ((((rec) == (5)) || ((rec) == (6))) || ((rec) == (7))) {
      if (!((((locvars__ANONYMOUS_s916[v])) >= (0)) && (((locvars__ANONYMOUS_s916[v])) < (4)))) {
        return;
      } else {
        if (!((((locvars__ANONYMOUS_s916[v2])) >= (0)) && (((locvars__ANONYMOUS_s916[v2])) < (4)))) {
          return;
        } else {
          bool  _out_s279=0;
          p_treeness((locvars__ANONYMOUS_s916[v]), (locvars__ANONYMOUS_s916[v2]), _out_s279, active__ANONYMOUS_s1434, next__ANONYMOUS_s1436, supernext__ANONYMOUS_s1437, symbolic__ANONYMOUS_s1438);
          if (!(_out_s279)) {
            return;
          }
        }
      }
      if ((rec) == (5)) {
        int  ranking_s281=0;
        lenseg_comp((locvars__ANONYMOUS_s916[v]), (locvars__ANONYMOUS_s916[v2]), ranking_s281, active__ANONYMOUS_s1434, history__ANONYMOUS_s1528, next__ANONYMOUS_s1436, p_history__ANONYMOUS_s1529, supernext__ANONYMOUS_s1437, symbolic__ANONYMOUS_s1438, ts__ANONYMOUS_s1439);
        ranking__ANONYMOUS_s917 = ranking_s281;
      } else {
        if ((rec) == (6)) {
          int  ranking_s283=0;
          maxseg_comp((locvars__ANONYMOUS_s916[v]), (locvars__ANONYMOUS_s916[v2]), ranking_s283, active__ANONYMOUS_s1434, history__ANONYMOUS_s1528, key__ANONYMOUS_s1435, next__ANONYMOUS_s1436, p_history__ANONYMOUS_s1529, supernext__ANONYMOUS_s1437, symbolic__ANONYMOUS_s1438, ts__ANONYMOUS_s1439);
          ranking__ANONYMOUS_s917 = ranking_s283;
        } else {
          if ((rec) == (7)) {
            int  ranking_s285=0;
            minseg_comp((locvars__ANONYMOUS_s916[v]), (locvars__ANONYMOUS_s916[v2]), ranking_s285, active__ANONYMOUS_s1434, history__ANONYMOUS_s1528, key__ANONYMOUS_s1435, next__ANONYMOUS_s1436, p_history__ANONYMOUS_s1529, supernext__ANONYMOUS_s1437, symbolic__ANONYMOUS_s1438, ts__ANONYMOUS_s1439);
            ranking__ANONYMOUS_s917 = ranking_s285;
          }
        }
      }
    }
  }
}
void basic_cond0(int locrange, int intrange, bool& _out, bool* active__ANONYMOUS_s1330/* len = 4 */, bool& error_flag__ANONYMOUS_s996, int& fake_unfold__ANONYMOUS_s1331, int& fake_unfold_to__ANONYMOUS_s1332, bool* history__ANONYMOUS_s1159/* len = 4 * 4 */, int* intvars__ANONYMOUS_s1333/* len = 2 */, int* key__ANONYMOUS_s1334/* len = 4 */, int* locvars__ANONYMOUS_s1335/* len = 3 */, int* next__ANONYMOUS_s1336/* len = 4 */, bool* p_history__ANONYMOUS_s1288/* len = 4 * 4 */, int* supernext__ANONYMOUS_s1532/* len = 4 */, bool* symbolic__ANONYMOUS_s1337/* len = 4 */, int& ts__ANONYMOUS_s1160) {
  _out = 0;
  assert ((1) < (locrange));;
  assert ((0) < ((locrange + 1)));;
  bool  _out_s219=0;
  locvar_eq(2, 0, _out_s219, locvars__ANONYMOUS_s1335);
  _out = _out_s219;
  return;
}
void statement0(int locrange, int intrange, int locrange2, int intrange2, bool* active__ANONYMOUS_s985/* len = 4 */, bool& error_flag__ANONYMOUS_s1047, int& fake_unfold__ANONYMOUS_s986, bool* history__ANONYMOUS_s1111/* len = 4 * 4 */, int* intvars__ANONYMOUS_s987/* len = 2 */, int* key__ANONYMOUS_s988/* len = 4 */, int* left__ANONYMOUS_s1662/* len = 4 */, int* locvars__ANONYMOUS_s989/* len = 3 */, int& malloc_budget__ANONYMOUS_s1236, int* next__ANONYMOUS_s1126/* len = 4 */, bool* p_history__ANONYMOUS_s1248/* len = 4 * 4 */, int* right__ANONYMOUS_s1663/* len = 4 */, int* supernext__ANONYMOUS_s1127/* len = 4 */, bool* symbolic__ANONYMOUS_s990/* len = 4 */, int& ts__ANONYMOUS_s991) {
  assert ((0) < (locrange));;
  assert ((1) < ((locrange + locrange2)));;
  assert (((locrange + locrange2)) > (0));;
  assert (((intrange + intrange2)) > (0));;
  assert ((0) < ((intrange + intrange2)));;
  intMutate(2, 0, active__ANONYMOUS_s985, error_flag__ANONYMOUS_s1047, fake_unfold__ANONYMOUS_s986, history__ANONYMOUS_s1111, intvars__ANONYMOUS_s987, key__ANONYMOUS_s988, locvars__ANONYMOUS_s989, next__ANONYMOUS_s1126, p_history__ANONYMOUS_s1248, symbolic__ANONYMOUS_s990, ts__ANONYMOUS_s991);
}
void statement1(int locrange, int intrange, int locrange2, int intrange2, bool* active__ANONYMOUS_s1072/* len = 4 */, bool& error_flag__ANONYMOUS_s1135, int& fake_unfold__ANONYMOUS_s1559, bool* history__ANONYMOUS_s950/* len = 4 * 4 */, int* intvars__ANONYMOUS_s1408/* len = 2 */, int* key__ANONYMOUS_s1073/* len = 4 */, int* left__ANONYMOUS_s1668/* len = 4 */, int* locvars__ANONYMOUS_s1074/* len = 3 */, int& malloc_budget__ANONYMOUS_s1075, int* next__ANONYMOUS_s1076/* len = 4 */, bool* p_history__ANONYMOUS_s1136/* len = 4 * 4 */, int* right__ANONYMOUS_s1669/* len = 4 */, int* supernext__ANONYMOUS_s1137/* len = 4 */, bool* symbolic__ANONYMOUS_s1077/* len = 4 */, int& ts__ANONYMOUS_s951) {
  assert ((0) < (locrange));;
  assert ((1) < ((locrange + locrange2)));;
  assert ((intrange) > (0));;
  assert ((0) < (intrange));;
  assert ((0) < ((intrange + intrange2)));;
  intVarAssign(0, 0, 7, intvars__ANONYMOUS_s1408);
}
void statement2(int locrange, int intrange, int locrange2, int intrange2, bool* active__ANONYMOUS_s1117/* len = 4 */, bool& error_flag__ANONYMOUS_s966, int& fake_unfold__ANONYMOUS_s1118, bool* history__ANONYMOUS_s1472/* len = 4 * 4 */, int* intvars__ANONYMOUS_s1119/* len = 2 */, int* key__ANONYMOUS_s1120/* len = 4 */, int* left__ANONYMOUS_s1216/* len = 4 */, int* locvars__ANONYMOUS_s1121/* len = 3 */, int& malloc_budget__ANONYMOUS_s1377, int* next__ANONYMOUS_s1217/* len = 4 */, bool* p_history__ANONYMOUS_s1017/* len = 4 * 4 */, int* right__ANONYMOUS_s1218/* len = 4 */, int* supernext__ANONYMOUS_s1473/* len = 4 */, bool* symbolic__ANONYMOUS_s1122/* len = 4 */, int& ts__ANONYMOUS_s1018) {
  assert ((0) < (locrange));;
  assert ((1) < ((locrange + locrange2)));;
  assert ((locrange) > (0));;
  locderef2var(2, 1, active__ANONYMOUS_s1117, error_flag__ANONYMOUS_s966, history__ANONYMOUS_s1472, key__ANONYMOUS_s1120, locvars__ANONYMOUS_s1121, malloc_budget__ANONYMOUS_s1377, next__ANONYMOUS_s1217, p_history__ANONYMOUS_s1017, supernext__ANONYMOUS_s1473, symbolic__ANONYMOUS_s1122, ts__ANONYMOUS_s1018);
}
void loc_id0(int locrange, int& _out) {
  _out = 0;
  assert ((0) < (locrange));;
  _out = 1;
  return;
}
void ranking_decreases(int rec, int v, int v2, bool& _out, bool* active__ANONYMOUS_s1387/* len = 4 */, bool* history__ANONYMOUS_s1385/* len = 4 * 4 */, int* key__ANONYMOUS_s1388/* len = 4 */, int* locvars__ANONYMOUS_s884/* len = 3 */, int* next__ANONYMOUS_s1389/* len = 4 */, bool* p_history__ANONYMOUS_s964/* len = 4 * 4 */, int& ranking__ANONYMOUS_s885, int* supernext__ANONYMOUS_s1390/* len = 4 */, bool* symbolic__ANONYMOUS_s1391/* len = 4 */, int& ts__ANONYMOUS_s965) {
  _out = 0;
  assert (((v) > (0)) && ((v) < (3)));;
  assert (((v2) > (0)) && ((v2) < (3)));;
  int  new_ranking=-1;
  if ((((rec) == (1)) || ((rec) == (2))) || ((rec) == (3))) {
    if (!((((locvars__ANONYMOUS_s884[v])) >= (0)) && (((locvars__ANONYMOUS_s884[v])) < (4)))) {
      _out = (ranking__ANONYMOUS_s885) == (0);
      return;
    } else {
      if ((rec) == (1)) {
        int  new_ranking_s249=0;
        len_comp((locvars__ANONYMOUS_s884[v]), new_ranking_s249, active__ANONYMOUS_s1387, history__ANONYMOUS_s1385, next__ANONYMOUS_s1389, p_history__ANONYMOUS_s964, supernext__ANONYMOUS_s1390, symbolic__ANONYMOUS_s1391, ts__ANONYMOUS_s965);
        new_ranking = new_ranking_s249;
      } else {
        if ((rec) == (2)) {
          int  new_ranking_s251=0;
          max_comp((locvars__ANONYMOUS_s884[v]), new_ranking_s251, active__ANONYMOUS_s1387, history__ANONYMOUS_s1385, key__ANONYMOUS_s1388, next__ANONYMOUS_s1389, p_history__ANONYMOUS_s964, supernext__ANONYMOUS_s1390, symbolic__ANONYMOUS_s1391, ts__ANONYMOUS_s965);
          new_ranking = new_ranking_s251;
        } else {
          if ((rec) == (3)) {
            int  new_ranking_s253=0;
            min_comp((locvars__ANONYMOUS_s884[v]), new_ranking_s253, active__ANONYMOUS_s1387, history__ANONYMOUS_s1385, key__ANONYMOUS_s1388, next__ANONYMOUS_s1389, p_history__ANONYMOUS_s964, supernext__ANONYMOUS_s1390, symbolic__ANONYMOUS_s1391, ts__ANONYMOUS_s965);
            new_ranking = new_ranking_s253;
          }
        }
      }
    }
  } else {
    if ((((rec) == (5)) || ((rec) == (6))) || ((rec) == (7))) {
      if (!((((locvars__ANONYMOUS_s884[v])) >= (0)) && (((locvars__ANONYMOUS_s884[v])) < (4)))) {
        _out = (ranking__ANONYMOUS_s885) == (0);
        return;
      } else {
        if (!((((locvars__ANONYMOUS_s884[v2])) >= (0)) && (((locvars__ANONYMOUS_s884[v2])) < (4)))) {
          _out = (ranking__ANONYMOUS_s885) == (0);
          return;
        } else {
          if ((rec) == (5)) {
            int  new_ranking_s255=0;
            lenseg_comp((locvars__ANONYMOUS_s884[v]), (locvars__ANONYMOUS_s884[v2]), new_ranking_s255, active__ANONYMOUS_s1387, history__ANONYMOUS_s1385, next__ANONYMOUS_s1389, p_history__ANONYMOUS_s964, supernext__ANONYMOUS_s1390, symbolic__ANONYMOUS_s1391, ts__ANONYMOUS_s965);
            new_ranking = new_ranking_s255;
          } else {
            if ((rec) == (6)) {
              int  new_ranking_s257=0;
              maxseg_comp((locvars__ANONYMOUS_s884[v]), (locvars__ANONYMOUS_s884[v2]), new_ranking_s257, active__ANONYMOUS_s1387, history__ANONYMOUS_s1385, key__ANONYMOUS_s1388, next__ANONYMOUS_s1389, p_history__ANONYMOUS_s964, supernext__ANONYMOUS_s1390, symbolic__ANONYMOUS_s1391, ts__ANONYMOUS_s965);
              new_ranking = new_ranking_s257;
            } else {
              if ((rec) == (7)) {
                int  new_ranking_s259=0;
                minseg_comp((locvars__ANONYMOUS_s884[v]), (locvars__ANONYMOUS_s884[v2]), new_ranking_s259, active__ANONYMOUS_s1387, history__ANONYMOUS_s1385, key__ANONYMOUS_s1388, next__ANONYMOUS_s1389, p_history__ANONYMOUS_s964, supernext__ANONYMOUS_s1390, symbolic__ANONYMOUS_s1391, ts__ANONYMOUS_s965);
                new_ranking = new_ranking_s259;
              }
            }
          }
        }
      }
    }
  }
  _out = ((ranking__ANONYMOUS_s885) > (new_ranking)) && ((new_ranking) >= (0));
  return;
}
void assertPost(bool b, bool& error_flag__ANONYMOUS_s824) {
  if (error_flag__ANONYMOUS_s824) {
    return;
  } else {
    assert (b);;
  }
}
void int_id0(int intrange, int& _out) {
  _out = 0;
  assert ((0) < (intrange));;
  _out = 0;
  return;
}
void rec_list_find_min_rec(int x, int recret, int& rv, bool* new_symbolic/* len = 3 */, int* new_next/* len = 3 */, int* new_supernext/* len = 3 */, int* new_key/* len = 3 */, bool* active__ANONYMOUS_s1293/* len = 4 */, bool& error_flag__ANONYMOUS_s1194, bool* history__ANONYMOUS_s1313/* len = 4 * 4 */, int* intvars__ANONYMOUS_s718/* len = 2 */, int* key__ANONYMOUS_s1294/* len = 4 */, int* locvars__ANONYMOUS_s719/* len = 3 */, int& newer_min__ANONYMOUS_s720, int& newer_sll__ANONYMOUS_s721, int* next__ANONYMOUS_s1295/* len = 4 */, bool* p_history__ANONYMOUS_s1530/* len = 4 * 4 */, int* supernext__ANONYMOUS_s1296/* len = 4 */, bool* symbolic__ANONYMOUS_s1297/* len = 4 */, int& ts__ANONYMOUS_s1298) {
  bool  _out_s239=0;
  pre_cond_list_find_min_rec(x, _out_s239, active__ANONYMOUS_s1293, locvars__ANONYMOUS_s719, next__ANONYMOUS_s1295, supernext__ANONYMOUS_s1296, symbolic__ANONYMOUS_s1297);
  assertPost(_out_s239, error_flag__ANONYMOUS_s1194);
  snapshot_list_find_min_rec(x, newer_sll__ANONYMOUS_s721, newer_min__ANONYMOUS_s720, active__ANONYMOUS_s1293, history__ANONYMOUS_s1313, key__ANONYMOUS_s1294, locvars__ANONYMOUS_s719, next__ANONYMOUS_s1295, p_history__ANONYMOUS_s1530, supernext__ANONYMOUS_s1296, symbolic__ANONYMOUS_s1297, ts__ANONYMOUS_s1298);
  int  _out_s241=0;
  havoc((locvars__ANONYMOUS_s719[x]), new_symbolic, new_next, new_supernext, new_key, _out_s241, active__ANONYMOUS_s1293, history__ANONYMOUS_s1313, key__ANONYMOUS_s1294, next__ANONYMOUS_s1295, p_history__ANONYMOUS_s1530, supernext__ANONYMOUS_s1296, symbolic__ANONYMOUS_s1297, ts__ANONYMOUS_s1298);
  (intvars__ANONYMOUS_s718[recret]) = rv;
  bool  _out_s243=0;
  post_cond_list_find_min_rec(recret, x, newer_min__ANONYMOUS_s720, _out_s243, active__ANONYMOUS_s1293, intvars__ANONYMOUS_s718, locvars__ANONYMOUS_s719, next__ANONYMOUS_s1295, supernext__ANONYMOUS_s1296, symbolic__ANONYMOUS_s1297);
  assumePre(_out_s243, error_flag__ANONYMOUS_s1194);
}
void basic_cond1(int locrange, int intrange, bool& _out, bool* active__ANONYMOUS_s981/* len = 4 */, bool& error_flag__ANONYMOUS_s1502, int& fake_unfold__ANONYMOUS_s1658, int& fake_unfold_to__ANONYMOUS_s1659, bool* history__ANONYMOUS_s952/* len = 4 * 4 */, int* intvars__ANONYMOUS_s1660/* len = 2 */, int* key__ANONYMOUS_s1246/* len = 4 */, int* locvars__ANONYMOUS_s1471/* len = 3 */, int* next__ANONYMOUS_s982/* len = 4 */, bool* p_history__ANONYMOUS_s1247/* len = 4 * 4 */, int* supernext__ANONYMOUS_s983/* len = 4 */, bool* symbolic__ANONYMOUS_s984/* len = 4 */, int& ts__ANONYMOUS_s953) {
  _out = 0;
  assert ((1) < (locrange));;
  bool  d=1;
  if ((intrange) == (0)) {
    d = 0;
  }
  bool  res_s208=0;
  if (d) {
    assert ((intrange) > (0));;
    assert ((0) < (intrange));;
    bool  _pac_sc_s211_s213=0;
    locvar_eq(2, 0, _pac_sc_s211_s213, locvars__ANONYMOUS_s1471);
    bool  _pac_sc_s211=0;
    _pac_sc_s211 = !(_pac_sc_s211_s213);
    if (_pac_sc_s211) {
      bool  _pac_sc_s211_s215=0;
      intderef_lt_var(2, 0, _pac_sc_s211_s215, active__ANONYMOUS_s981, error_flag__ANONYMOUS_s1502, fake_unfold__ANONYMOUS_s1658, fake_unfold_to__ANONYMOUS_s1659, history__ANONYMOUS_s952, intvars__ANONYMOUS_s1660, key__ANONYMOUS_s1246, locvars__ANONYMOUS_s1471, next__ANONYMOUS_s982, p_history__ANONYMOUS_s1247, supernext__ANONYMOUS_s983, symbolic__ANONYMOUS_s984, ts__ANONYMOUS_s953);
      _pac_sc_s211 = _pac_sc_s211_s215;
    }
    res_s208 = _pac_sc_s211;
  } else {
    assert ((2) < ((locrange + 1)));;
    bool  _out_s219=0;
    locvar_eq(2, 2, _out_s219, locvars__ANONYMOUS_s1471);
    res_s208 = _out_s219;
  }
  _out = res_s208;
  return;
}
void statement3(int locrange, int intrange, int locrange2, int intrange2, bool* active__ANONYMOUS_s954/* len = 4 */, bool& error_flag__ANONYMOUS_s1523, int& fake_unfold__ANONYMOUS_s1531, bool* history__ANONYMOUS_s1215/* len = 4 * 4 */, int* intvars__ANONYMOUS_s1372/* len = 2 */, int* key__ANONYMOUS_s1023/* len = 4 */, int* left__ANONYMOUS_s1655/* len = 4 */, int* locvars__ANONYMOUS_s955/* len = 3 */, int& malloc_budget__ANONYMOUS_s956, int* next__ANONYMOUS_s957/* len = 4 */, bool* p_history__ANONYMOUS_s1309/* len = 4 * 4 */, int* right__ANONYMOUS_s1656/* len = 4 */, int* supernext__ANONYMOUS_s1373/* len = 4 */, bool* symbolic__ANONYMOUS_s958/* len = 4 */, int& ts__ANONYMOUS_s959) {
  assert ((0) < (locrange));;
  assert ((1) < ((locrange + locrange2)));;
  assert (((locrange + locrange2)) > (0));;
  assert ((intrange) > (0));;
  assert ((0) < (intrange));;
  intderef2var(2, 0, active__ANONYMOUS_s954, error_flag__ANONYMOUS_s1523, history__ANONYMOUS_s1215, intvars__ANONYMOUS_s1372, key__ANONYMOUS_s1023, locvars__ANONYMOUS_s955, next__ANONYMOUS_s957, p_history__ANONYMOUS_s1309, supernext__ANONYMOUS_s1373, symbolic__ANONYMOUS_s958, ts__ANONYMOUS_s959);
}
void ret_int(int v, int& ret__ANONYMOUS_s836) {
  assert ((v) >= (0));;
  assert ((v) < (2));;
  ret__ANONYMOUS_s836 = v;
}
void post_cond_list_find_min_rec(int r, int x, int& old_min_x, bool& _out, bool* active__ANONYMOUS_s1447/* len = 4 */, int* intvars__ANONYMOUS_s776/* len = 2 */, int* locvars__ANONYMOUS_s1448/* len = 3 */, int* next__ANONYMOUS_s1449/* len = 4 */, int* supernext__ANONYMOUS_s1450/* len = 4 */, bool* symbolic__ANONYMOUS_s1451/* len = 4 */) {
  _out = 0;
  bool  _pac_sc_s71_s73=0;
  tree_inv(x, _pac_sc_s71_s73, active__ANONYMOUS_s1447, locvars__ANONYMOUS_s1448, next__ANONYMOUS_s1449, supernext__ANONYMOUS_s1450, symbolic__ANONYMOUS_s1451);
  bool  _pac_sc_s71=0;
  _pac_sc_s71 = _pac_sc_s71_s73;
  if (_pac_sc_s71_s73) {
    _pac_sc_s71 = ((intvars__ANONYMOUS_s776[r])) == (old_min_x);
  }
  _out = _pac_sc_s71;
  return;
}
void tree_inv(int v, bool& _out, bool* active__ANONYMOUS_s1138/* len = 4 */, int* locvars__ANONYMOUS_s715/* len = 3 */, int* next__ANONYMOUS_s1139/* len = 4 */, int* supernext__ANONYMOUS_s1140/* len = 4 */, bool* symbolic__ANONYMOUS_s1141/* len = 4 */) {
  _out = 0;
  assert (((v) > (0)) && ((v) < (3)));;
  if (!((((locvars__ANONYMOUS_s715[v])) >= (0)) && (((locvars__ANONYMOUS_s715[v])) < (4)))) {
    _out = 0;
    return;
  } else {
    bool  _out_s75=0;
    treeness((locvars__ANONYMOUS_s715[v]), _out_s75, active__ANONYMOUS_s1138, next__ANONYMOUS_s1139, supernext__ANONYMOUS_s1140, symbolic__ANONYMOUS_s1141);
    _out = _out_s75;
    return;
  }
}
void min_comp(int l, int& _out, bool* active__ANONYMOUS_s1053/* len = 4 */, bool* history__ANONYMOUS_s1569/* len = 4 * 4 */, int* key__ANONYMOUS_s1054/* len = 4 */, int* next__ANONYMOUS_s1055/* len = 4 */, bool* p_history__ANONYMOUS_s1311/* len = 4 * 4 */, int* supernext__ANONYMOUS_s1056/* len = 4 */, bool* symbolic__ANONYMOUS_s1057/* len = 4 */, int& ts__ANONYMOUS_s1058) {
  _out = 0;
  int  _out_s131=0;
  min_recursive(l, 3, _out_s131, active__ANONYMOUS_s1053, history__ANONYMOUS_s1569, key__ANONYMOUS_s1054, next__ANONYMOUS_s1055, p_history__ANONYMOUS_s1311, supernext__ANONYMOUS_s1056, symbolic__ANONYMOUS_s1057, ts__ANONYMOUS_s1058);
  _out = _out_s131;
  return;
}
void treeness(int t, bool& _out, bool* active__ANONYMOUS_s1590/* len = 4 */, int* next__ANONYMOUS_s1591/* len = 4 */, int* supernext__ANONYMOUS_s1592/* len = 4 */, bool* symbolic__ANONYMOUS_s1593/* len = 4 */) {
  _out = 0;
  bool*  visited= new bool [4]; CopyArr<bool >(visited,0, 4);
  bool  _out_s77=0;
  check_p_treeness(t, 0, visited, 3, _out_s77, active__ANONYMOUS_s1590, next__ANONYMOUS_s1591, supernext__ANONYMOUS_s1592, symbolic__ANONYMOUS_s1593);
  _out = _out_s77;
  delete[] visited;
  return;
}
void len_comp(int l, int& _out, bool* active__ANONYMOUS_s1516/* len = 4 */, bool* history__ANONYMOUS_s1517/* len = 4 * 4 */, int* next__ANONYMOUS_s1518/* len = 4 */, bool* p_history__ANONYMOUS_s1524/* len = 4 * 4 */, int* supernext__ANONYMOUS_s1519/* len = 4 */, bool* symbolic__ANONYMOUS_s1520/* len = 4 */, int& ts__ANONYMOUS_s1521) {
  _out = 0;
  int  _out_s149=0;
  len_recursive(l, 0, 3, _out_s149, active__ANONYMOUS_s1516, history__ANONYMOUS_s1517, next__ANONYMOUS_s1518, p_history__ANONYMOUS_s1524, supernext__ANONYMOUS_s1519, symbolic__ANONYMOUS_s1520, ts__ANONYMOUS_s1521);
  _out = _out_s149;
  return;
}
void max_comp(int l, int& _out, bool* active__ANONYMOUS_s1170/* len = 4 */, bool* history__ANONYMOUS_s1647/* len = 4 * 4 */, int* key__ANONYMOUS_s1171/* len = 4 */, int* next__ANONYMOUS_s1172/* len = 4 */, bool* p_history__ANONYMOUS_s1661/* len = 4 * 4 */, int* supernext__ANONYMOUS_s1173/* len = 4 */, bool* symbolic__ANONYMOUS_s1174/* len = 4 */, int& ts__ANONYMOUS_s1175) {
  _out = 0;
  int  _out_s113=0;
  max_recursive(l, 3, _out_s113, active__ANONYMOUS_s1170, history__ANONYMOUS_s1647, key__ANONYMOUS_s1171, next__ANONYMOUS_s1172, p_history__ANONYMOUS_s1661, supernext__ANONYMOUS_s1173, symbolic__ANONYMOUS_s1174, ts__ANONYMOUS_s1175);
  _out = _out_s113;
  return;
}
void p_treeness(int t1, int t2, bool& _out, bool* active__ANONYMOUS_s1639/* len = 4 */, int* next__ANONYMOUS_s1640/* len = 4 */, int* supernext__ANONYMOUS_s1641/* len = 4 */, bool* symbolic__ANONYMOUS_s1642/* len = 4 */) {
  _out = 0;
  bool*  visited= new bool [4]; CopyArr<bool >(visited,0, 4);
  bool  _out_s287=0;
  check_p_treeness(t1, t2, visited, 3, _out_s287, active__ANONYMOUS_s1639, next__ANONYMOUS_s1640, supernext__ANONYMOUS_s1641, symbolic__ANONYMOUS_s1642);
  _out = _out_s287;
  delete[] visited;
  return;
}
void lenseg_comp(int l1, int l2, int& _out, bool* active__ANONYMOUS_s1503/* len = 4 */, bool* history__ANONYMOUS_s1504/* len = 4 * 4 */, int* next__ANONYMOUS_s1505/* len = 4 */, bool* p_history__ANONYMOUS_s1477/* len = 4 * 4 */, int* supernext__ANONYMOUS_s1506/* len = 4 */, bool* symbolic__ANONYMOUS_s1507/* len = 4 */, int& ts__ANONYMOUS_s1478) {
  _out = 0;
  int  _out_s265=0;
  len_recursive(l1, l2, 3, _out_s265, active__ANONYMOUS_s1503, history__ANONYMOUS_s1504, next__ANONYMOUS_s1505, p_history__ANONYMOUS_s1477, supernext__ANONYMOUS_s1506, symbolic__ANONYMOUS_s1507, ts__ANONYMOUS_s1478);
  _out = _out_s265;
  return;
}
void maxseg_comp(int l1, int l2, int& _out, bool* active__ANONYMOUS_s1320/* len = 4 */, bool* history__ANONYMOUS_s1321/* len = 4 * 4 */, int* key__ANONYMOUS_s1322/* len = 4 */, int* next__ANONYMOUS_s1323/* len = 4 */, bool* p_history__ANONYMOUS_s1324/* len = 4 * 4 */, int* supernext__ANONYMOUS_s1325/* len = 4 */, bool* symbolic__ANONYMOUS_s1326/* len = 4 */, int& ts__ANONYMOUS_s1327) {
  _out = 0;
  int  _out_s263=0;
  maxseg_recursive(l1, l2, 3, _out_s263, active__ANONYMOUS_s1320, history__ANONYMOUS_s1321, key__ANONYMOUS_s1322, next__ANONYMOUS_s1323, p_history__ANONYMOUS_s1324, supernext__ANONYMOUS_s1325, symbolic__ANONYMOUS_s1326, ts__ANONYMOUS_s1327);
  _out = _out_s263;
  return;
}
void minseg_comp(int l1, int l2, int& _out, bool* active__ANONYMOUS_s1479/* len = 4 */, bool* history__ANONYMOUS_s1615/* len = 4 * 4 */, int* key__ANONYMOUS_s1480/* len = 4 */, int* next__ANONYMOUS_s1481/* len = 4 */, bool* p_history__ANONYMOUS_s1664/* len = 4 * 4 */, int* supernext__ANONYMOUS_s1482/* len = 4 */, bool* symbolic__ANONYMOUS_s1483/* len = 4 */, int& ts__ANONYMOUS_s1484) {
  _out = 0;
  int  _out_s261=0;
  minseg_recursive(l1, l2, 3, _out_s261, active__ANONYMOUS_s1479, history__ANONYMOUS_s1615, key__ANONYMOUS_s1480, next__ANONYMOUS_s1481, p_history__ANONYMOUS_s1664, supernext__ANONYMOUS_s1482, symbolic__ANONYMOUS_s1483, ts__ANONYMOUS_s1484);
  _out = _out_s261;
  return;
}
void locvar_eq(int c1, int c2, bool& _out, int* locvars__ANONYMOUS_s758/* len = 3 */) {
  _out = 0;
  assert ((c1) > (0));;
  assert ((c1) < (3));;
  assert ((c2) >= (0));;
  assert ((c2) < (3));;
  _out = ((locvars__ANONYMOUS_s758[c1])) == ((locvars__ANONYMOUS_s758[c2]));
  return;
}
void intMutate(int c1, int c2, bool* active__ANONYMOUS_s778/* len = 4 */, bool& error_flag__ANONYMOUS_s1595, int& fake_unfold__ANONYMOUS_s779, bool* history__ANONYMOUS_s1202/* len = 4 * 4 */, int* intvars__ANONYMOUS_s780/* len = 2 */, int* key__ANONYMOUS_s781/* len = 4 */, int* locvars__ANONYMOUS_s782/* len = 3 */, int* next__ANONYMOUS_s1203/* len = 4 */, bool* p_history__ANONYMOUS_s1204/* len = 4 * 4 */, bool* symbolic__ANONYMOUS_s783/* len = 4 */, int& ts__ANONYMOUS_s784) {
  assert ((c1) > (0));;
  assert ((c1) < (3));;
  assert ((c2) >= (0));;
  assert ((c2) < (2));;
  int  df=(locvars__ANONYMOUS_s782[c1]);
  assumePre((df) >= (0), error_flag__ANONYMOUS_s1595);
  assumePre((df) < (4), error_flag__ANONYMOUS_s1595);
  if (((df) < (0)) || ((df) >= (4))) {
    return;
  }
  if ((df) == (0)) {
    return;
  }
  if (!((active__ANONYMOUS_s778[df]))) {
    return;
  }
  if ((symbolic__ANONYMOUS_s783[df]) && ((fake_unfold__ANONYMOUS_s779) != (df))) {
    return;
  }
  int  k=(intvars__ANONYMOUS_s780[c2]);
  ts__ANONYMOUS_s784 = ts__ANONYMOUS_s784 + 1;
  (key__ANONYMOUS_s781[df]) = k;
  connect_defs(active__ANONYMOUS_s778, history__ANONYMOUS_s1202, next__ANONYMOUS_s1203, p_history__ANONYMOUS_s1204, symbolic__ANONYMOUS_s783, ts__ANONYMOUS_s784);
}
void intVarAssign(int c1, int c2, int c3, int* intvars__ANONYMOUS_s830/* len = 2 */) {
  assert ((c1) >= (0));;
  assert ((c1) < (2));;
  assert ((c2) >= (0));;
  assert ((c2) < (2));;
  if ((c3) == (0)) {
    (intvars__ANONYMOUS_s830[c1]) = 0;
  } else {
    if ((c3) == (7)) {
      (intvars__ANONYMOUS_s830[c1]) = 7;
    } else {
      if ((c3) == (1)) {
        (intvars__ANONYMOUS_s830[c1]) = (intvars__ANONYMOUS_s830[c2]);
      } else {
        if ((c3) == (2)) {
          (intvars__ANONYMOUS_s830[c1]) = (intvars__ANONYMOUS_s830[c2]) + 1;
        } else {
          if ((c3) == (3)) {
            (intvars__ANONYMOUS_s830[c1]) = (intvars__ANONYMOUS_s830[c2]) - 1;
          }
        }
      }
    }
  }
}
void locderef2var(int c1, int c2, bool* active__ANONYMOUS_s800/* len = 4 */, bool& error_flag__ANONYMOUS_s980, bool* history__ANONYMOUS_s1424/* len = 4 * 4 */, int* key__ANONYMOUS_s974/* len = 4 */, int* locvars__ANONYMOUS_s801/* len = 3 */, int& malloc_budget__ANONYMOUS_s802, int* next__ANONYMOUS_s803/* len = 4 */, bool* p_history__ANONYMOUS_s1091/* len = 4 * 4 */, int* supernext__ANONYMOUS_s975/* len = 4 */, bool* symbolic__ANONYMOUS_s804/* len = 4 */, int& ts__ANONYMOUS_s805) {
  assert ((c1) > (0));;
  assert ((c1) < (3));;
  assert ((c2) > (0));;
  assert ((c2) < (3));;
  int  l=0;
  l = (locvars__ANONYMOUS_s801[c1]);
  assertPost((l) > (0), error_flag__ANONYMOUS_s980);
  assertPost((l) < (4), error_flag__ANONYMOUS_s980);
  if (((l) <= (0)) || ((l) >= (4))) {
    return;
  }
  if (!((active__ANONYMOUS_s800[l]))) {
    return;
  }
  int  test=(next__ANONYMOUS_s803[l]);
  if (!((symbolic__ANONYMOUS_s804[l]))) {
    assumePre((test) >= (0), error_flag__ANONYMOUS_s980);
    assumePre((test) < (4), error_flag__ANONYMOUS_s980);
    if (((test) < (0)) || ((test) >= (4))) {
      return;
    }
    (locvars__ANONYMOUS_s801[c2]) = test;
    return;
  }
  int  ln=test;
  if ((test) > (0)) {
    assumePre((malloc_budget__ANONYMOUS_s802) >= (1), error_flag__ANONYMOUS_s980);
    if ((malloc_budget__ANONYMOUS_s802) < (1)) {
      return;
    }
    malloc_budget__ANONYMOUS_s802 = malloc_budget__ANONYMOUS_s802 - 1;
    ln = 1;
    bool  __sa11=(active__ANONYMOUS_s800[1]);
    while (__sa11) {
      ln = ln + 1;
      __sa11 = ((ln) < (4)) && (active__ANONYMOUS_s800[ln]);
    }
    assumePre((ln) < (4), error_flag__ANONYMOUS_s980);
    if ((ln) >= (4)) {
      return;
    }
    (active__ANONYMOUS_s800[ln]) = 1;
    (symbolic__ANONYMOUS_s804[ln]) = 1;
    (next__ANONYMOUS_s803[l]) = ln;
  }
  (locvars__ANONYMOUS_s801[c2]) = ln;
  (symbolic__ANONYMOUS_s804[l]) = 0;
  bool  _out_s188=0;
  sll(l, ts__ANONYMOUS_s805, _out_s188);
  bool  _out_s190=0;
  sll_comp(l, _out_s190, active__ANONYMOUS_s800, history__ANONYMOUS_s1424, key__ANONYMOUS_s974, next__ANONYMOUS_s803, p_history__ANONYMOUS_s1091, supernext__ANONYMOUS_s975, symbolic__ANONYMOUS_s804, ts__ANONYMOUS_s805);
  assumePre((_out_s188) == (_out_s190), error_flag__ANONYMOUS_s980);
  int  _out_s192=0;
  len(l, ts__ANONYMOUS_s805, _out_s192);
  int  _out_s194=0;
  len_comp(l, _out_s194, active__ANONYMOUS_s800, history__ANONYMOUS_s1424, next__ANONYMOUS_s803, p_history__ANONYMOUS_s1091, supernext__ANONYMOUS_s975, symbolic__ANONYMOUS_s804, ts__ANONYMOUS_s805);
  assumePre((_out_s192) == (_out_s194), error_flag__ANONYMOUS_s980);
  int  _out_s196=0;
  min(l, ts__ANONYMOUS_s805, _out_s196);
  int  _out_s198=0;
  min_comp(l, _out_s198, active__ANONYMOUS_s800, history__ANONYMOUS_s1424, key__ANONYMOUS_s974, next__ANONYMOUS_s803, p_history__ANONYMOUS_s1091, supernext__ANONYMOUS_s975, symbolic__ANONYMOUS_s804, ts__ANONYMOUS_s805);
  assumePre((_out_s196) == (_out_s198), error_flag__ANONYMOUS_s980);
  int  _out_s200=0;
  max(l, ts__ANONYMOUS_s805, _out_s200);
  int  _out_s202=0;
  max_comp(l, _out_s202, active__ANONYMOUS_s800, history__ANONYMOUS_s1424, key__ANONYMOUS_s974, next__ANONYMOUS_s803, p_history__ANONYMOUS_s1091, supernext__ANONYMOUS_s975, symbolic__ANONYMOUS_s804, ts__ANONYMOUS_s805);
  assumePre((_out_s200) == (_out_s202), error_flag__ANONYMOUS_s980);
}
void havoc(int r, bool* new_symbolic/* len = 3 */, int* new_next/* len = 3 */, int* new_supernext/* len = 3 */, int* new_key/* len = 3 */, int& _out, bool* active__ANONYMOUS_s894/* len = 4 */, bool* history__ANONYMOUS_s1303/* len = 4 * 4 */, int* key__ANONYMOUS_s895/* len = 4 */, int* next__ANONYMOUS_s896/* len = 4 */, bool* p_history__ANONYMOUS_s1304/* len = 4 * 4 */, int* supernext__ANONYMOUS_s897/* len = 4 */, bool* symbolic__ANONYMOUS_s898/* len = 4 */, int& ts__ANONYMOUS_s899) {
  _out = 0;
  bool*  reach= new bool [4]; CopyArr<bool >(reach,0, 4);
  compute_reach(r, 0, reach, active__ANONYMOUS_s894, next__ANONYMOUS_s896, supernext__ANONYMOUS_s897, symbolic__ANONYMOUS_s898);
  for (int  idx=1;(idx) < (4);idx = idx + 1){
    if ((reach[idx])) {
      (active__ANONYMOUS_s894[idx]) = 0;
    }
    if (!((active__ANONYMOUS_s894[idx]))) {
      (symbolic__ANONYMOUS_s898[idx]) = (new_symbolic[idx - 1]);
      (next__ANONYMOUS_s896[idx]) = (new_next[idx - 1]);
      (supernext__ANONYMOUS_s897[idx]) = (new_supernext[idx - 1]);
      (key__ANONYMOUS_s895[idx]) = (new_key[idx - 1]);
    }
  }
  bool  __sa10=(active__ANONYMOUS_s894[1]) || !((symbolic__ANONYMOUS_s898[1]));
  int  loc=1;
  while (__sa10) {
    loc = loc + 1;
    __sa10 = ((loc) < (4)) && ((active__ANONYMOUS_s894[loc]) || !((symbolic__ANONYMOUS_s898[loc])));
  }
  if ((loc) >= (4)) {
    _out = 0;
  delete[] reach;
    return;
  }
  ts__ANONYMOUS_s899 = ts__ANONYMOUS_s899 + 1;
  connect_defs(active__ANONYMOUS_s894, history__ANONYMOUS_s1303, next__ANONYMOUS_s896, p_history__ANONYMOUS_s1304, symbolic__ANONYMOUS_s898, ts__ANONYMOUS_s899);
  (active__ANONYMOUS_s894[loc]) = 1;
  _out = loc;
  delete[] reach;
  return;
}
void assumePre(bool b, bool& error_flag__ANONYMOUS_s797) {
  if (!(b)) {
    error_flag__ANONYMOUS_s797 = 1;
  }
}
void intderef_lt_var(int c1, int c2, bool& _out, bool* active__ANONYMOUS_s808/* len = 4 */, bool& error_flag__ANONYMOUS_s1427, int& fake_unfold__ANONYMOUS_s809, int& fake_unfold_to__ANONYMOUS_s810, bool* history__ANONYMOUS_s1143/* len = 4 * 4 */, int* intvars__ANONYMOUS_s811/* len = 2 */, int* key__ANONYMOUS_s812/* len = 4 */, int* locvars__ANONYMOUS_s813/* len = 3 */, int* next__ANONYMOUS_s814/* len = 4 */, bool* p_history__ANONYMOUS_s1124/* len = 4 * 4 */, int* supernext__ANONYMOUS_s1338/* len = 4 */, bool* symbolic__ANONYMOUS_s815/* len = 4 */, int& ts__ANONYMOUS_s816) {
  _out = 0;
  assert ((c1) > (0));;
  assert ((c1) < (3));;
  assert ((c2) >= (0));;
  assert ((c2) < (2));;
  int  l=0;
  l = (locvars__ANONYMOUS_s813[c1]);
  assertPost((l) > (0), error_flag__ANONYMOUS_s1427);
  assertPost((l) < (4), error_flag__ANONYMOUS_s1427);
  if (((l) <= (0)) || ((l) >= (4))) {
    _out = 0;
    return;
  }
  if (!((active__ANONYMOUS_s808[l]))) {
    _out = 0;
    return;
  }
  int  test=(next__ANONYMOUS_s814[l]);
  if (!((symbolic__ANONYMOUS_s815[l]))) {
    assumePre((test) >= (0), error_flag__ANONYMOUS_s1427);
    assumePre((test) < (4), error_flag__ANONYMOUS_s1427);
    if (((test) < (0)) || ((test) >= (4))) {
      _out = 0;
      return;
    }
    _out = ((key__ANONYMOUS_s812[l])) < ((intvars__ANONYMOUS_s811[c2]));
    return;
  }
  int  ln=test;
  if ((test) > (0)) {
    ln = 1;
    bool  __sa14=(active__ANONYMOUS_s808[1]);
    while (__sa14) {
      ln = ln + 1;
      __sa14 = ((ln) < (4)) && (active__ANONYMOUS_s808[ln]);
    }
    assumePre((ln) < (4), error_flag__ANONYMOUS_s1427);
    if ((ln) >= (4)) {
      _out = 0;
      return;
    }
    assertPost(((fake_unfold__ANONYMOUS_s809) == (0)) || ((fake_unfold__ANONYMOUS_s809) == (l)), error_flag__ANONYMOUS_s1427);
    assertPost(((fake_unfold_to__ANONYMOUS_s810) == (0)) || ((fake_unfold_to__ANONYMOUS_s810) == (ln)), error_flag__ANONYMOUS_s1427);
    fake_unfold__ANONYMOUS_s809 = l;
    fake_unfold_to__ANONYMOUS_s810 = ln;
    (active__ANONYMOUS_s808[ln]) = 1;
    (symbolic__ANONYMOUS_s815[ln]) = 1;
    (next__ANONYMOUS_s814[l]) = ln;
  }
  (symbolic__ANONYMOUS_s815[l]) = 0;
  bool  _out_s221=0;
  sll(l, ts__ANONYMOUS_s816, _out_s221);
  bool  _out_s223=0;
  sll_comp(l, _out_s223, active__ANONYMOUS_s808, history__ANONYMOUS_s1143, key__ANONYMOUS_s812, next__ANONYMOUS_s814, p_history__ANONYMOUS_s1124, supernext__ANONYMOUS_s1338, symbolic__ANONYMOUS_s815, ts__ANONYMOUS_s816);
  assumePre((_out_s221) == (_out_s223), error_flag__ANONYMOUS_s1427);
  int  _out_s225=0;
  len(l, ts__ANONYMOUS_s816, _out_s225);
  int  _out_s227=0;
  len_comp(l, _out_s227, active__ANONYMOUS_s808, history__ANONYMOUS_s1143, next__ANONYMOUS_s814, p_history__ANONYMOUS_s1124, supernext__ANONYMOUS_s1338, symbolic__ANONYMOUS_s815, ts__ANONYMOUS_s816);
  assumePre((_out_s225) == (_out_s227), error_flag__ANONYMOUS_s1427);
  int  _out_s229=0;
  min(l, ts__ANONYMOUS_s816, _out_s229);
  int  _out_s231=0;
  min_comp(l, _out_s231, active__ANONYMOUS_s808, history__ANONYMOUS_s1143, key__ANONYMOUS_s812, next__ANONYMOUS_s814, p_history__ANONYMOUS_s1124, supernext__ANONYMOUS_s1338, symbolic__ANONYMOUS_s815, ts__ANONYMOUS_s816);
  assumePre((_out_s229) == (_out_s231), error_flag__ANONYMOUS_s1427);
  int  _out_s233=0;
  max(l, ts__ANONYMOUS_s816, _out_s233);
  int  _out_s235=0;
  max_comp(l, _out_s235, active__ANONYMOUS_s808, history__ANONYMOUS_s1143, key__ANONYMOUS_s812, next__ANONYMOUS_s814, p_history__ANONYMOUS_s1124, supernext__ANONYMOUS_s1338, symbolic__ANONYMOUS_s815, ts__ANONYMOUS_s816);
  assumePre((_out_s233) == (_out_s235), error_flag__ANONYMOUS_s1427);
  if ((test) > (0)) {
    (active__ANONYMOUS_s808[ln]) = 0;
  }
  (symbolic__ANONYMOUS_s815[l]) = 1;
  _out = ((key__ANONYMOUS_s812[l])) < ((intvars__ANONYMOUS_s811[c2]));
  return;
}
void intderef2var(int c1, int c2, bool* active__ANONYMOUS_s874/* len = 4 */, bool& error_flag__ANONYMOUS_s1125, bool* history__ANONYMOUS_s1052/* len = 4 * 4 */, int* intvars__ANONYMOUS_s875/* len = 2 */, int* key__ANONYMOUS_s876/* len = 4 */, int* locvars__ANONYMOUS_s877/* len = 3 */, int* next__ANONYMOUS_s878/* len = 4 */, bool* p_history__ANONYMOUS_s1452/* len = 4 * 4 */, int* supernext__ANONYMOUS_s1285/* len = 4 */, bool* symbolic__ANONYMOUS_s879/* len = 4 */, int& ts__ANONYMOUS_s880) {
  assert ((c1) > (0));;
  assert ((c1) < (3));;
  assert ((c2) >= (0));;
  assert ((c2) < (2));;
  int  l=0;
  l = (locvars__ANONYMOUS_s877[c1]);
  assertPost((l) > (0), error_flag__ANONYMOUS_s1125);
  assertPost((l) < (4), error_flag__ANONYMOUS_s1125);
  if (((l) <= (0)) || ((l) >= (4))) {
    return;
  }
  if (!((active__ANONYMOUS_s874[l]))) {
    return;
  }
  int  test=(next__ANONYMOUS_s878[l]);
  if (!((symbolic__ANONYMOUS_s879[l]))) {
    assumePre((test) >= (0), error_flag__ANONYMOUS_s1125);
    assumePre((test) < (4), error_flag__ANONYMOUS_s1125);
    if (((test) < (0)) || ((test) >= (4))) {
      return;
    }
    (intvars__ANONYMOUS_s875[c2]) = (key__ANONYMOUS_s876[l]);
    return;
  }
  int  ln=0;
  if ((test) > (0)) {
    ln = 1;
    bool  __sa12=(active__ANONYMOUS_s874[1]);
    while (__sa12) {
      ln = ln + 1;
      __sa12 = ((ln) < (4)) && (active__ANONYMOUS_s874[ln]);
    }
    assumePre((ln) < (4), error_flag__ANONYMOUS_s1125);
    if ((ln) >= (4)) {
      return;
    }
    (active__ANONYMOUS_s874[ln]) = 1;
    (symbolic__ANONYMOUS_s879[ln]) = 1;
    (next__ANONYMOUS_s878[l]) = ln;
  }
  (intvars__ANONYMOUS_s875[c2]) = (key__ANONYMOUS_s876[l]);
  (symbolic__ANONYMOUS_s879[l]) = 0;
  bool  _out_s97=0;
  sll(l, ts__ANONYMOUS_s880, _out_s97);
  bool  _out_s99=0;
  sll_comp(l, _out_s99, active__ANONYMOUS_s874, history__ANONYMOUS_s1052, key__ANONYMOUS_s876, next__ANONYMOUS_s878, p_history__ANONYMOUS_s1452, supernext__ANONYMOUS_s1285, symbolic__ANONYMOUS_s879, ts__ANONYMOUS_s880);
  assumePre((_out_s97) == (_out_s99), error_flag__ANONYMOUS_s1125);
  int  _out_s101=0;
  len(l, ts__ANONYMOUS_s880, _out_s101);
  int  _out_s103=0;
  len_comp(l, _out_s103, active__ANONYMOUS_s874, history__ANONYMOUS_s1052, next__ANONYMOUS_s878, p_history__ANONYMOUS_s1452, supernext__ANONYMOUS_s1285, symbolic__ANONYMOUS_s879, ts__ANONYMOUS_s880);
  assumePre((_out_s101) == (_out_s103), error_flag__ANONYMOUS_s1125);
  int  _out_s105=0;
  min(l, ts__ANONYMOUS_s880, _out_s105);
  int  _out_s107=0;
  min_comp(l, _out_s107, active__ANONYMOUS_s874, history__ANONYMOUS_s1052, key__ANONYMOUS_s876, next__ANONYMOUS_s878, p_history__ANONYMOUS_s1452, supernext__ANONYMOUS_s1285, symbolic__ANONYMOUS_s879, ts__ANONYMOUS_s880);
  assumePre((_out_s105) == (_out_s107), error_flag__ANONYMOUS_s1125);
  int  _out_s109=0;
  max(l, ts__ANONYMOUS_s880, _out_s109);
  int  _out_s111=0;
  max_comp(l, _out_s111, active__ANONYMOUS_s874, history__ANONYMOUS_s1052, key__ANONYMOUS_s876, next__ANONYMOUS_s878, p_history__ANONYMOUS_s1452, supernext__ANONYMOUS_s1285, symbolic__ANONYMOUS_s879, ts__ANONYMOUS_s880);
  assumePre((_out_s109) == (_out_s111), error_flag__ANONYMOUS_s1125);
}
void min_recursive(int l, int bnd, int& _out, bool* active__ANONYMOUS_s1009/* len = 4 */, bool* history__ANONYMOUS_s1564/* len = 4 * 4 */, int* key__ANONYMOUS_s1010/* len = 4 */, int* next__ANONYMOUS_s1011/* len = 4 */, bool* p_history__ANONYMOUS_s1093/* len = 4 * 4 */, int* supernext__ANONYMOUS_s1012/* len = 4 */, bool* symbolic__ANONYMOUS_s1013/* len = 4 */, int& ts__ANONYMOUS_s1014) {
  _out = 0;
  int  _out_s133=0;
  minseg_recursive(l, 0, bnd, _out_s133, active__ANONYMOUS_s1009, history__ANONYMOUS_s1564, key__ANONYMOUS_s1010, next__ANONYMOUS_s1011, p_history__ANONYMOUS_s1093, supernext__ANONYMOUS_s1012, symbolic__ANONYMOUS_s1013, ts__ANONYMOUS_s1014);
  _out = _out_s133;
  return;
}
void check_p_treeness(int t1, int t2, bool* m/* len = 4 */, int bnd, bool& _out, bool* active__ANONYMOUS_s736/* len = 4 */, int* next__ANONYMOUS_s737/* len = 4 */, int* supernext__ANONYMOUS_s738/* len = 4 */, bool* symbolic__ANONYMOUS_s739/* len = 4 */) {
  _out = 0;
  if ((bnd) < (0)) {
    _out = 0;
    return;
  } else {
    if (((((t1) < (0)) || ((t1) >= (4))) || ((t2) < (0))) || ((t2) >= (4))) {
      _out = 0;
      return;
    } else {
      if (!((active__ANONYMOUS_s736[t1])) || !((active__ANONYMOUS_s736[t2]))) {
        _out = 0;
        return;
      } else {
        if ((t1) == (t2)) {
          _out = 1;
          return;
        } else {
          if ((t1) == (0)) {
            _out = 0;
            return;
          } else {
            if ((symbolic__ANONYMOUS_s739[t1])) {
              if ((m[t1])) {
                _out = 0;
                return;
              } else {
                (m[t1]) = 1;
                _out = (t2) == (0);
                return;
              }
            } else {
              if ((m[t1])) {
                _out = 0;
                return;
              } else {
                (m[t1]) = 1;
                int  nxt=(next__ANONYMOUS_s737[t1]);
                if (((nxt) < (0)) || ((nxt) >= (4))) {
                  nxt = (supernext__ANONYMOUS_s738[t1]);
                }
                if ((nxt) == (0)) {
                  _out = (t2) == (0);
                  return;
                } else {
                  if (((nxt) < (0)) || ((nxt) >= (4))) {
                    _out = 0;
                    return;
                  } else {
                    bool  _out_s79=0;
                    check_p_treeness(nxt, t2, m, bnd - 1, _out_s79, active__ANONYMOUS_s736, next__ANONYMOUS_s737, supernext__ANONYMOUS_s738, symbolic__ANONYMOUS_s739);
                    _out = _out_s79;
                    return;
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
void len_recursive(int l1, int l2, int bnd, int& _out, bool* active__ANONYMOUS_s918/* len = 4 */, bool* history__ANONYMOUS_s1441/* len = 4 * 4 */, int* next__ANONYMOUS_s919/* len = 4 */, bool* p_history__ANONYMOUS_s1622/* len = 4 * 4 */, int* supernext__ANONYMOUS_s920/* len = 4 */, bool* symbolic__ANONYMOUS_s921/* len = 4 */, int& ts__ANONYMOUS_s922) {
  _out = 0;
  if (((((l1) < (0)) || ((l1) >= (4))) || ((l2) < (0))) || ((l2) >= (4))) {
    _out = -1;
    return;
  } else {
    if (!((active__ANONYMOUS_s918[l1])) || !((active__ANONYMOUS_s918[l2]))) {
      _out = -1;
      return;
    } else {
      if ((l1) == (l2)) {
        _out = (((l1) == (0)) || (((next__ANONYMOUS_s919[l1])) != (l1)) ? 0 : 1);
        return;
      } else {
        if ((l1) == (0)) {
          _out = -1;
          return;
        } else {
          if ((bnd) < (0)) {
            _out = -1;
            return;
          } else {
            if ((symbolic__ANONYMOUS_s921[l1])) {
              if ((l2) == (0)) {
                int  _out_s151=0;
                int  ts__ANONYMOUS_s869_s1902=ts__ANONYMOUS_s922;
                len_history(l1, ts__ANONYMOUS_s922, _out_s151, history__ANONYMOUS_s1441, ts__ANONYMOUS_s869_s1902);
                ts__ANONYMOUS_s922 = ts__ANONYMOUS_s869_s1902;
                _out = _out_s151;
                return;
              } else {
                _out = -1;
                return;
              }
            } else {
              if ((l2) == ((next__ANONYMOUS_s919[l1]))) {
                _out = (((l2) == (0)) || (((next__ANONYMOUS_s919[l2])) != (l2)) ? ((int) (1)) : 2);
                return;
              } else {
                if ((0) == ((next__ANONYMOUS_s919[l1]))) {
                  _out = -1;
                  return;
                } else {
                  if (((0) < ((next__ANONYMOUS_s919[l1]))) && (((next__ANONYMOUS_s919[l1])) < (4))) {
                    int  _out_s153=0;
                    int*  next__ANONYMOUS_s919_s1903= new int [4]; CopyArr<int >(next__ANONYMOUS_s919_s1903,next__ANONYMOUS_s919, 4, 4);
                    len_recursive((next__ANONYMOUS_s919[l1]), l2, bnd - 1, _out_s153, active__ANONYMOUS_s918, history__ANONYMOUS_s1441, next__ANONYMOUS_s919_s1903, p_history__ANONYMOUS_s1622, supernext__ANONYMOUS_s920, symbolic__ANONYMOUS_s921, ts__ANONYMOUS_s922);
                    CopyArr<int >(next__ANONYMOUS_s919,next__ANONYMOUS_s919_s1903, 4, 4);
                    _out = _out_s153 + 1;
                    delete[] next__ANONYMOUS_s919_s1903;
                    return;
                  } else {
                    if ((l2) == ((supernext__ANONYMOUS_s920[l1]))) {
                      int  _out_s155=0;
                      int  ts__ANONYMOUS_s873_s1904=ts__ANONYMOUS_s922;
                      lenseg_history(l1, ts__ANONYMOUS_s922, _out_s155, p_history__ANONYMOUS_s1622, ts__ANONYMOUS_s873_s1904);
                      ts__ANONYMOUS_s922 = ts__ANONYMOUS_s873_s1904;
                      _out = _out_s155;
                      return;
                    } else {
                      if ((0) == ((supernext__ANONYMOUS_s920[l1]))) {
                        _out = -1;
                        return;
                      } else {
                        if (((0) < ((supernext__ANONYMOUS_s920[l1]))) && (((supernext__ANONYMOUS_s920[l1])) < (4))) {
                          int  _out_s157=0;
                          int  ts__ANONYMOUS_s873_s1905=ts__ANONYMOUS_s922;
                          lenseg_history(l1, ts__ANONYMOUS_s922, _out_s157, p_history__ANONYMOUS_s1622, ts__ANONYMOUS_s873_s1905);
                          ts__ANONYMOUS_s922 = ts__ANONYMOUS_s873_s1905;
                          int  _out_s159=0;
                          int*  supernext__ANONYMOUS_s920_s1906= new int [4]; CopyArr<int >(supernext__ANONYMOUS_s920_s1906,supernext__ANONYMOUS_s920, 4, 4);
                          len_recursive((supernext__ANONYMOUS_s920[l1]), l2, bnd - 1, _out_s159, active__ANONYMOUS_s918, history__ANONYMOUS_s1441, next__ANONYMOUS_s919, p_history__ANONYMOUS_s1622, supernext__ANONYMOUS_s920_s1906, symbolic__ANONYMOUS_s921, ts__ANONYMOUS_s922);
                          CopyArr<int >(supernext__ANONYMOUS_s920,supernext__ANONYMOUS_s920_s1906, 4, 4);
                          _out = _out_s157 + _out_s159;
                          delete[] supernext__ANONYMOUS_s920_s1906;
                          return;
                        } else {
                          _out = -1;
                          return;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
void max_recursive(int l, int bnd, int& _out, bool* active__ANONYMOUS_s1265/* len = 4 */, bool* history__ANONYMOUS_s1645/* len = 4 * 4 */, int* key__ANONYMOUS_s1266/* len = 4 */, int* next__ANONYMOUS_s1267/* len = 4 */, bool* p_history__ANONYMOUS_s1268/* len = 4 * 4 */, int* supernext__ANONYMOUS_s1269/* len = 4 */, bool* symbolic__ANONYMOUS_s1270/* len = 4 */, int& ts__ANONYMOUS_s1271) {
  _out = 0;
  int  _out_s115=0;
  maxseg_recursive(l, 0, bnd, _out_s115, active__ANONYMOUS_s1265, history__ANONYMOUS_s1645, key__ANONYMOUS_s1266, next__ANONYMOUS_s1267, p_history__ANONYMOUS_s1268, supernext__ANONYMOUS_s1269, symbolic__ANONYMOUS_s1270, ts__ANONYMOUS_s1271);
  _out = _out_s115;
  return;
}
void maxseg_recursive(int l1, int l2, int bnd, int& _out, bool* active__ANONYMOUS_s862/* len = 4 */, bool* history__ANONYMOUS_s1287/* len = 4 * 4 */, int* key__ANONYMOUS_s863/* len = 4 */, int* next__ANONYMOUS_s864/* len = 4 */, bool* p_history__ANONYMOUS_s1201/* len = 4 * 4 */, int* supernext__ANONYMOUS_s865/* len = 4 */, bool* symbolic__ANONYMOUS_s866/* len = 4 */, int& ts__ANONYMOUS_s867) {
  _out = 0;
  if (((((l1) < (0)) || ((l1) >= (4))) || ((l2) < (0))) || ((l2) >= (4))) {
    _out = -1;
    return;
  } else {
    if (!((active__ANONYMOUS_s862[l1])) || !((active__ANONYMOUS_s862[l2]))) {
      _out = -1;
      return;
    } else {
      if ((l1) == (l2)) {
        _out = (((l1) == (0)) || (((next__ANONYMOUS_s864[l1])) != (l1)) ? ((int) (0)) : (key__ANONYMOUS_s863[l1]));
        return;
      } else {
        if ((l1) == (0)) {
          _out = 0;
          return;
        } else {
          if ((bnd) < (0)) {
            _out = -1;
            return;
          } else {
            if ((symbolic__ANONYMOUS_s866[l1])) {
              if ((l2) == (0)) {
                int  _out_s117=0;
                int  ts__ANONYMOUS_s807_s1907=ts__ANONYMOUS_s867;
                max_history(l1, ts__ANONYMOUS_s867, _out_s117, history__ANONYMOUS_s1287, ts__ANONYMOUS_s807_s1907);
                ts__ANONYMOUS_s867 = ts__ANONYMOUS_s807_s1907;
                _out = _out_s117;
                return;
              } else {
                _out = -1;
                return;
              }
            } else {
              if ((l2) == ((next__ANONYMOUS_s864[l1]))) {
                _out = ((((l2) == (0)) || (((next__ANONYMOUS_s864[l2])) != (l2))) || (((key__ANONYMOUS_s863[l2])) <= ((key__ANONYMOUS_s863[l1]))) ? (key__ANONYMOUS_s863[l1]) : (key__ANONYMOUS_s863[l2]));
                return;
              } else {
                if ((0) == ((next__ANONYMOUS_s864[l1]))) {
                  _out = -1;
                  return;
                } else {
                  if (((0) < ((next__ANONYMOUS_s864[l1]))) && (((next__ANONYMOUS_s864[l1])) < (4))) {
                    int  r_s119=0;
                    int*  next__ANONYMOUS_s864_s1908= new int [4]; CopyArr<int >(next__ANONYMOUS_s864_s1908,next__ANONYMOUS_s864, 4, 4);
                    maxseg_recursive((next__ANONYMOUS_s864[l1]), l2, bnd - 1, r_s119, active__ANONYMOUS_s862, history__ANONYMOUS_s1287, key__ANONYMOUS_s863, next__ANONYMOUS_s864_s1908, p_history__ANONYMOUS_s1201, supernext__ANONYMOUS_s865, symbolic__ANONYMOUS_s866, ts__ANONYMOUS_s867);
                    CopyArr<int >(next__ANONYMOUS_s864,next__ANONYMOUS_s864_s1908, 4, 4);
                    _out = (((key__ANONYMOUS_s863[l1])) >= (r_s119) ? (key__ANONYMOUS_s863[l1]) : r_s119);
                    delete[] next__ANONYMOUS_s864_s1908;
                    return;
                  } else {
                    if ((l2) == ((supernext__ANONYMOUS_s865[l1]))) {
                      int  _out_s121=0;
                      int  ts__ANONYMOUS_s901_s1909=ts__ANONYMOUS_s867;
                      maxseg_history(l1, ts__ANONYMOUS_s867, _out_s121, p_history__ANONYMOUS_s1201, ts__ANONYMOUS_s901_s1909);
                      ts__ANONYMOUS_s867 = ts__ANONYMOUS_s901_s1909;
                      _out = _out_s121;
                      return;
                    } else {
                      if ((0) == ((supernext__ANONYMOUS_s865[l1]))) {
                        _out = -1;
                        return;
                      } else {
                        if (((0) < ((supernext__ANONYMOUS_s865[l1]))) && (((supernext__ANONYMOUS_s865[l1])) < (4))) {
                          int  p1_s123=0;
                          int  ts__ANONYMOUS_s901_s1910=ts__ANONYMOUS_s867;
                          maxseg_history(l1, ts__ANONYMOUS_s867, p1_s123, p_history__ANONYMOUS_s1201, ts__ANONYMOUS_s901_s1910);
                          ts__ANONYMOUS_s867 = ts__ANONYMOUS_s901_s1910;
                          int  p2_s125=0;
                          int*  supernext__ANONYMOUS_s865_s1911= new int [4]; CopyArr<int >(supernext__ANONYMOUS_s865_s1911,supernext__ANONYMOUS_s865, 4, 4);
                          maxseg_recursive((supernext__ANONYMOUS_s865[l1]), l2, bnd - 1, p2_s125, active__ANONYMOUS_s862, history__ANONYMOUS_s1287, key__ANONYMOUS_s863, next__ANONYMOUS_s864, p_history__ANONYMOUS_s1201, supernext__ANONYMOUS_s865_s1911, symbolic__ANONYMOUS_s866, ts__ANONYMOUS_s867);
                          CopyArr<int >(supernext__ANONYMOUS_s865,supernext__ANONYMOUS_s865_s1911, 4, 4);
                          _out = ((p1_s123) >= (p2_s125) ? p1_s123 : p2_s125);
                          delete[] supernext__ANONYMOUS_s865_s1911;
                          return;
                        } else {
                          _out = -1;
                          return;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
void minseg_recursive(int l1, int l2, int bnd, int& _out, bool* active__ANONYMOUS_s818/* len = 4 */, bool* history__ANONYMOUS_s1572/* len = 4 * 4 */, int* key__ANONYMOUS_s819/* len = 4 */, int* next__ANONYMOUS_s820/* len = 4 */, bool* p_history__ANONYMOUS_s1537/* len = 4 * 4 */, int* supernext__ANONYMOUS_s821/* len = 4 */, bool* symbolic__ANONYMOUS_s822/* len = 4 */, int& ts__ANONYMOUS_s823) {
  _out = 0;
  if (((l1) < (0)) || ((l1) >= (4))) {
    _out = 7;
    return;
  } else {
    if (!((active__ANONYMOUS_s818[l1]))) {
      _out = 7;
      return;
    } else {
      if ((l1) == (l2)) {
        _out = (((l1) == (0)) || (((next__ANONYMOUS_s820[l1])) != (l1)) ? 7 : (key__ANONYMOUS_s819[l1]));
        return;
      } else {
        if ((l1) == (0)) {
          _out = 7;
          return;
        } else {
          if ((bnd) < (0)) {
            _out = -1;
            return;
          } else {
            if ((symbolic__ANONYMOUS_s822[l1])) {
              if ((l2) == (0)) {
                int  _out_s135=0;
                int  ts__ANONYMOUS_s940_s1912=ts__ANONYMOUS_s823;
                min_history(l1, ts__ANONYMOUS_s823, _out_s135, history__ANONYMOUS_s1572, ts__ANONYMOUS_s940_s1912);
                ts__ANONYMOUS_s823 = ts__ANONYMOUS_s940_s1912;
                _out = _out_s135;
                return;
              } else {
                _out = -1;
                return;
              }
            } else {
              if ((l2) == ((next__ANONYMOUS_s820[l1]))) {
                _out = ((((l2) == (0)) || (((next__ANONYMOUS_s820[l2])) != (l2))) || (((key__ANONYMOUS_s819[l1])) <= ((key__ANONYMOUS_s819[l2]))) ? (key__ANONYMOUS_s819[l1]) : (key__ANONYMOUS_s819[l2]));
                return;
              } else {
                if ((0) == ((next__ANONYMOUS_s820[l1]))) {
                  _out = -1;
                  return;
                } else {
                  if (((0) < ((next__ANONYMOUS_s820[l1]))) && (((next__ANONYMOUS_s820[l1])) < (4))) {
                    int  r_s137=0;
                    int*  next__ANONYMOUS_s820_s1913= new int [4]; CopyArr<int >(next__ANONYMOUS_s820_s1913,next__ANONYMOUS_s820, 4, 4);
                    minseg_recursive((next__ANONYMOUS_s820[l1]), l2, bnd - 1, r_s137, active__ANONYMOUS_s818, history__ANONYMOUS_s1572, key__ANONYMOUS_s819, next__ANONYMOUS_s820_s1913, p_history__ANONYMOUS_s1537, supernext__ANONYMOUS_s821, symbolic__ANONYMOUS_s822, ts__ANONYMOUS_s823);
                    CopyArr<int >(next__ANONYMOUS_s820,next__ANONYMOUS_s820_s1913, 4, 4);
                    _out = (((key__ANONYMOUS_s819[l1])) <= (r_s137) ? (key__ANONYMOUS_s819[l1]) : r_s137);
                    delete[] next__ANONYMOUS_s820_s1913;
                    return;
                  } else {
                    if ((l2) == ((supernext__ANONYMOUS_s821[l1]))) {
                      int  _out_s139=0;
                      int  ts__ANONYMOUS_s726_s1914=ts__ANONYMOUS_s823;
                      minseg_history(l1, ts__ANONYMOUS_s823, _out_s139, p_history__ANONYMOUS_s1537, ts__ANONYMOUS_s726_s1914);
                      ts__ANONYMOUS_s823 = ts__ANONYMOUS_s726_s1914;
                      _out = _out_s139;
                      return;
                    } else {
                      if ((0) == ((supernext__ANONYMOUS_s821[l1]))) {
                        _out = -1;
                        return;
                      } else {
                        if (((0) < ((supernext__ANONYMOUS_s821[l1]))) && (((supernext__ANONYMOUS_s821[l1])) < (4))) {
                          int  p1_s141=0;
                          int  ts__ANONYMOUS_s726_s1915=ts__ANONYMOUS_s823;
                          minseg_history(l1, ts__ANONYMOUS_s823, p1_s141, p_history__ANONYMOUS_s1537, ts__ANONYMOUS_s726_s1915);
                          ts__ANONYMOUS_s823 = ts__ANONYMOUS_s726_s1915;
                          int  p2_s143=0;
                          int*  supernext__ANONYMOUS_s821_s1916= new int [4]; CopyArr<int >(supernext__ANONYMOUS_s821_s1916,supernext__ANONYMOUS_s821, 4, 4);
                          minseg_recursive((supernext__ANONYMOUS_s821[l1]), l2, bnd - 1, p2_s143, active__ANONYMOUS_s818, history__ANONYMOUS_s1572, key__ANONYMOUS_s819, next__ANONYMOUS_s820, p_history__ANONYMOUS_s1537, supernext__ANONYMOUS_s821_s1916, symbolic__ANONYMOUS_s822, ts__ANONYMOUS_s823);
                          CopyArr<int >(supernext__ANONYMOUS_s821,supernext__ANONYMOUS_s821_s1916, 4, 4);
                          _out = ((p1_s141) <= (p2_s143) ? p1_s141 : p2_s143);
                          delete[] supernext__ANONYMOUS_s821_s1916;
                          return;
                        } else {
                          _out = -1;
                          return;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
void connect_defs(bool* active__ANONYMOUS_s728/* len = 4 */, bool* history__ANONYMOUS_s729/* len = 4 * 4 */, int* next__ANONYMOUS_s730/* len = 4 */, bool* p_history__ANONYMOUS_s731/* len = 4 * 4 */, bool* symbolic__ANONYMOUS_s732/* len = 4 */, int& ts__ANONYMOUS_s733) {
  for (int  i=0;(i) < (4);i = i + 1){
    if ((active__ANONYMOUS_s728[i])) {
      if ((symbolic__ANONYMOUS_s732[i])) {
        assert (((i) >= (0)) && ((i) < (4)));;
        assert (((ts__ANONYMOUS_s733) >= (0)) && ((ts__ANONYMOUS_s733) < (4)));;
        (history__ANONYMOUS_s729[(4 * i) + ts__ANONYMOUS_s733]) = 1;
        assert (((i) >= (0)) && ((i) < (4)));;
        assert (((ts__ANONYMOUS_s733) >= (0)) && ((ts__ANONYMOUS_s733) < (4)));;
        (p_history__ANONYMOUS_s731[(4 * i) + ts__ANONYMOUS_s733]) = 1;
      } else {
        if ((((next__ANONYMOUS_s730[i])) < (0)) || (((next__ANONYMOUS_s730[i])) >= (4))) {
          assert (((i) >= (0)) && ((i) < (4)));;
          assert (((ts__ANONYMOUS_s733) >= (0)) && ((ts__ANONYMOUS_s733) < (4)));;
          (p_history__ANONYMOUS_s731[(4 * i) + ts__ANONYMOUS_s733]) = 1;
        }
      }
    }
  }
}
void sll_comp(int l, bool& _out, bool* active__ANONYMOUS_s1585/* len = 4 */, bool* history__ANONYMOUS_s1581/* len = 4 * 4 */, int* key__ANONYMOUS_s1586/* len = 4 */, int* next__ANONYMOUS_s1587/* len = 4 */, bool* p_history__ANONYMOUS_s1431/* len = 4 * 4 */, int* supernext__ANONYMOUS_s1588/* len = 4 */, bool* symbolic__ANONYMOUS_s1589/* len = 4 */, int& ts__ANONYMOUS_s1432) {
  _out = 0;
  bool  _out_s165=0;
  sll_recursive(l, 3, _out_s165, active__ANONYMOUS_s1585, history__ANONYMOUS_s1581, key__ANONYMOUS_s1586, next__ANONYMOUS_s1587, p_history__ANONYMOUS_s1431, supernext__ANONYMOUS_s1588, symbolic__ANONYMOUS_s1589, ts__ANONYMOUS_s1432);
  _out = _out_s165;
  return;
}
void compute_reach(int init, int stop, bool* reach/* len = 4 */, bool* active__ANONYMOUS_s735/* len = 4 */, int* next__ANONYMOUS_s1428/* len = 4 */, int* supernext__ANONYMOUS_s1429/* len = 4 */, bool* symbolic__ANONYMOUS_s1430/* len = 4 */) {
  if (((init) < (0)) || ((init) >= (4))) {
    return;
  } else {
    if (!((active__ANONYMOUS_s735[init]))) {
      return;
    }
  }
  (reach[init]) = ((init) == (stop) ? 0 : 1);
  bool  updated=0;
  bool  __sa1684=1;
  while (__sa1684) {
    updated = 0;
    update_reach(updated, reach, stop, active__ANONYMOUS_s735, next__ANONYMOUS_s1428, supernext__ANONYMOUS_s1429, symbolic__ANONYMOUS_s1430);
    __sa1684 = updated;
  }
}
void len_history(int l, int ts_0, int& _out, bool* history__ANONYMOUS_s868/* len = 4 * 4 */, int& ts__ANONYMOUS_s869) {
  _out = 0;
  int  ts=ts_0;
  assert (((l) >= (0)) && ((l) < (4)));;
  assert (((ts_0) >= (0)) && ((ts_0) < (4)));;
  bool  __sa4=((ts_0) > (0)) && (history__ANONYMOUS_s868[((4 * l) + ts_0)]);
  while (__sa4) {
    ts = ts - 1;
    assert (((l) >= (0)) && ((l) < (4)));;
    assert (((ts) >= (0)) && ((ts) < (4)));;
    __sa4 = ((ts) > (0)) && (history__ANONYMOUS_s868[((4 * l) + ts)]);
  }
  int  _out_s163=0;
  len(l, ts, _out_s163);
  _out = _out_s163;
  return;
}
void lenseg_history(int l1, int ts_0, int& _out, bool* p_history__ANONYMOUS_s872/* len = 4 * 4 */, int& ts__ANONYMOUS_s873) {
  _out = 0;
  int  ts=ts_0;
  assert (((l1) >= (0)) && ((l1) < (4)));;
  assert (((ts_0) >= (0)) && ((ts_0) < (4)));;
  bool  __sa5=((ts_0) > (0)) && (p_history__ANONYMOUS_s872[((4 * l1) + ts_0)]);
  while (__sa5) {
    ts = ts - 1;
    assert (((l1) >= (0)) && ((l1) < (4)));;
    assert (((ts) >= (0)) && ((ts) < (4)));;
    __sa5 = ((ts) > (0)) && (p_history__ANONYMOUS_s872[((4 * l1) + ts)]);
  }
  int  _out_s161=0;
  lenseg(l1, ts, _out_s161);
  _out = _out_s161;
  return;
}
void max_history(int l, int ts_0, int& _out, bool* history__ANONYMOUS_s806/* len = 4 * 4 */, int& ts__ANONYMOUS_s807) {
  _out = 0;
  int  ts=ts_0;
  assert (((l) >= (0)) && ((l) < (4)));;
  assert (((ts_0) >= (0)) && ((ts_0) < (4)));;
  bool  __sa8=((ts_0) > (0)) && (history__ANONYMOUS_s806[((4 * l) + ts_0)]);
  while (__sa8) {
    ts = ts - 1;
    assert (((l) >= (0)) && ((l) < (4)));;
    assert (((ts) >= (0)) && ((ts) < (4)));;
    __sa8 = ((ts) > (0)) && (history__ANONYMOUS_s806[((4 * l) + ts)]);
  }
  int  _out_s129=0;
  max(l, ts, _out_s129);
  _out = _out_s129;
  return;
}
void maxseg_history(int l1, int ts_0, int& _out, bool* p_history__ANONYMOUS_s900/* len = 4 * 4 */, int& ts__ANONYMOUS_s901) {
  _out = 0;
  int  ts=ts_0;
  assert (((l1) >= (0)) && ((l1) < (4)));;
  assert (((ts_0) >= (0)) && ((ts_0) < (4)));;
  bool  __sa9=((ts_0) > (0)) && (p_history__ANONYMOUS_s900[((4 * l1) + ts_0)]);
  while (__sa9) {
    ts = ts - 1;
    assert (((l1) >= (0)) && ((l1) < (4)));;
    assert (((ts) >= (0)) && ((ts) < (4)));;
    __sa9 = ((ts) > (0)) && (p_history__ANONYMOUS_s900[((4 * l1) + ts)]);
  }
  int  _out_s127=0;
  maxseg(l1, ts, _out_s127);
  _out = _out_s127;
  return;
}
void min_history(int l, int ts_0, int& _out, bool* history__ANONYMOUS_s939/* len = 4 * 4 */, int& ts__ANONYMOUS_s940) {
  _out = 0;
  int  ts=ts_0;
  assert (((l) >= (0)) && ((l) < (4)));;
  assert (((ts_0) >= (0)) && ((ts_0) < (4)));;
  bool  __sa6=((ts_0) > (0)) && (history__ANONYMOUS_s939[((4 * l) + ts_0)]);
  while (__sa6) {
    ts = ts - 1;
    assert (((l) >= (0)) && ((l) < (4)));;
    assert (((ts) >= (0)) && ((ts) < (4)));;
    __sa6 = ((ts) > (0)) && (history__ANONYMOUS_s939[((4 * l) + ts)]);
  }
  int  _out_s147=0;
  min(l, ts, _out_s147);
  _out = _out_s147;
  return;
}
void minseg_history(int l1, int ts_0, int& _out, bool* p_history__ANONYMOUS_s725/* len = 4 * 4 */, int& ts__ANONYMOUS_s726) {
  _out = 0;
  int  ts=ts_0;
  assert (((l1) >= (0)) && ((l1) < (4)));;
  assert (((ts_0) >= (0)) && ((ts_0) < (4)));;
  bool  __sa7=((ts_0) > (0)) && (p_history__ANONYMOUS_s725[((4 * l1) + ts_0)]);
  while (__sa7) {
    ts = ts - 1;
    assert (((l1) >= (0)) && ((l1) < (4)));;
    assert (((ts) >= (0)) && ((ts) < (4)));;
    __sa7 = ((ts) > (0)) && (p_history__ANONYMOUS_s725[((4 * l1) + ts)]);
  }
  int  _out_s145=0;
  minseg(l1, ts, _out_s145);
  _out = _out_s145;
  return;
}
void sll_recursive(int l, int bnd, bool& _out, bool* active__ANONYMOUS_s909/* len = 4 */, bool* history__ANONYMOUS_s1536/* len = 4 * 4 */, int* key__ANONYMOUS_s910/* len = 4 */, int* next__ANONYMOUS_s911/* len = 4 */, bool* p_history__ANONYMOUS_s1030/* len = 4 * 4 */, int* supernext__ANONYMOUS_s912/* len = 4 */, bool* symbolic__ANONYMOUS_s913/* len = 4 */, int& ts__ANONYMOUS_s914) {
  _out = 0;
  if (((l) < (0)) || ((l) >= (4))) {
    _out = 0;
    return;
  }
  if (!((active__ANONYMOUS_s909[l]))) {
    _out = 0;
    return;
  }
  if ((l) == (0)) {
    _out = 1;
    return;
  }
  if ((bnd) < (0)) {
    _out = 0;
    return;
  } else {
    if ((symbolic__ANONYMOUS_s913[l])) {
      bool  _out_s167=0;
      int  ts__ANONYMOUS_s747_s1917=ts__ANONYMOUS_s914;
      sll_history(l, ts__ANONYMOUS_s914, _out_s167, history__ANONYMOUS_s1536, ts__ANONYMOUS_s747_s1917);
      ts__ANONYMOUS_s914 = ts__ANONYMOUS_s747_s1917;
      _out = _out_s167;
      return;
    } else {
      if ((0) == ((next__ANONYMOUS_s911[l]))) {
        _out = 1;
        return;
      } else {
        if (((0) < ((next__ANONYMOUS_s911[l]))) && (((next__ANONYMOUS_s911[l])) < (4))) {
          bool  _pac_sc_s168_s170=0;
          int*  next__ANONYMOUS_s911_s1918= new int [4]; CopyArr<int >(next__ANONYMOUS_s911_s1918,next__ANONYMOUS_s911, 4, 4);
          sll_recursive((next__ANONYMOUS_s911[l]), bnd - 1, _pac_sc_s168_s170, active__ANONYMOUS_s909, history__ANONYMOUS_s1536, key__ANONYMOUS_s910, next__ANONYMOUS_s911_s1918, p_history__ANONYMOUS_s1030, supernext__ANONYMOUS_s912, symbolic__ANONYMOUS_s913, ts__ANONYMOUS_s914);
          CopyArr<int >(next__ANONYMOUS_s911,next__ANONYMOUS_s911_s1918, 4, 4);
          bool  _pac_sc_s168=0;
          _pac_sc_s168 = _pac_sc_s168_s170;
          if (_pac_sc_s168_s170) {
            int  _pac_sc_s168_s172=0;
            int*  next__ANONYMOUS_s1011_s1919= new int [4]; CopyArr<int >(next__ANONYMOUS_s1011_s1919,next__ANONYMOUS_s911, 4, 4);
            min_recursive((next__ANONYMOUS_s911[l]), bnd - 1, _pac_sc_s168_s172, active__ANONYMOUS_s909, history__ANONYMOUS_s1536, key__ANONYMOUS_s910, next__ANONYMOUS_s1011_s1919, p_history__ANONYMOUS_s1030, supernext__ANONYMOUS_s912, symbolic__ANONYMOUS_s913, ts__ANONYMOUS_s914);
            CopyArr<int >(next__ANONYMOUS_s911,next__ANONYMOUS_s1011_s1919, 4, 4);
            _pac_sc_s168 = ((key__ANONYMOUS_s910[l])) <= (_pac_sc_s168_s172);
          }
          _out = _pac_sc_s168;
          delete[] next__ANONYMOUS_s911_s1918;
          return;
        } else {
          if ((0) == ((supernext__ANONYMOUS_s912[l]))) {
            _out = 1;
            return;
          } else {
            if (((0) < ((supernext__ANONYMOUS_s912[l]))) && (((supernext__ANONYMOUS_s912[l])) < (4))) {
              bool  _pac_sc_s174_s176=0;
              int  ts__ANONYMOUS_s762_s1920=ts__ANONYMOUS_s914;
              sllseg_history(l, ts__ANONYMOUS_s914, _pac_sc_s174_s176, p_history__ANONYMOUS_s1030, ts__ANONYMOUS_s762_s1920);
              ts__ANONYMOUS_s914 = ts__ANONYMOUS_s762_s1920;
              bool  _pac_sc_s174=0;
              _pac_sc_s174 = _pac_sc_s174_s176;
              if (_pac_sc_s174_s176) {
                bool  _pac_sc_s174_s178=0;
                int*  supernext__ANONYMOUS_s912_s1921= new int [4]; CopyArr<int >(supernext__ANONYMOUS_s912_s1921,supernext__ANONYMOUS_s912, 4, 4);
                sll_recursive((supernext__ANONYMOUS_s912[l]), bnd - 1, _pac_sc_s174_s178, active__ANONYMOUS_s909, history__ANONYMOUS_s1536, key__ANONYMOUS_s910, next__ANONYMOUS_s911, p_history__ANONYMOUS_s1030, supernext__ANONYMOUS_s912_s1921, symbolic__ANONYMOUS_s913, ts__ANONYMOUS_s914);
                CopyArr<int >(supernext__ANONYMOUS_s912,supernext__ANONYMOUS_s912_s1921, 4, 4);
                _pac_sc_s174 = _pac_sc_s174_s178;
              }
              bool  _pac_sc_s173=_pac_sc_s174;
              if (_pac_sc_s174) {
                int  _pac_sc_s173_s180=0;
                int  ts__ANONYMOUS_s901_s1922=ts__ANONYMOUS_s914;
                maxseg_history(l, ts__ANONYMOUS_s914, _pac_sc_s173_s180, p_history__ANONYMOUS_s1030, ts__ANONYMOUS_s901_s1922);
                ts__ANONYMOUS_s914 = ts__ANONYMOUS_s901_s1922;
                int  _pac_sc_s173_s182=0;
                int*  supernext__ANONYMOUS_s1012_s1923= new int [4]; CopyArr<int >(supernext__ANONYMOUS_s1012_s1923,supernext__ANONYMOUS_s912, 4, 4);
                min_recursive((supernext__ANONYMOUS_s912[l]), bnd - 1, _pac_sc_s173_s182, active__ANONYMOUS_s909, history__ANONYMOUS_s1536, key__ANONYMOUS_s910, next__ANONYMOUS_s911, p_history__ANONYMOUS_s1030, supernext__ANONYMOUS_s1012_s1923, symbolic__ANONYMOUS_s913, ts__ANONYMOUS_s914);
                CopyArr<int >(supernext__ANONYMOUS_s912,supernext__ANONYMOUS_s1012_s1923, 4, 4);
                _pac_sc_s173 = (_pac_sc_s173_s180) <= (_pac_sc_s173_s182);
              }
              _out = _pac_sc_s173;
              return;
            } else {
              _out = 0;
              return;
            }
          }
        }
      }
    }
  }
}
void update_reach(bool& updated, bool* reach/* len = 4 */, int stop, bool* active__ANONYMOUS_s764/* len = 4 */, int* next__ANONYMOUS_s765/* len = 4 */, int* supernext__ANONYMOUS_s766/* len = 4 */, bool* symbolic__ANONYMOUS_s767/* len = 4 */) {
  for (int  i=1;(i) < (4);i = i + 1){
    if ((((reach[i]) && (active__ANONYMOUS_s764[i])) && !((symbolic__ANONYMOUS_s767[i]))) && ((i) != (stop))) {
      int  n=0;
      n = (next__ANONYMOUS_s765[i]);
      if (!(((n) >= (0)) && ((n) < (4)))) {
        n = (supernext__ANONYMOUS_s766[i]);
      }
      if (!(((n) >= (0)) && ((n) < (4)))) {
        n = -1;
      }
      if ((((n) > (0)) && (active__ANONYMOUS_s764[n])) && !((reach[n]))) {
        (reach[n]) = 1;
        updated = 1;
      }
    }
  }
}
void sll_history(int l, int ts_0, bool& _out, bool* history__ANONYMOUS_s746/* len = 4 * 4 */, int& ts__ANONYMOUS_s747) {
  _out = 0;
  int  ts=ts_0;
  assert (((l) >= (0)) && ((l) < (4)));;
  assert (((ts_0) >= (0)) && ((ts_0) < (4)));;
  bool  __sa0=((ts_0) > (0)) && (history__ANONYMOUS_s746[((4 * l) + ts_0)]);
  while (__sa0) {
    ts = ts - 1;
    assert (((l) >= (0)) && ((l) < (4)));;
    assert (((ts) >= (0)) && ((ts) < (4)));;
    __sa0 = ((ts) > (0)) && (history__ANONYMOUS_s746[((4 * l) + ts)]);
  }
  bool  _out_s186=0;
  sll(l, ts, _out_s186);
  _out = _out_s186;
  return;
}
void sllseg_history(int l1, int ts_0, bool& _out, bool* p_history__ANONYMOUS_s761/* len = 4 * 4 */, int& ts__ANONYMOUS_s762) {
  _out = 0;
  int  ts=ts_0;
  assert (((l1) >= (0)) && ((l1) < (4)));;
  assert (((ts_0) >= (0)) && ((ts_0) < (4)));;
  bool  __sa1=((ts_0) > (0)) && (p_history__ANONYMOUS_s761[((4 * l1) + ts_0)]);
  while (__sa1) {
    ts = ts - 1;
    assert (((l1) >= (0)) && ((l1) < (4)));;
    assert (((ts) >= (0)) && ((ts) < (4)));;
    __sa1 = ((ts) > (0)) && (p_history__ANONYMOUS_s761[((4 * l1) + ts)]);
  }
  bool  _out_s184=0;
  sllseg(l1, ts, _out_s184);
  _out = _out_s184;
  return;
}
void maxseg(int l1, int t, int& _out) { 
	/* This was defined as an uninterpreted function. 
	   Add your own body here. */ 
	_out = 0;

}
void max(int l, int t, int& _out) { 
	/* This was defined as an uninterpreted function. 
	   Add your own body here. */ 
	_out = 0;

}
void minseg(int l1, int t, int& _out) { 
	/* This was defined as an uninterpreted function. 
	   Add your own body here. */ 
	_out = 0;

}
void min(int l, int t, int& _out) { 
	/* This was defined as an uninterpreted function. 
	   Add your own body here. */ 
	_out = 0;

}
void lenseg(int l1, int t, int& _out) { 
	/* This was defined as an uninterpreted function. 
	   Add your own body here. */ 
	_out = 0;

}
void len(int l, int t, int& _out) { 
	/* This was defined as an uninterpreted function. 
	   Add your own body here. */ 
	_out = 0;

}
void sllseg(int l1, int t, bool& _out) { 
	/* This was defined as an uninterpreted function. 
	   Add your own body here. */ 
	_out = 0;

}
void sll(int l, int t, bool& _out) { 
	/* This was defined as an uninterpreted function. 
	   Add your own body here. */ 
	_out = 0;

}
void cache(int l, int& _out) { 
	/* This was defined as an uninterpreted function. 
	   Add your own body here. */ 
	_out = 0;

}
void rsll(int l, int t, bool& _out) { 
	/* This was defined as an uninterpreted function. 
	   Add your own body here. */ 
	_out = 0;

}
void rsllseg(int l1, int t, bool& _out) { 
	/* This was defined as an uninterpreted function. 
	   Add your own body here. */ 
	_out = 0;

}

}
