package io.thalesdigital.fizzbuzz.rules;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Rules {

  public static final Rules CLASSICS = new Rules(
          List.of(
            new Rule("FIZZ", 3),
            new Rule("BUZZ", 5)
          )
  );

  private final List<Rule> rules;

  public Rules(final List<Rule> rules) {
    this.rules = rules;
  }

  public Optional<String> apply(int input) {
    return applyRules(input)
            .filter(word -> !word.isEmpty())
            .reduce(concat());
  }

  private BinaryOperator<String> concat() {
    return (s1, s2) -> s1 + s2;
  }

  private Stream<String> applyRules(final int input) {
    return rules.stream()
            .map(r -> r.apply(input));
  }
}
