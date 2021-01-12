package com.jeetprksh.algorithms.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

  @Test
  public void testFibonacci() {
    Fibonacci fibonacci = new Fibonacci();
    int actualNumber = fibonacci.findNth(7);
    int expectedNumber = 13;
    assertEquals(actualNumber, expectedNumber);
  }

}
