package io.thalesdigital.fizzbuzz;

import io.thalesdigital.fizzbuzz.rules.Rules;

public class FizzBuzz {

  private final Rules rules;

  public FizzBuzz(Rules rules) {
    this.rules = rules;
  }

  public String compute(final int input) {
    return rules.apply(input).orElse(String.valueOf(input));
  }

}
