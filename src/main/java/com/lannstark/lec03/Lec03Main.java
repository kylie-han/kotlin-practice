package com.lannstark.lec03;

public class Lec03Main {

  public static void main(String[] args) {
    System.out.println("hello");
    printAgeIfPerson(null);
  }

  public static void printAgeIfPerson(Object obj) {
    if (obj instanceof Person) {
      Person person = (Person) obj;
      System.out.println(person.getAge());
    }
  }

}
