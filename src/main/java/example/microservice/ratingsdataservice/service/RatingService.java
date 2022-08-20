package example.microservice.ratingsdataservice.service;

import example.microservice.ratingsdataservice.models.Rating;
import example.microservice.ratingsdataservice.models.UserRating;

public interface RatingService {
    Rating getMovieRating(String movieId);
    UserRating getUserRating(String userId);
}
