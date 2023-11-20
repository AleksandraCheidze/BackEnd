package Util_Tests_HW;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class RepeatElements {

  public static int[] removeDuplicates(int[] array) {
    List<Integer> list = new ArrayList<>();
    for (int element : array) {
      list.add(element);
    }
    for (int i = 0; i < list.size(); i++) {
      int currentNumber = list.get(i);
      for (int j = i + 1; j < list.size(); j++) {
        if (currentNumber == list.get(j)) {
          list.remove(j);
          j--;
        }
      }
    }

    int[] resultArray = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      resultArray[i] = list.get(i);
    }
    return resultArray;
  }
}

