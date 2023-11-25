package exceptions_error.homework;
import java.util.Scanner;
// Запросить значение n у пользователя.
// Вызвать метод и передать туда значение, полученное от пользователя.
// Посмотреть, какие ошибки возможны в данном коде и для каждой
// ошибки создать пользовательское исключение.
// Выбросить эти исключения в нужное время и обработать их в main.
public class Main {

  public static void main(String[] args)
      throws IndexOutOfBoundsException, DevideByZeroException, NegativeArraySizeException {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите цифру: ");
    int n = Integer.parseInt(scanner.nextLine());
    try {
      testingExceptions(n);
    }catch (DevideByZeroException | NegativeArraySizeException | IndexOutOfBoundsException e){
      System.out.println("Ошибка!" + e.getMessage());
    }
    System.out.println("Успешное завершение программы!");
  }

    public static void testingExceptions ( int n)
        throws DevideByZeroException, NegativeArraySizeException, IndexOutOfBoundsException {

    if (n==0) {
      throw new DevideByZeroException("Нельзя делить на ноль!");
    }
      int x = 10 / n;
      System.out.println(x);

      if (n < 0) {
        throw new NegativeArraySizeException("Размер массива не может быть отрицательным!");
      }
      int[] array = new int[n];
      if (n >= array.length) {
        throw new IndexOutOfBoundsException("Индекс массива выходит за пределы!");
      }
      System.out.println(array.length);
      System.out.println(array[n]);
    }
  }


