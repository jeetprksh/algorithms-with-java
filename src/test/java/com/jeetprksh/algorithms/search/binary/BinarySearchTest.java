package com.jeetprksh.algorithms.search.binary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

  @Test
  public void testSearchOne() {
    int[] array = new int[]{0,1,2,3,4,5,6,7,8,9};
    BinarySearch search = new BinarySearch();
    assertEquals(search.search(array, 9), 9);
  }

  @Test
  public void testSearchTwo() {
    int[] array = new int[]{0,1,2,3,4,5,6,7,8,9};
    BinarySearch search = new BinarySearch();
    assertEquals(search.search(array, 10), -1);
  }

}