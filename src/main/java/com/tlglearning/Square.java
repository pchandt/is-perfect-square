package com.tlglearning;

/**
 * Defines a single static method, {@link #isPerfectSquare(long)}, which evaluates a specified value
 * to determine whether it is a perfect square.
 */
public final class Square {

  private Square() {
    // NOTE: There is NO need to do anything with this constructor! The method you will implement in
    // this class is static; thus, there is no need to create instances of this class. Making the
    // constructor private prevents this class from being instantiated, and prevents a compiler- 
    // generated default from being generated (and being documented by Javadoc).
  }

  /**
   * Computes and returns a {@code boolean} flag indicating whether the provided {@code input} is a
   * perfect square. A negative {@code input} value will result in {@link IllegalArgumentException}
   * being thrown.
   *
   * @param input Value to be tested.
   * @return Flag indicating whether {@code input} is a perfect square or not.
   * @throws IllegalArgumentException When {@code input} is negative.
   */
  public static boolean isPerfectSquare(long input) throws IllegalArgumentException {
    if(input < 0){
      throw new IllegalArgumentException();
    }
    throw new UnsupportedOperationException("Not yet implemented"); // TODO Replace with implementation.
  }

}
