package io.thalesdigital.fizzbuzz.rules;

public class Rule {

  private final String word;
  private final int factor;

  public Rule(final String word, final int factor) {
    this.word = word;
    this.factor = factor;
  }

  public String apply(final int input) {
    return isMultipleOf(input) ? word : "";
  }

  private boolean isMultipleOf(final int input) {
    return input % factor == 0;
  }
}
