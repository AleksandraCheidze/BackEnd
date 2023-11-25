package comparing.taski_01;

public class PrimitiveComparing {

  public static void main(String[] args) {

    int x = 5;
    int y = 10;
    int z = 5;

    boolean result = x == y;
    System.out.println("Result of comparing x and y - " + result);

    result = x == z;
    System.out.println("Result of comparing x and z - " + result);

    Integer integer = 5;
    int value = integer;

    result = x == integer;
    System.out.println("Result of comparin x and integer - " + result);

    Cat cat3 = new Cat(3,"Black", 4.5);
    Cat cat4 = new Cat(3, "Black",4.5);

    result = cat3 == cat4;
    System.out.println(result);

    result = cat3.equals(cat4);
    System.out.println(result);

  }

}
