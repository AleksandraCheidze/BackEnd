package Util_Tests_HW;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SecondSmallestElementTest {

  private SecondSmallestElement secondSmallestElement = new SecondSmallestElement();

  @Test
  void checkIfSecondSmallestElement() {
    int[] array = {-1, 4, 0, 2, 7, -3};
    int actual = secondSmallestElement.findSecondSmallestElement(array);
    int expected = -1;
    assertEquals(actual,expected);
  }
  @Test
  public void expectExceptionIfArgumentIsIncorrect() {
    int[] invalidArray = {1};
    assertThrows(IllegalArgumentException.class,
        () -> secondSmallestElement.findSecondSmallestElement(invalidArray));
  }
}