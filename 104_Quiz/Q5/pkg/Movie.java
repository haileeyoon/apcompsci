package pkg;

public class Movie{
    String movieName;
    double rating;
    int numRatings;
    int revenue;
    
public Movie(){
    movieName = "Ävengeners";
    rating = 8.0;
    numRatings = 33;
    revenue = 623357910;
}

public Movie(String m, double ra, int n, int r){
    movieName = m;
    rating = ra;
    numRatings = n;
    revenue = r;
}

public void movieToString(){
System.out.println("Movie: " + movieName);
System.out.println("Rating: " + rating);
System.out.println("Number of Ratings: " + numRatings);
System.out.println("Revenue:" + revenue);
System.out.println(" ");
}

public int getRevenue(){ 
return revenue;
}

public String getMovieName(){
return movieName;
}

public double getRating(){
return rating;
}

public void addRating(double addrate){
    rating = (rating*numRatings)+addrate;
    numRatings++;
    rating = rating/numRatings;
    return;
}
}