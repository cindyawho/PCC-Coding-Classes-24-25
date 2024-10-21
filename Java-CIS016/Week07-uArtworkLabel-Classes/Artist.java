public class Artist {
    // TODO: Declare private fields - artistName, birthYear, deathYear
    private String artistName;
    private int birthYear;
    private int deathYear;
 
    // TODO: Define default constructor
    public Artist() {
         artistName = "unknown";
         birthYear = -1;
         deathYear = -1;
    }
 
    // TODO: Define second constructor to initialize 
    //       private fields (artistName, birthYear, deathYear)
    public Artist(String a, int b, int d) {
         artistName = a;
         birthYear = b;
         deathYear = d;
    }
    
    // TODO: Define get methods: getName(), getBirthYear(), getDeathYear()
    public String getName(){
     return artistName;
    }
    public int getBirthYear(){
     return birthYear;
    }
    public int getDeathYear(){
     return deathYear;
    }
 
    // TODO: Define printInfo() method
    //       If deathYear is entered as -1, only print birthYear
     public void printInfo(){
         System.out.print("Artist: " + artistName + " ");
         if(birthYear >= 0 && deathYear >= 0){
             System.out.print("(" + birthYear + " to " + deathYear + ")");
         } else if (birthYear >= 0) {
             System.out.print("(" + birthYear + " to present)");
         } else{
             System.out.print("(unknown)");
         }
         System.out.println("");
     }
 
 }