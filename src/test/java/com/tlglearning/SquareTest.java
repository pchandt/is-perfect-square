package com.tlglearning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class SquareTest {

  @ParameterizedTest
  @ValueSource(longs = {-1, -10, Long.MIN_VALUE})
  void isPerfectSquare_negative(long input) {
    class InvalidInput implements Executable {

      @Override
      public void execute() throws Throwable {
        Square.isPerfectSquare(input);

      }
    }
    assertThrows(IllegalArgumentException.class, new InvalidInput());
  }
  @ParameterizedTest
  @ValueSource(longs = {0, 4_096, 428_135_971_041L})
  void isPerfectSquare_square(long input){
    assertTrue(Square.isPerfectSquare(input));

}
  @ParameterizedTest
  @ValueSource(longs = {2,4_097})
  void isPerfectSquare_nonSquare(long input) {
    assertFalse(Square.isPerfectSquare(input));
  }

}