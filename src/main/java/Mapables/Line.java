package Mapables;

public record Line(String name, String location) implements MappableInterface{
  @Override
  public void render() {
    System.out.println(name + " " + location);
  }
}
