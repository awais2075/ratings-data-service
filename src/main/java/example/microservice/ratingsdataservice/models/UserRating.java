package example.microservice.ratingsdataservice.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UserRating implements Serializable {

    private String userId;
    private List<Rating> ratings = new ArrayList<>();

    public UserRating() {
    }

    public UserRating(String userId, List<Rating> ratings) {
        this.userId = userId;
        this.ratings = ratings;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
}
