package generics;

import java.util.ArrayList;
import java.util.List;

public class Person<T> {
  private final List<T> persons = new ArrayList<>();

  public Person () {
  }

  public void addPerson(T person) {
    if(!persons.contains(person)){
      persons.add(person);
    }
  }

  public void printPerson() {
    persons.forEach(System.out::println);
  }


}
