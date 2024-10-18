import java.util.Scanner;
/*
 * Given main(), define the Team class (in file Team.java). For class method getWinPercentage(), the formula is:
wins / (wins + losses). Note: Use casting to prevent integer division.

For class method printStanding(), output the win percentage of the team with two digits after the decimal point and whether the team has a winning or losing average. A team has a winning average if the win percentage is 0.5 or greater.

Ex: If the input is:

Ravens
13
3 
where Ravens is the team's name, 13 is the number of team wins, and 3 is the number of team losses, the output is:

Win percentage: 0.81
Congratulations, Team Ravens has a winning average!
Ex: If the input is:

Angels
80
82
the output is:

Win percentage: 0.49
Team Angels has a losing average.
 */
public class WinningTeam {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      Team team = new Team();
      
      String name = scnr.next();
      int wins = scnr.nextInt();
      int losses = scnr.nextInt();
      
      team.setName(name);
      team.setWins(wins);
      team.setLosses(losses);
      
      team.printStanding();
   }
}
