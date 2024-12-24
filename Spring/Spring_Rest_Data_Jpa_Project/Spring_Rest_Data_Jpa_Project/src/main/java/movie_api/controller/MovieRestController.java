package movie_api.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import movie_api.entity.Movie;
import movie_api.exceptions.MovieNotFoundException;
import movie_api.service.MovieService;

//
import org.springframework.web.bind.annotation.CrossOrigin;

//

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class MovieRestController {
	@Autowired
	private MovieService movieServiceObject;
	@GetMapping("/movie-api")
	public Collection<Movie> getAllAvailableMovies(){
		Collection<Movie> allAvailableMovies =
		movieServiceObject.getAllAvailableMovies();
		return allAvailableMovies;
	}
	
	@GetMapping("/movie-api/{movieId}")
	public Movie getOneMovie(
			@PathVariable Integer movieId
			) {
		Movie foundMovie = movieServiceObject.getOneMovie(movieId);
		//System.out.println("Found Movie is => " + foundMovie);
		if(foundMovie == null) {
			//Throw MovieNotFoundException and send the status: 404
			//throw new RuntimeException("Movie Not Found with ID : " + movieId );
			throw new MovieNotFoundException("Movie with the given ID was not found", movieId);
		}
		return foundMovie;
	}
	@PostMapping("/movie-api")
	public void createNewMovie(@RequestBody Movie movieObject) {
		System.out.println("Received Movie: => " + movieObject);
		movieServiceObject.createNewMovie(movieObject);
	}
	
	@PutMapping("/movie-api")
	public void updateExistingMovie(@RequestBody Movie movieObject) {
		movieServiceObject.updateExistingMovie(movieObject);
	}

	@DeleteMapping("/movie-api/{movieId}")
	public void deleteMovie(@PathVariable Integer movieId) {
		movieServiceObject.deleteMovie(movieId);
	}




}






