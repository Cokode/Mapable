package Mapables;

public record Point(String name, String location) implements MappableInterface{
  @Override
  public void render() {
    System.out.println(name + " " + location);
  }
}
