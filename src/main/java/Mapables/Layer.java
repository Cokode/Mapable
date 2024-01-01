package Mapables;

import java.util.ArrayList;
import java.util.List;

public class Layer <T> {
  List<T> mappable = new ArrayList<>();

  public Layer (String name) {}

  public void add(T t) {
    if(!mappable.contains(t)) {
      mappable.add(t);
    }
  }


  public void renderLayer() {
    mappable.forEach(System.out::println);
  }


}
