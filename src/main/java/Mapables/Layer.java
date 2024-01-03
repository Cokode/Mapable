package Mapables;

import java.util.ArrayList;
import java.util.List;

public class Layer <T> {
  List<T> layers = new ArrayList<>();

  public Layer (String name) {}

  public void addPark(T t) {
    if(!layers.contains(t)) {
      layers.add(t);
    }
  }

  public void renderLayer() {
    for (T l : layers) {
    }


  }


}
