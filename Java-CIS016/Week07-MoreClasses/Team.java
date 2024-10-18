public class Team {
    // TODO: Declare private fields - name, wins, losses
    private String name;
    private int wins;
    private int losses;
    
    
    // TODO: Define mutator methods - 
    //       setName(), setWins(), setLosses()
    public void setName(String input){
     name = input;
    }
    public void setWins(int input){
     wins = input;
    }
    public void setLosses(int input){
     losses = input;
    }
    
    // TODO: Define accessor methods - 
    //       getName(), getWins(), getLosses()
    public String getName(){
     return name;
    }
    public int getWins(){
     return wins;
    }
    public int getLosses(){
     return losses;
    }
    
    
    // TODO: Define getWinPercentage()
    public double getWinPercentage(){
     return (double) wins / (wins + losses);
    }
    
    // TODO: Define printStanding()
    public void printStanding(){
         double winPer = getWinPercentage();
         String formattedWinPer = String.format("%.2f", winPer);
         if (winPer >= 0.5){
             System.out.println("Win percentage: " + formattedWinPer);
             System.out.println("Congratulations, Team " + name + " has a winning average!");
         } else {
             System.out.println("Win percentage: " + formattedWinPer);
             System.out.println("Team " + name + " has a losing average.");
         }
    }
    
 }