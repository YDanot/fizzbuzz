package io.thalesdigital;

import io.thalesdigital.fizzbuzz.FizzBuzz;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.thalesdigital.fizzbuzz.rules.Rules.CLASSICS;
import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

  @Test
  void should_fizz_when_multiple_of_3() {
    assertThat(fizzbuzz(3)).isEqualTo("FIZZ");
    assertThat(fizzbuzz(6)).isEqualTo("FIZZ");
  }

  @Test
  void should_buzz_when_multiple_of_5() {
    assertThat(fizzbuzz(5)).isEqualTo("BUZZ");
    assertThat(fizzbuzz(10)).isEqualTo("BUZZ");
  }

  @Test
  void should_fizzbuzz_when_multiple_of_3_and_5() {
    assertThat(fizzbuzz(3*5)).isEqualTo("FIZZBUZZ");
    assertThat(fizzbuzz(3*5*2)).isEqualTo("FIZZBUZZ");
  }

  @Test
  void should_stringify_otherwise() {
    assertThat(fizzbuzz(1)).isEqualTo("1");
    assertThat(fizzbuzz(4)).isEqualTo("4");
  }

  public String fizzbuzz(final int input) {
    return new FizzBuzz(CLASSICS).compute(input);
  }

}
