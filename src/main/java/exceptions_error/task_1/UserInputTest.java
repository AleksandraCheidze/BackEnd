package exceptions_error.task_1;

import java.util.Scanner;

public class UserInputTest {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = scanner.nextLine();

    int age;

    System.out.println("Enter your age: ");
    try {
      age = Integer.parseInt(scanner.nextLine());
    }catch (Exception e) {
      System.out.println("Некорректные данные! Значение возраста по умолчанию принято 0.");
      age = 0;
      e.printStackTrace();
      System.out.println("Причина ошибки - " + e.getCause());
      System.out.println("Сообщение об ошибке - " + e.getMessage());
      System.out.println("Пользователь ввел след некорректные данные: " + e.getMessage());
    }
    System.out.printf("Name - %s, Age -%d\n", name, age);
    System.out.println("Программа завершена успешно!");
  }
}



