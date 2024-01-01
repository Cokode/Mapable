package generics;

import java.util.ArrayList;
import java.util.List;

public class BaseballTeam {

  private String teamName;
  private List<BaseBallPlayer> teamMembers = new ArrayList<>();
  private int totalWins = 0;
  private int totalLossess = 0;
  private int totalTies = 0;

  public BaseballTeam(String teamName) {
    this.teamName = teamName;
  }


  public void addTeamMember(BaseBallPlayer player) {
    if (!teamMembers.contains(player)) {
      teamMembers.add(player);
    }
  }

  public void listTeamMembers () {
    System.out.println(teamName + " Roster:");
    System.out.println(teamMembers);
  }

  public int ranking()git  {
    return (totalLossess * 2) + totalTies + 1;
  }

  public String setScore(int ourScour, int theirScore) {
    String message = "lost to";
    if (ourScour > theirScore) {
      totalWins++;
      message = "beat";
    } else if (ourScour == theirScore) {
      totalTies++;
      message = "tied";
    } else {
      totalLossess++;
    }

    return message;
  }

  @Override
  public String toString() {
    return teamName + " (Ranked " + ranking() + ")";
  }

}
