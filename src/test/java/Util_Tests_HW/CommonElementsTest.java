package Util_Tests_HW;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class CommonElementsTest {

  private CommonElements commonElements = new CommonElements();

  @Test
  public void checkIfArrayContainsCommonValues() {
    int[]A = {1, 2, 5, 5, 8, 9, 7, 10};
    int[]B = {1, 0, 6, 15, 6, 4, 7, 0};
    Set<Integer> actual = commonElements.findCommonElements(A, B);
    Set<Integer> expected = Set.of(1, 7);
    assertEquals(expected, actual);
  }
  @Test
  public void checkFindCommonElementsWithEmptyArrays() {
    int[] A = {};
    int[] B = {};

    Set<Integer> result = commonElements.findCommonElements(A, B);

    assertNull(result);
  }

  @Test
  public void checkFindCommonElementsWithNoCommonElements() {

    int[] A = {1, 2, 3};
    int[] B = {4, 5, 6};

    Set<Integer> result = commonElements.findCommonElements(A, B);

    assertNull(result);
  }
}

