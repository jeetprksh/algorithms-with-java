package com.jeetprksh.algorithms.recursion;

public class Fibonacci {

  /*
   * Returns the Fibonacci number at nth index.
   * */
  int findNth(int n) {
    if (n < 2)
      return n;
    else {
      return findNth(n - 1) + findNth(n - 2);
    }
  }

  /*
   * Prints the first n elements of Fibonacci series.
   * Provided valid first and second numbers given.
   * */
  int print(int first, int second, int n) {
    if (first == 0 && second == 1) {
      System.out.print(first + " " + second + " ");
      int nextItem = first + second;
      System.out.print(nextItem + " ");
      return print(second, nextItem, n - 3);
    } else {
      if (n <= 0) {
        return 0;
      } else {
        int nextItem = first + second;
        System.out.print(nextItem + " ");
        return print(second, nextItem, n - 1);
      }
    }
  }

}
