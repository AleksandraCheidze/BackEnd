package Util_Tests_HW;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 1.Напишите программу на Java для поиска общих элементов
// между двумя массивами целых чисел example input:
// Array1: [1, 2, 5, 5, 8, 9, 7, 10]
// Array2: [1, 0, 6, 15, 6, 4, 7, 0]
// example expected: [1,7]
public class CommonElements {

  public static Set<Integer> findCommonElements(int[] A, int[] B) {
    Set<Integer> setA = new HashSet<>();
    Set<Integer> commonSet = new HashSet<>();

    for (int a : A) {
      setA.add(a);
    }

    for (int b : B) {
      if (setA.contains(b)) {
        commonSet.add(b);
      }
    }

    return commonSet.isEmpty() ? null : commonSet;
  }
}