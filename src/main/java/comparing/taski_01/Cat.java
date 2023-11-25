package comparing.taski_01;

import java.util.Objects;

public class Cat implements Comparable<Cat> {

  private int age;
  private String color;
  private double weight;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  @Override
  public boolean equals(Object o) {

    if (this == o) {
      return true;
    }

    if (!(o instanceof Cat)) {
      return false;
    }

    Cat cat = (Cat) o;
    return age == cat.age && Double.compare(weight, cat.weight) == 0
        && Objects.equals(color, cat.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, color, weight);
  }

  public Cat(int age, String color, double weight) {
    this.age = age;
    this.color = color;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "Cat{" +
        "age=" + age +
        ", color='" + color + '\'' +
        ", weight=" + weight +
        '}';
  }

  @Override
  public int compareTo(Cat anotherCat) {
    int result = Double.compare(weight, anotherCat.weight);
    if (result != 0) {
      return result;
    }
    result = age - anotherCat.age;
    if (result != 0) {
      return result;
    }
    if (color == null && anotherCat.color != null) {
      return -1;
    }

    if (color == null) {
      return 0;
    }
    return color.toLowerCase().compareTo(anotherCat.color.toLowerCase());
  }

}




