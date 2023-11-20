package Util_Tests_HW;

import java.util.Arrays;

public class SecondSmallestElement {

  public static int findSecondSmallestElement (int[] array){
    if (array.length < 2) {
      throw new IllegalArgumentException("Массив должен содержать как минимум два элемента.");
    }

    Arrays.sort(array);

    return array[1];
  }

}
