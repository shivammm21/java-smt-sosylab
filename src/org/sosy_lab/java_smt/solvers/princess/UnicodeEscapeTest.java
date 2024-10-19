/*
 * This file is part of JavaSMT,
 * an API wrapper for a collection of SMT solvers:
 * https://github.com/sosy-lab/java-smt
 *
 * SPDX-FileCopyrightText: 2024 Dirk Beyer <https://www.sosy-lab.org>
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package org.sosy_lab.java_smt.solvers.princess;

import static com.google.common.truth.Truth.assertThat;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;

public class UnicodeEscapeTest {
  /** Some valid encodings for Unicode characters in SMTLIB2. */
  Map<String, String> validCodes =
      ImmutableMap.of(
          "\\uabcd", "ꯍ", "\\u{a}", "\n", "\\u{ab}", "«", "\\u{abc}", "઼", "\\u{abcd}", "ꯍ");

  /**
   * Examples of invalid encodings for Unicode characters.
   *
   * <p>Note that <code>"\\u{abcde}"</code> is in fact valid in STMLIB, but we can't translate it to
   * a single UTF16 character for Princess.
   */
  List<String> invalidCodes =
      ImmutableList.of(
          "\\uabc", "\\uabcde", "\\u000g", "\\u{}", "\\u" + "{abcde}", "\\u{g}", "\\u{abcd");

  @Test
  public void validCodesTest() {
    for (Map.Entry<String, String> code : validCodes.entrySet()) {
      assertThat(PrincessStringFormulaManager.unescapeString(code.getKey()))
          .isEqualTo(code.getValue());
    }
  }

  @Test
  public void invalidCodesTest() {
    for (String code : invalidCodes) {
      // Invalid codes need to be preserved. It is important that we don't match, and simply copy
      // them over.
      assertThat(PrincessStringFormulaManager.unescapeString(code)).isEqualTo(code);
    }
  }
}
