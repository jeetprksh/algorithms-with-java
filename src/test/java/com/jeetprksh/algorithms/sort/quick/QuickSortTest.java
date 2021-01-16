package com.jeetprksh.algorithms.sort.quick;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

  @Test
  public void sortTest() {
    QuickSort quickSort = new QuickSort();

    int[] arr = {1,3,2,5,1,7,5,2,6};

    int[] expected = {1,1,2,2,3,5,5,6,7};
    int[] actual = quickSort.sort(arr);

    assertArrayEquals(expected, actual);
  }

}