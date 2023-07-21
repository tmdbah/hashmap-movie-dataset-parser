import java.util.Scanner; // Import the Scanner class

public class Movie implements Comparable<Movie> {

  //Declare Variables
	private int rank;
  private String Title;
  private String Genre;
  private String Description;
  private String Director;
  private String Actors;
	private int Year;
	private int Duration; //rutime in minute
	private double Rating;
  private int Votes;
  private Double Revenue;
  private int Metascore;

  //Declare Constructors
  Movie(){
    this.rank = 0;
    this.Title = "Invalid_data";
    this.Genre = "";
    this.Description = "";
    this.Director = "";
    this.Actors = "";
    this.Year = 0; // Default
    this.Duration = 0; //rutime in minute
    this.Rating = 0.0;
    this.Votes = 0;
    this.Revenue = 0.0;
    this.Metascore = 0;
  }
  Movie(int rank, String Title, String Genre, String Description, String Director, String Actors, int Year, int Duration, double Rating, int Votes, double Revenue, int Metascore){
    this.rank = rank;
    this.Title = Title;
    this.Genre = Genre;
    this.Description = Description;
    this.Director = Director;
    this.Actors = Actors;
    this.Year = Year; // int
    this.Duration = Duration; //rutime in minute (int)
    this.Rating = Rating; // double
    this.Votes = Votes; // int
    this.Revenue = Revenue; // double
    this.Metascore = Metascore; // int
  }

  // DECLARE SETTERS
  public void setRank(int rank)
  {
    this.rank = rank;
  }
  public void setTitle(String Title)
  {
    this.Title = Title;
  }
  public void setGenre(String Genre)
  {
    this.Genre = Genre;
  }
  public void setDescription(String Description)
  {
    this.Description = Description;
  }
  public void setDirector(String Director)
  {
    this.Director = Director;
  }
  public void setActors(String Actors)
  {
    this.Actors = Actors;
  }
  public void setYear(int Year)
  {
    this.Year = Year;
  }
  public void setDuration(int Duration)
  {
    this.Duration = Duration; //rutime in minute (int)
  }
  public void setRating(double Rating)
  {
    this.Rating = Rating; // double
  }
  public void setVotes(int Votes)
  {
    this.Votes = Votes; // int
  }
  public void setRevenue(double Revenue)
  {
    this.Revenue = Revenue; // double
  }
  public void setMetascore(int Metascore)
  {
    this.Metascore = Metascore; // int
  }
    
  // DECLARE GETTERS
  String getTitle(){
    return this.Title;
  }
  int getRank()
  {
    return this.rank;
  }
  String getGenre()
  {
    return this.Genre;
  }
  String getDescription()
  {
    return this.Description;
  }
  String getDirector()
  {
    return this.Director;
  }
  String getActors()
  {
    return this.Actors;
  }
  int getYear()
  {
    return this.Year;
  }
  int getDuration()
  {
    return this.Duration; //rutime in minute (int)
  }
  double getRating()
  {
    return this.Rating; // double
  }
  int getVotes()
  {
    return this.Votes; // int
  }
  double getRevenue()
  {
    return this.Revenue; // double
  }
  int getMetascore()
  {
    return this.Metascore; // int
  }

///OVERIDE THE compareTo METHOD TO COMPARE by REVENUE
// 4.Implementing the overide of the compareTo Method in order to compare Movies by revenue  ???? 
 @Override
  public int compareTo(Movie other) {
  if (this.Revenue > other.Revenue) {
    // If current (this.) object is greater, return 1
    return 1;
  }
  else if (this.Revenue < other.Revenue) {
    // If other object is greater, return -1
    return -1;
  }
  else {
    // If current (this.) object is equal to other object, return 0
    return 0;
  }
 } 

/* IMPLEMENT  printTitleRevnue METHOD WHICH  PRINTS THE TITLE 
OF THE MOVIE AND IT'S REVENUE*/

  public void printTitleRevnue() { 
    System.out.println(" TITLE: " + this.Title +  "; REVENUE: $" + this.Revenue + "\n");
			System.out.println();
  }
	

//Method to print the detail of a movie
	public void printMovieDetails() {
			System.out.println("TITLE: " + this.Title + "; GENRE: " + this.Genre + "; DESCRIPTION: " + this.Description + "; DIRECTOR: " + this.Director + "; ACTORS:" + this.Actors  + "; YEAR: " + this.Year  + "; DURATION: " + this.Duration + " minutes"  
					 + "; RATING: " + this.Rating + "; VOTES: " + this.Votes + "; REVENUE: $" + this.Revenue + " Million USD; METASCORE: " + this.Metascore+ "\n");
			System.out.println();
		
	}
}
