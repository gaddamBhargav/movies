package com.bhargavmoviescollection.movies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;


/** 1) @Autowired is an annotation used in Spring Boot to enable 
 * automatic dependency injection. It allows the Spring container to 
 * provide an instance of a required dependency when a bean is created. 
 * This annotation can be used on fields, constructors, and methods 
 * to have Spring provide the dependencies automatically
 * 
 * 2) @Service annotation can be used to denote a class that performs 
 * a specific service or function in a Spring Boot application. 
 * You will use it to specify that a class performs business logic 
 * or data manipulation tasks.
 * **/

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	public List<Movie> allMovies(){
		List<Movie> movie = null;
		movie = movieRepository.findAll();
//		ObjectMapper mapper = new ObjectMapper();
//		movie.forEach((m)-> mapper.convertValue(m, Movie.class));
		System.out.println(movie);
		return movie;
	}

	public Optional<Movie> movieByImdbId(String imdbId) {
		
		return movieRepository.findMovieByImdbId(imdbId);
	}

}
