public class Artwork {
    // TODO: Declare private fields - title, yearCreated
    private String title;
    private int yearCreated;
    
    // TODO: Declare private field artist of type Artist 
    private Artist artist = new Artist();
 
    // TODO: Define default constructor
    public Artwork(){
     title = "unknown";
     yearCreated = -1;
    }
    
    // TODO: Define get methods: getTitle(), getYearCreated()
    public String getTitle(){
     return title;
    }
    public int getYearCreated(){
     return yearCreated;
    }
 
    // TODO: Define second constructor to initialize 
    //       private fields (title, yearCreated, artist)
    public Artwork(String t, int y, Artist a){
     title = t;
     yearCreated = y;
     artist = a;
    }
 
    // TODO: Define printInfo() method
    //       Call the printInfo() method in Artist.java to print an artist's information                                                                                          
     public void printInfo(){
         artist.printInfo();
         System.out.println("Title: " + title + ", " + yearCreated);
     }
 }