package Util_Tests_HW;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SecondLargestElementTest {

  private SecondLargestElement secondLargestElement = new SecondLargestElement();

  @Test
  void checkIfFindSecondLargest() {
    int[] array1 = {5, 8, 2, 10, 7, 3};
    int actual = secondLargestElement.findSecondLargest(array1);
    int expected = 8;
    assertEquals(expected, actual);
  }

  @Test
  public void expectExceptionIfArgumentIsIncorrect() {
    int[] invalidArray = {1};
    assertThrows(IllegalArgumentException.class,
        () -> secondLargestElement.findSecondLargest(invalidArray));
  }
}
