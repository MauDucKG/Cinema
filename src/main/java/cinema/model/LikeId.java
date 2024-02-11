package cinema.model;

import java.io.Serializable;
import jakarta.persistence.*;

@Embeddable
public class LikeId implements Serializable {
    @Column(name = "userid")
    private int userId;
    @Column(name = "movieid")
    private int movieId;

    public LikeId() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
}
