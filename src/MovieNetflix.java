
public class MovieNetflix {
	public static void main(String[] args) {
		MovieNetflix movenet = new MovieNetflix();
		Movie movie = new Movie("WALL-E",4);
		Movie movie2 = new Movie("up",5);
		Movie movie3 = new Movie("bug life", 3);
		Movie movie4 = new Movie("yolo",2);
		Movie movie5 = new Movie("sharknado",4);
		movie.getTicketPrice();
		NetflixQueue netflix = new NetflixQueue();
		netflix.addMovie(movie);
		netflix.addMovie(movie2);
		netflix.addMovie(movie3);
		netflix.addMovie(movie4);
		netflix.addMovie(movie5);
		netflix.printMovies();
		netflix.getBestMovie();
		System.out.println("the best movie is "+netflix.getBestMovie());
		System.out.println("the second best movie is "+netflix.get2bestMovie());
	}
}
