package com.movie.rating.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.movie.rating.model.DetailsCapture;
import com.movie.rating.model.Movie;

@RestController
@RefreshScope
@RequestMapping("/movie")
public class MovieController {

	@Value("${api.key}")
	private String apiKey;

	@Autowired
	private RestTemplate template;

	@GetMapping("/{movieId}")
	public Movie getMovie(@PathVariable("movieId") String movieId) {
		DetailsCapture capture = template.getForObject(
				"https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" + apiKey, DetailsCapture.class);
		return new Movie(capture.getId(), capture.getTitle(), capture.getOverview(), capture.getGenres().toString());
	}

}
