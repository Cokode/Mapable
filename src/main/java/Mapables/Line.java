package Mapables;

public record Line(String name, String location) implements MappableInterface{
  @Override
  public String render() {
    return name + " " + location;
  }
}
