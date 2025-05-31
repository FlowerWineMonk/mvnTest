package com.example;
import com.google.gson.Gson;

public class App {
  public static void main( String[] args ) {
    Person person = new Person("Alice", 25);
    Gson gson = new Gson();
    String json = gson.toJson(person);
    System.out.println(json);
  }
}

class Person {
  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}
