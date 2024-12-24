package movie_api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import movie_api.entity.Movie;
/*No need to use @Repository because JpaRepository is already a Managed
 * Component and since MovieRepository is extended from JpaRepository,
 * it also becomes a Managed Component. 
 */
public interface MovieRepository  
extends JpaRepository<Movie, Integer>{ }
