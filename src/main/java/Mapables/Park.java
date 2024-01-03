package Mapables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Park<T extends  Point> {

  private String name;
  private List<T> parks = new ArrayList<>();

  public Park(String name) {
    this.name = name;
  }

  public void addPark(T t) {
    if(!parks.contains(t)) {
      parks.add(t);
    }
  }

  public void printPark() {
    for (T t : parks) {
      t.render();
    }
  }

  public void st (String... words) {
    String[] mywords = Arrays.toString(words).split(",");

    System.out.println(Arrays.toString(mywords));

    System.out.println(this + " Now too");
  }

  @Override
  public String toString() {
    return name;
  }


}
