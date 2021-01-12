package com.jeetprksh.algorithms.search.binary;

public class BinarySearch {

  public int search(int[] array, int target) {
    int left = 0;
    int right = array.length -1;
    int mid;

    while(left <= right) {
      mid = (right + left) / 2;

      if (array[mid] == target) {
        return mid;
      } else if (array[mid] > target) {
        right = mid - 1;
      } else if (array[mid] < target) {
        left = mid + 1;
      }
    }

    return -1;
  }

}
