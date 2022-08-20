package example.microservice.ratingsdataservice.service.impl;

import example.microservice.ratingsdataservice.models.Rating;
import example.microservice.ratingsdataservice.models.UserRating;
import example.microservice.ratingsdataservice.service.RatingService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {
    @Override
    public Rating getMovieRating(String movieId) {
        return new Rating(movieId, 4);
    }

    @Override
    public UserRating getUserRating(String userId) {
        List<Rating> ratings = Arrays.asList(
                new Rating("100", 4),
                new Rating("101", 3)
        );

        UserRating userRating = new UserRating("10", ratings);
        return userRating;
    }
}
