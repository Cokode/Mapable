package Mapables;

import java.util.ArrayList;
import java.util.List;

public class River <S extends Line> {
  private String name;
  private List<S> rivers = new ArrayList<>();

  public River(String name) {
    this.name = name;
  }

  public void addPark(S s) {
    if(!rivers.contains(s)) {
      rivers.add(s);
    }
  }

  public void printRiver() {
    for (S s : rivers) {
      s.render();
    }
  }

  @Override
  public String toString() {
    return name;
  }


}
