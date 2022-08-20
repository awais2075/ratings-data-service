package example.microservice.ratingsdataservice.controller;

import example.microservice.ratingsdataservice.models.Rating;
import example.microservice.ratingsdataservice.models.UserRating;
import example.microservice.ratingsdataservice.service.RatingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    private final RatingService ratingService;

    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @GetMapping("/{movieId}")
    public Rating getMovieRating(@PathVariable String movieId){
        return ratingService.getMovieRating(movieId);
    }

    @RequestMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable String userId){
        return ratingService.getUserRating(userId);
    }
}
