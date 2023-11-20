package Util_Tests_HW;

import java.util.Arrays;

public class SecondLargestElement {
  public static int findSecondLargest(int[] array) {
    if (array.length < 2) {
      throw new IllegalArgumentException("Массив должен содержать как минимум два элемента.");
    }

    Arrays.sort(array);

    return array[array.length - 2];
  }
}


