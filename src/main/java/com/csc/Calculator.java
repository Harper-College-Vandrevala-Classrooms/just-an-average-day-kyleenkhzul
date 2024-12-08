package com.csc;

import java.util.Arrays;
public class Calculator {

  public int maximumUsingForLoop(int[] arr) {
    int max = Integer.MIN_VALUE;
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  public int minimumUsingForLoop(int[] arr) {
    int min = Integer.MAX_VALUE;
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }

  public int sumUsingForLoop(int[] arr) {
    int sum = 0;
    for(int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }

    return sum;
  }

  public int averageUsingForLoop(int[] arr) {
    int sum = 0;
    for(int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum/arr.length;
  }

  public int maximumUsingStream(int[] arr) {
    return Arrays.stream(arr).max().orElseThrow(() -> new IllegalArgumentException("Array is Empty"));
  }

  public int minimumUsingStream(int[] arr) {
    return Arrays.stream(arr).min().orElseThrow(() -> new IllegalArgumentException("Array is Empty"));
  }

  public int sumUsingStream(int[] arr) {
    return Arrays.stream(arr).sum();
  }

  public int averageUsingStream(int[] arr) {
    return (int)Arrays.stream(arr).average().orElseThrow(() -> new IllegalArgumentException("Array is Empty"));
  }
}
