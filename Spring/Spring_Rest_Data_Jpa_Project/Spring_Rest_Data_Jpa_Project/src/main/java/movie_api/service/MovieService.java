package movie_api.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import movie_api.entity.Movie;
import movie_api.repo.MovieRepository;
@Service //Marks this class as a Service
public class MovieService {
	@Autowired
	private MovieRepository movieRepositoryObject;
	public Collection<Movie> getAllAvailableMovies(){
		Collection<Movie> allMovies = movieRepositoryObject.findAll();
		return allMovies;
	}
	
	public Movie getOneMovie(Integer movieId) {
		Movie foundMovie = null;
		Optional<Movie> movieOptional =
		movieRepositoryObject.findById(movieId);
		if(movieOptional.isPresent()) {//Check if Movie object is present
			//If so, get it and assign to foundMovie
			foundMovie = movieOptional.get();
		}
		return foundMovie;
	}
	
	public void createNewMovie(Movie movieObject) {
		movieRepositoryObject.save(movieObject);
	}
	
	public void updateExistingMovie(Movie movieObject) {
		movieRepositoryObject.save(movieObject);
	}
	
	public void deleteMovie(Integer movieId) {
		movieRepositoryObject.deleteById(movieId);
	}
}







