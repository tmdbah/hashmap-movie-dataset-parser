import java.io.*;
import java.util.*; // Includes Scanner + HashMap + Comparator

//import java.util.Scanner; // Import the Scanner class to read text 
//import java.util.HashMap; // import the HashMap class

class Main {
  //driver function
  public static void main(String[] args) {
 
  //1. Implement a HashMap called movieYearMap whose key is the movie Year, an Integer, and whose Value is a List of all Movies in that year (5 points)

  // Create a HashMap
  HashMap<Integer, List<Movie>> movieYearMap = new HashMap<Integer, List<Movie>>();

  // List of years
  List<Integer> yearsList = new ArrayList<Integer>();

  // Declare variables
  String data;

   try {
      // Movie Data from CSV 
      //File myObj = new File("IMDB-Movie-Data.csv"); // Create new file object myObj - IMDB-Movie-Data.csv

      // Test File 10 Movies
      File myObj = new File("IMDB-Movie-Data.csv"); // Create new file object myObj - IMDB-Movie-Data-b.csv

      Scanner myReader = new Scanner(myObj); // Input stream from myObj

      data = myReader.nextLine(); // Read and ingnore header line in file
              
      while (myReader.hasNextLine()) {

        // 1.1 Read In Movie Data
        data = myReader.nextLine();

        // 1.2 Create a new Movie
        Movie temp_movie = new Movie();
        
        // 1.3 Parse Movie Data, Read in from line
        temp_movie = parseMovie(data);

        // Check if Movie is invaild and ignore [0]

        if (temp_movie.getYear() != 0){

        // 1.4 Extract year from Movie
        int getYearInteger = Integer.valueOf(temp_movie.getYear());

        // 2.0 Check the HashMap 

        // If year/KEY is already created

        if (movieYearMap.containsKey(getYearInteger)) {

         // get the value/List associated w/ that year/KEY 
         movieYearMap.get(getYearInteger).add(temp_movie);

        }
        else {

         // List of New Movies
         List<Movie> newmovieList = new ArrayList<Movie>();

         // Add temp_Movie to movieList
         newmovieList.add(temp_movie);

        
         // Add to HashMap ?? KEY = Year , Value is Movie List movieList
         movieYearMap.put(getYearInteger, newmovieList);
        
        }
         
        //If line of data created a valid Movie object
        if(temp_movie.getTitle() != "Invalid_data"){

          //Print Movie Object details

          //temp_movie.printMovieDetails();

        } // if ** END ** 
      }     
     } // While LOOP END   
     myReader.close(); // Close Scanner Reader Input
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } //File Reader End

   // Display list sorted in desending order **Brute Force**

   List<Movie> results2006 = movieYearMap.get(2006);
   Collections.sort(results2006, Collections.reverseOrder());

   List<Movie> results2007 = movieYearMap.get(2007);
   Collections.sort(results2007, Collections.reverseOrder());

   List<Movie> results2008 = movieYearMap.get(2008);
   Collections.sort(results2008, Collections.reverseOrder());

   List<Movie> results2009 = movieYearMap.get(2009);
   Collections.sort(results2009, Collections.reverseOrder());

   List<Movie> results2010 = movieYearMap.get(2010);
   Collections.sort(results2010, Collections.reverseOrder());

   List<Movie> results2011 = movieYearMap.get(2011);
   Collections.sort(results2011, Collections.reverseOrder());

   List<Movie> results2012 = movieYearMap.get(2012);
   Collections.sort(results2012, Collections.reverseOrder());

   List<Movie> results2013 = movieYearMap.get(2013);
   Collections.sort(results2013, Collections.reverseOrder());

   List<Movie> results2014 = movieYearMap.get(2014);
   Collections.sort(results2014, Collections.reverseOrder());

   List<Movie> results2015 = movieYearMap.get(2015);
   Collections.sort(results2015, Collections.reverseOrder());

   List<Movie> results2016 = movieYearMap.get(2016);
   Collections.sort(results2016, Collections.reverseOrder());

   /* System.out.println("Print results2006 ----------------------------------------");

   System.out.println("\n");

   // Print results2006

   for (int i=0; i < results2006.size(); i++){
    results2006.get(i).printTitleRevnue();
   }

   System.out.println("\n");

   System.out.println("Print results2007 ----------------------------------------");

   System.out.println("\n");

   // Print results2007

   for (int i=0; i < results2007.size(); i++){
    results2007.get(i).printTitleRevnue();
   }

   System.out.println("\n");

   System.out.println("Print results2008 ----------------------------------------");

   System.out.println("\n");

   // Print results2008

   for (int i=0; i < results2008.size(); i++){
    results2008.get(i).printTitleRevnue();
   }

   System.out.println("\n");
   
   System.out.println("Print results2010 ----------------------------------------");

   System.out.println("\n");

   // Print results2010

   for (int i=0; i < results2010.size(); i++){
    results2010.get(i).printTitleRevnue();
   }

   System.out.println("\n");

   System.out.println("Print results2011 ----------------------------------------");

   System.out.println("\n");

   // Print results2011

   for (int i=0; i < results2011.size(); i++){
    results2011.get(i).printTitleRevnue();
   }

   System.out.println("\n");

   System.out.println("Print results2012 ----------------------------------------");

   System.out.println("\n");

   // Print results2012

   for (int i=0; i < results2012.size(); i++){
    results2012.get(i).printTitleRevnue();
   }

   System.out.println("\n");

   System.out.println("Print results2013 ----------------------------------------");

   System.out.println("\n");

   // Print results2013

   for (int i=0; i < results2013.size(); i++){
    results2013.get(i).printTitleRevnue();
   }

   System.out.println("\n");

   System.out.println("Print results2014 ----------------------------------------");

   System.out.println("\n");

   // Print results2014

   for (int i=0; i < results2014.size(); i++){
    results2014.get(i).printTitleRevnue();
   }

   System.out.println("\n");

   System.out.println("Print results2015 ----------------------------------------");

   System.out.println("\n");

   // Print results2015

   for (int i=0; i < results2015.size(); i++){
    results2015.get(i).printTitleRevnue();
   } 

   System.out.println("Print results2016 ----------------------------------------");

   System.out.println("\n");

   // Print results2016

   for (int i=0; i < results2016.size(); i++){
    results2016.get(i).printTitleRevnue();
   } */

   // ArrayList of all the years in movieYearMap sorted in ascending order

   System.out.println("\n");

   // using keySet() for iteration over keys
   for (Integer year : movieYearMap.keySet())
   // Add year to yearsList
   yearsList.add(year);
   Collections.sort(yearsList);
   System.out.println("ArrayList, yearsList in ascending order: " + yearsList);

   System.out.println("\n");

   // Print Highest & Lowest Grossing Film

    for (int i=0; i <= yearsList.size()-1; i++) {
    int year = yearsList.get(i);
    List<Movie> resultsList = movieYearMap.get(year);
    Collections.sort(resultsList, Collections.reverseOrder());
    System.out.println("\n");
    System.out.println("Print resultsList : " + year);
    System.out.println("\nHighest Grossing Film\n");
    resultsList.get(0).printTitleRevnue();

    int listSize = resultsList.size();
    System.out.println("Lowest Grossing Film\n");
    resultsList.get(listSize-1).printTitleRevnue();
    System.out.println("----------------------------------------");
   }
    
  } // Class Main END


//--------------------Do not edit below here----------------------------------

