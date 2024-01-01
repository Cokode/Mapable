package generics;

public record Man(String name, int age) implements action{
  @Override
  public void walking() {
    System.out.println(name + " is Walking");
  }

  @Override
  public void running() {
    System.out.println(name + " is Running");
  }

  @Override
  public String toString(){
    return "Name: " + name + "  Age: " + age;
  }
}
