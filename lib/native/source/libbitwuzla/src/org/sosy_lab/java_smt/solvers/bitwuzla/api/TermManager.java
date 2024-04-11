// This file is part of JavaSMT,
// an API wrapper for a collection of SMT solvers:
// https://github.com/sosy-lab/java-smt
//
// SPDX-FileCopyrightText: 2024 Dirk Beyer <https://www.sosy-lab.org>
//
// SPDX-License-Identifier: Apache-2.0

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sosy_lab.java_smt.solvers.bitwuzla.api;

public class TermManager {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TermManager(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TermManager obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(TermManager obj) {
    long ptr = 0;
    if (obj != null) {
      if (!obj.swigCMemOwn)
        throw new RuntimeException("Cannot release ownership as memory is not owned");
      ptr = obj.swigCPtr;
      obj.swigCMemOwn = false;
      obj.delete();
    }
    return ptr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        //BitwuzlaNativeJNI.delete_TermManager(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TermManager() {
    this(BitwuzlaNativeJNI.new_TermManager(), true);
  }

  public Sort mk_array_sort(Sort index, Sort element) {
    return new Sort(BitwuzlaNativeJNI.TermManager_mk_array_sort(swigCPtr, this, Sort.getCPtr(index), index, Sort.getCPtr(element), element), true);
  }

  public Sort mk_bool_sort() {
    return new Sort(BitwuzlaNativeJNI.TermManager_mk_bool_sort(swigCPtr, this), true);
  }

  public Sort mk_fun_sort(Vector_Sort domain, Sort codomain) {
    return new Sort(BitwuzlaNativeJNI.TermManager_mk_fun_sort(swigCPtr, this, Vector_Sort.getCPtr(domain), domain, Sort.getCPtr(codomain), codomain), true);
  }

  public Term mk_true() {
    return new Term(BitwuzlaNativeJNI.TermManager_mk_true(swigCPtr, this), true);
  }

  public Term mk_false() {
    return new Term(BitwuzlaNativeJNI.TermManager_mk_false(swigCPtr, this), true);
  }

  public Term mk_bv_zero(Sort sort) {
    return new Term(BitwuzlaNativeJNI.TermManager_mk_bv_zero(swigCPtr, this, Sort.getCPtr(sort), sort), true);
  }

  public Term mk_bv_one(Sort sort) {
    return new Term(BitwuzlaNativeJNI.TermManager_mk_bv_one(swigCPtr, this, Sort.getCPtr(sort), sort), true);
  }

  public Term mk_bv_ones(Sort sort) {
    return new Term(BitwuzlaNativeJNI.TermManager_mk_bv_ones(swigCPtr, this, Sort.getCPtr(sort), sort), true);
  }

  public Term mk_bv_min_signed(Sort sort) {
    return new Term(BitwuzlaNativeJNI.TermManager_mk_bv_min_signed(swigCPtr, this, Sort.getCPtr(sort), sort), true);
  }

  public Term mk_bv_max_signed(Sort sort) {
    return new Term(BitwuzlaNativeJNI.TermManager_mk_bv_max_signed(swigCPtr, this, Sort.getCPtr(sort), sort), true);
  }

  public Term mk_bv_value(Sort sort, String value, short base) {
    return new Term(BitwuzlaNativeJNI.TermManager_mk_bv_value__SWIG_0(swigCPtr, this, Sort.getCPtr(sort), sort, value, base), true);
  }

  public Term mk_bv_value(Sort sort, String value) {
    return new Term(BitwuzlaNativeJNI.TermManager_mk_bv_value__SWIG_1(swigCPtr, this, Sort.getCPtr(sort), sort, value), true);
  }

  public Term mk_bv_value_uint64(Sort sort, java.math.BigInteger value) {
    return new Term(BitwuzlaNativeJNI.TermManager_mk_bv_value_uint64(swigCPtr, this, Sort.getCPtr(sort), sort, value), true);
  }

  public Term mk_bv_value_int64(Sort sort, long value) {
    return new Term(BitwuzlaNativeJNI.TermManager_mk_bv_value_int64(swigCPtr, this, Sort.getCPtr(sort), sort, value), true);
  }

  public Term mk_fp_pos_zero(Sort sort) {
    return new Term(BitwuzlaNativeJNI.TermManager_mk_fp_pos_zero(swigCPtr, this, Sort.getCPtr(sort), sort), true);
  }

  public Term mk_fp_neg_zero(Sort sort) {
    return new Term(BitwuzlaNativeJNI.TermManager_mk_fp_neg_zero(swigCPtr, this, Sort.getCPtr(sort), sort), true);
  }

  public Term mk_fp_pos_inf(Sort sort) {
    return new Term(BitwuzlaNativeJNI.TermManager_mk_fp_pos_inf(swigCPtr, this, Sort.getCPtr(sort), sort), true);
  }

  public Term mk_fp_neg_inf(Sort sort) {
    return new Term(BitwuzlaNativeJNI.TermManager_mk_fp_neg_inf(swigCPtr, this, Sort.getCPtr(sort), sort), true);
  }

  public Term mk_fp_nan(Sort sort) {
    return new Term(BitwuzlaNativeJNI.TermManager_mk_fp_nan(swigCPtr, this, Sort.getCPtr(sort), sort), true);
  }

  public Term mk_fp_value(Term bv_sign, Term bv_exponent, Term bv_significand) {
    return new Term(BitwuzlaNativeJNI.TermManager_mk_fp_value__SWIG_0(swigCPtr, this, Term.getCPtr(bv_sign), bv_sign, Term.getCPtr(bv_exponent), bv_exponent, Term.getCPtr(bv_significand), bv_significand), true);
  }

  public Term mk_fp_value(Sort sort, Term rm, String real) {
    return new Term(BitwuzlaNativeJNI.TermManager_mk_fp_value__SWIG_1(swigCPtr, this, Sort.getCPtr(sort), sort, Term.getCPtr(rm), rm, real), true);
  }

  public Term mk_fp_value(Sort sort, Term rm, String num, String den) {
    return new Term(BitwuzlaNativeJNI.TermManager_mk_fp_value__SWIG_2(swigCPtr, this, Sort.getCPtr(sort), sort, Term.getCPtr(rm), rm, num, den), true);
  }

  public Term mk_const_array(Sort sort, Term term) {
    return new Term(BitwuzlaNativeJNI.TermManager_mk_const_array(swigCPtr, this, Sort.getCPtr(sort), sort, Term.getCPtr(term), term), true);
  }

  public Term mk_rm_value(RoundingMode rm) {
    return new Term(BitwuzlaNativeJNI.TermManager_mk_rm_value(swigCPtr, this, rm.swigValue()), true);
  }

  public Term substitute_term(Term term, Map_TermTerm map) {
    return new Term(BitwuzlaNativeJNI.TermManager_substitute_term(swigCPtr, this, Term.getCPtr(term), term, Map_TermTerm.getCPtr(map), map), true);
  }

  public void substitute_terms(Vector_Term terms, Map_TermTerm map) {
    BitwuzlaNativeJNI.TermManager_substitute_terms(swigCPtr, this, Vector_Term.getCPtr(terms), terms, Map_TermTerm.getCPtr(map), map);
  }

  public Sort mk_bv_sort(int size) {
    return new Sort(BitwuzlaNativeJNI.TermManager_mk_bv_sort(swigCPtr, this, size), true);
  }

  public Sort mk_fp_sort(int exp_size, int sig_size) {
    return new Sort(BitwuzlaNativeJNI.TermManager_mk_fp_sort(swigCPtr, this, exp_size, sig_size), true);
  }

  public Term mk_term(Kind kind, Term t1) {
    return new Term(BitwuzlaNativeJNI.TermManager_mk_term__SWIG_0(swigCPtr, this, kind.swigValue(), Term.getCPtr(t1), t1), true);
  }

  public Term mk_term(Kind kind, Term t1, int i1) {
    return new Term(BitwuzlaNativeJNI.TermManager_mk_term__SWIG_1(swigCPtr, this, kind.swigValue(), Term.getCPtr(t1), t1, i1), true);
  }

  public Term mk_term(Kind kind, Term t1, int i1, int i2) {
    return new Term(BitwuzlaNativeJNI.TermManager_mk_term__SWIG_2(swigCPtr, this, kind.swigValue(), Term.getCPtr(t1), t1, i1, i2), true);
  }

  public Term mk_term(Kind kind, Term t1, Term t2) {
    return new Term(BitwuzlaNativeJNI.TermManager_mk_term__SWIG_3(swigCPtr, this, kind.swigValue(), Term.getCPtr(t1), t1, Term.getCPtr(t2), t2), true);
  }

  public Term mk_term(Kind kind, Term t1, Term t2, int i1) {
    return new Term(BitwuzlaNativeJNI.TermManager_mk_term__SWIG_4(swigCPtr, this, kind.swigValue(), Term.getCPtr(t1), t1, Term.getCPtr(t2), t2, i1), true);
  }

  public Term mk_term(Kind kind, Term t1, Term t2, int i1, int i2) {
    return new Term(BitwuzlaNativeJNI.TermManager_mk_term__SWIG_5(swigCPtr, this, kind.swigValue(), Term.getCPtr(t1), t1, Term.getCPtr(t2), t2, i1, i2), true);
  }

  public Term mk_term(Kind kind, Term t1, Term t2, Term t3) {
    return new Term(BitwuzlaNativeJNI.TermManager_mk_term__SWIG_6(swigCPtr, this, kind.swigValue(), Term.getCPtr(t1), t1, Term.getCPtr(t2), t2, Term.getCPtr(t3), t3), true);
  }

  public Term mk_term(Kind kind, Vector_Term args, Vector_Int indices) {
    return new Term(BitwuzlaNativeJNI.TermManager_mk_term__SWIG_7(swigCPtr, this, kind.swigValue(), Vector_Term.getCPtr(args), args, Vector_Int.getCPtr(indices), indices), true);
  }

  public Term mk_const(Sort sort, String symbol) {
    return new Term(BitwuzlaNativeJNI.TermManager_mk_const(swigCPtr, this, Sort.getCPtr(sort), sort, symbol), true);
  }

  public Term mk_var(Sort sort, String symbol) {
    return new Term(BitwuzlaNativeJNI.TermManager_mk_var(swigCPtr, this, Sort.getCPtr(sort), sort, symbol), true);
  }

}
