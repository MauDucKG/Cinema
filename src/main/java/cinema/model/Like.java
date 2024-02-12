package cinema.model;

import jakarta.persistence.*;

@Entity
@Table(name = "liketable")
public class Like {
    @EmbeddedId
    private LikeId id;

    public Like(int userId, int movieId) {
        this.id = new LikeId();
        this.id.setUserId(userId);
        this.id.setMovieId(movieId);
    }

    public Like() {
    }

    @ManyToOne
    @JoinColumn(name="movieid", nullable=false,insertable=false, updatable=false)
    private Movie movie;
    public LikeId getId() {
        return id;
    }

    public void setId(LikeId id) {
        this.id = id;
    }
    public void setMovieId(LikeId id) {
        this.id = id;
    }
}
