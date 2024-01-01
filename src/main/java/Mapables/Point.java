package Mapables;

public record Point(String name, String location) implements MappableInterface{
  @Override
  public String render() {
    return name + " " + location;
  }
}
