/*
 *  JavaSMT is an API wrapper for a collection of SMT solvers.
 *  This file is part of JavaSMT.
 *
 *  Copyright (C) 2007-2016  Dirk Beyer
 *  All rights reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.sosy_lab.java_smt.solvers.bitwuzla;

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

public class _IO_FILE {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _IO_FILE(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_IO_FILE obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        bitwuzlaJNI.delete__IO_FILE(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void set_flags(int value) {
    bitwuzlaJNI._IO_FILE__flags_set(swigCPtr, this, value);
  }

  public int get_flags() {
    return bitwuzlaJNI._IO_FILE__flags_get(swigCPtr, this);
  }

  public void set_IO_read_ptr(String value) {
    bitwuzlaJNI._IO_FILE__IO_read_ptr_set(swigCPtr, this, value);
  }

  public String get_IO_read_ptr() {
    return bitwuzlaJNI._IO_FILE__IO_read_ptr_get(swigCPtr, this);
  }

  public void set_IO_read_end(String value) {
    bitwuzlaJNI._IO_FILE__IO_read_end_set(swigCPtr, this, value);
  }

  public String get_IO_read_end() {
    return bitwuzlaJNI._IO_FILE__IO_read_end_get(swigCPtr, this);
  }

  public void set_IO_read_base(String value) {
    bitwuzlaJNI._IO_FILE__IO_read_base_set(swigCPtr, this, value);
  }

  public String get_IO_read_base() {
    return bitwuzlaJNI._IO_FILE__IO_read_base_get(swigCPtr, this);
  }

  public void set_IO_write_base(String value) {
    bitwuzlaJNI._IO_FILE__IO_write_base_set(swigCPtr, this, value);
  }

  public String get_IO_write_base() {
    return bitwuzlaJNI._IO_FILE__IO_write_base_get(swigCPtr, this);
  }

  public void set_IO_write_ptr(String value) {
    bitwuzlaJNI._IO_FILE__IO_write_ptr_set(swigCPtr, this, value);
  }

  public String get_IO_write_ptr() {
    return bitwuzlaJNI._IO_FILE__IO_write_ptr_get(swigCPtr, this);
  }

  public void set_IO_write_end(String value) {
    bitwuzlaJNI._IO_FILE__IO_write_end_set(swigCPtr, this, value);
  }

  public String get_IO_write_end() {
    return bitwuzlaJNI._IO_FILE__IO_write_end_get(swigCPtr, this);
  }

  public void set_IO_buf_base(String value) {
    bitwuzlaJNI._IO_FILE__IO_buf_base_set(swigCPtr, this, value);
  }

  public String get_IO_buf_base() {
    return bitwuzlaJNI._IO_FILE__IO_buf_base_get(swigCPtr, this);
  }

  public void set_IO_buf_end(String value) {
    bitwuzlaJNI._IO_FILE__IO_buf_end_set(swigCPtr, this, value);
  }

  public String get_IO_buf_end() {
    return bitwuzlaJNI._IO_FILE__IO_buf_end_get(swigCPtr, this);
  }

  public void set_IO_save_base(String value) {
    bitwuzlaJNI._IO_FILE__IO_save_base_set(swigCPtr, this, value);
  }

  public String get_IO_save_base() {
    return bitwuzlaJNI._IO_FILE__IO_save_base_get(swigCPtr, this);
  }

  public void set_IO_backup_base(String value) {
    bitwuzlaJNI._IO_FILE__IO_backup_base_set(swigCPtr, this, value);
  }

  public String get_IO_backup_base() {
    return bitwuzlaJNI._IO_FILE__IO_backup_base_get(swigCPtr, this);
  }

  public void set_IO_save_end(String value) {
    bitwuzlaJNI._IO_FILE__IO_save_end_set(swigCPtr, this, value);
  }

  public String get_IO_save_end() {
    return bitwuzlaJNI._IO_FILE__IO_save_end_get(swigCPtr, this);
  }

  //  public void set_markers(SWIGTYPE_p__IO_marker value) {
  //    bitwuzlaJNI._IO_FILE__markers_set(swigCPtr, this, SWIGTYPE_p__IO_marker.getCPtr(value));
  //  }
  //
  //  public SWIGTYPE_p__IO_marker get_markers() {
  //    long cPtr = bitwuzlaJNI._IO_FILE__markers_get(swigCPtr, this);
  //    return (cPtr == 0) ? null : new SWIGTYPE_p__IO_marker(cPtr, false);
  //  }

  public void set_chain(_IO_FILE value) {
    bitwuzlaJNI._IO_FILE__chain_set(swigCPtr, this, _IO_FILE.getCPtr(value), value);
  }

  public _IO_FILE get_chain() {
    long cPtr = bitwuzlaJNI._IO_FILE__chain_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _IO_FILE(cPtr, false);
  }

  public void set_fileno(int value) {
    bitwuzlaJNI._IO_FILE__fileno_set(swigCPtr, this, value);
  }

  public int get_fileno() {
    return bitwuzlaJNI._IO_FILE__fileno_get(swigCPtr, this);
  }

  public void set_flags2(int value) {
    bitwuzlaJNI._IO_FILE__flags2_set(swigCPtr, this, value);
  }

  public int get_flags2() {
    return bitwuzlaJNI._IO_FILE__flags2_get(swigCPtr, this);
  }

  public void set_old_offset(int value) {
    bitwuzlaJNI._IO_FILE__old_offset_set(swigCPtr, this, value);
  }

  public int get_old_offset() {
    return bitwuzlaJNI._IO_FILE__old_offset_get(swigCPtr, this);
  }

  public void set_cur_column(int value) {
    bitwuzlaJNI._IO_FILE__cur_column_set(swigCPtr, this, value);
  }

  public int get_cur_column() {
    return bitwuzlaJNI._IO_FILE__cur_column_get(swigCPtr, this);
  }

  public void set_vtable_offset(byte value) {
    bitwuzlaJNI._IO_FILE__vtable_offset_set(swigCPtr, this, value);
  }

  public byte get_vtable_offset() {
    return bitwuzlaJNI._IO_FILE__vtable_offset_get(swigCPtr, this);
  }

  public void set_shortbuf(String value) {
    bitwuzlaJNI._IO_FILE__shortbuf_set(swigCPtr, this, value);
  }

  public String get_shortbuf() {
    return bitwuzlaJNI._IO_FILE__shortbuf_get(swigCPtr, this);
  }

  //  public void set_lock(SWIGTYPE_p_void value) {
  //    bitwuzlaJNI._IO_FILE__lock_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  //  }

  //  public SWIGTYPE_p_void get_lock() {
  //    long cPtr = bitwuzlaJNI._IO_FILE__lock_get(swigCPtr, this);
  //    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  //  }

  public void set_offset(long value) {
    bitwuzlaJNI._IO_FILE__offset_set(swigCPtr, this, value);
  }

  public long get_offset() {
    return bitwuzlaJNI._IO_FILE__offset_get(swigCPtr, this);
  }

  //  public void set_codecvt(SWIGTYPE_p__IO_codecvt value) {
  //    bitwuzlaJNI._IO_FILE__codecvt_set(swigCPtr, this, SWIGTYPE_p__IO_codecvt.getCPtr(value));
  //  }
  //
  //  public SWIGTYPE_p__IO_codecvt get_codecvt() {
  //    long cPtr = bitwuzlaJNI._IO_FILE__codecvt_get(swigCPtr, this);
  //    return (cPtr == 0) ? null : new SWIGTYPE_p__IO_codecvt(cPtr, false);
  //  }
  //
  //  public void set_wide_data(SWIGTYPE_p__IO_wide_data value) {
  //    bitwuzlaJNI._IO_FILE__wide_data_set(swigCPtr, this,
  // SWIGTYPE_p__IO_wide_data.getCPtr(value));
  //  }
  //
  //  public SWIGTYPE_p__IO_wide_data get_wide_data() {
  //    long cPtr = bitwuzlaJNI._IO_FILE__wide_data_get(swigCPtr, this);
  //    return (cPtr == 0) ? null : new SWIGTYPE_p__IO_wide_data(cPtr, false);
  //  }

  public void set_freeres_list(_IO_FILE value) {
    bitwuzlaJNI._IO_FILE__freeres_list_set(swigCPtr, this, _IO_FILE.getCPtr(value), value);
  }

  public _IO_FILE get_freeres_list() {
    long cPtr = bitwuzlaJNI._IO_FILE__freeres_list_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _IO_FILE(cPtr, false);
  }

  //  public void set_freeres_buf(SWIGTYPE_p_void value) {
  //    bitwuzlaJNI._IO_FILE__freeres_buf_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  //  }
  //
  //  public SWIGTYPE_p_void get_freeres_buf() {
  //    long cPtr = bitwuzlaJNI._IO_FILE__freeres_buf_get(swigCPtr, this);
  //    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  //  }

  public void set__pad5(long value) {
    bitwuzlaJNI._IO_FILE___pad5_set(swigCPtr, this, value);
  }

  public long get__pad5() {
    return bitwuzlaJNI._IO_FILE___pad5_get(swigCPtr, this);
  }

  public void set_mode(int value) {
    bitwuzlaJNI._IO_FILE__mode_set(swigCPtr, this, value);
  }

  public int get_mode() {
    return bitwuzlaJNI._IO_FILE__mode_get(swigCPtr, this);
  }

  public void set_unused2(String value) {
    bitwuzlaJNI._IO_FILE__unused2_set(swigCPtr, this, value);
  }

  public String get_unused2() {
    return bitwuzlaJNI._IO_FILE__unused2_get(swigCPtr, this);
  }

  public _IO_FILE() {
    this(bitwuzlaJNI.new__IO_FILE(), true);
  }
}
