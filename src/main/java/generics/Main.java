package generics;

public class Main {

  public static void main(String[] args) {
    BaseballTeam phillies = new BaseballTeam("Philadelphia Phillies");
    BaseballTeam astros = new BaseballTeam("Houston Astros");

    scoreResult(phillies, 4, astros, 9);

    var harper = new BaseBallPlayer("B Harper", "Right Fielder");
    var marsh = new BaseBallPlayer("B Marsh", "Right Fielder");
    phillies.addTeamMember(harper);
    phillies.addTeamMember(marsh);
    phillies.listTeamMembers();


    System.out.println();
    Person<BaseBallPlayer> person = new Person<>();
    person.addPerson(new BaseBallPlayer("Johnson", "Right Side "));
    person.addPerson(new BaseBallPlayer("Collins", "Left Man"));


    var frank = new BaseBallPlayer("Frank", "Keeper");

    person.addPerson(frank);
    person.printPerson();

    var goat = new Person<String>();
    goat.addPerson("She Goat");
    goat.addPerson("He Goat");

    goat.printPerson();

    //

    System.out.println();
    var man = new Person<Man>();
    var firstMan = new Man("Paul", 50);
    firstMan.walking();
    firstMan.running();
    man.addPerson(firstMan);
    man.printPerson();



  }

  public static void scoreResult(BaseballTeam team1, int t1_score,
                                 BaseballTeam team2, int t2_score) {
    String message = team1.setScore(t1_score, t2_score);
    team2.setScore(t2_score, t1_score);

    System.out.printf("%s %s %s %n", team1, message, team2);
  }
}
