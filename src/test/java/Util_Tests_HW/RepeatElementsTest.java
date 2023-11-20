package Util_Tests_HW;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RepeatElementsTest {

  private RepeatElements repeatElements = new RepeatElements();
  @Test
  public void checkIfRemoveDuplicates() {
    int[] inputArray = {0,3,-2,4,3,2};
    int[] expectedArray = {0,3,-2,4,2};

    int[] resultArray = repeatElements.removeDuplicates(inputArray);

    assertArrayEquals(expectedArray, resultArray);
  }

  @Test
  public void checkIfRemoveDuplicatesWithEmptyArray() {
    int[] inputArray = {};
    int[] expectedArray = {};

    int[] resultArray = repeatElements.removeDuplicates(inputArray);

    assertArrayEquals(expectedArray, resultArray);
  }

  @Test
  public void checkIfRemoveDuplicatesWithAllDuplicates() {
    int[] inputArray = {1, 1, 1, 1, 1};
    int[] expectedArray = {1};

    int[] resultArray = repeatElements.removeDuplicates(inputArray);

    assertArrayEquals(expectedArray, resultArray);
  }
}

