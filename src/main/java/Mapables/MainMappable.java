package Mapables;

public class MainMappable {

  public static void main(String[] args) {
    var park = new Park<>("Parks");

    var point = new Point("Abuja", "80.93830389. -83038393.83");
    var point2 = new Point("Lagos", "80.93830389. -83038393.83");

    var river = new River<>("River");
    var riverNile = new Line("RiverNile", "80.93830389. -83038393.83");
    river.addPark(riverNile);

    System.out.println(river);
    river.printRiver();

    park.addPark(point);
    park.addPark(point2);

    System.out.println(park);
    park.printPark();

    park.st("393839, doedkjd, yes, uieehd, 90389309, djdid");

  }
}