  /*Method that tokenizes string and returns a Movie object if line is valid, returns Movie with title = "Invalid_data" if exception is throw because line is missing data.*/

  public static Movie parseMovie(String lineData){
      //Declare variables to store movie data
      int temp_rank;
      String temp_title;
      String temp_genre;
      String temp_description;
      String temp_director;
      String temp_actors;
      int temp_year;
      int temp_duration; //rutime in minute
      double temp_rating;
      int temp_votes;
      Double temp_revenue;
      int temp_metascore;
      // Split movie line 
      String lineTokens[] = lineData.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);//Regex to split line
      try{
        temp_rank = Integer.parseInt(lineTokens[0]);
        temp_title = lineTokens[1];
        temp_genre = lineTokens[2];
        temp_description = lineTokens[3];
        temp_director = lineTokens[4];
        temp_actors = lineTokens[5];
        temp_year = Integer.parseInt(lineTokens[6]);
        temp_duration = Integer.parseInt(lineTokens[7]); //rutime in minute
        temp_rating = Double.parseDouble(lineTokens[8]);
        temp_votes = Integer.parseInt(lineTokens[9]);
        temp_revenue = Double.parseDouble(lineTokens[10]);
        temp_metascore = Integer.parseInt(lineTokens[11]);
      }catch(Exception e)//Line of data is missing information or is invalid
      { 
        //Create default movie with "Invalid_data" title
        Movie invalidMovieData = new Movie(); 
        return invalidMovieData;
      }
      //Line of data had all information
      //Create Movie Object with data
      Movie  myMovie = new Movie(temp_rank, temp_title, temp_genre,temp_description, temp_director, temp_actors, temp_year, temp_duration, temp_rating, temp_votes, temp_revenue, temp_metascore);
      return myMovie;
    }
}