package cinema.model;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
@Table(name = "Movie_Slot")
public class MovieSlot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Movie_Slotid")
    private int movieSlotId;

    @ManyToOne
    @JoinColumn(name = "movieId")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "Slotid")
    private Slot slot;

    @Column(name = "AmountSlotMAX")
    private int amountSlotMax;

    @Column(name = "AmountSlotAvaible")
    private int amountSlotAvailable;

    @Column(name = "Time")
    private LocalTime time;

    public MovieSlot(int movieSlotId, Movie movie, Slot slot, int amountSlotMax, int amountSlotAvailable, LocalTime time) {
        this.movieSlotId = movieSlotId;
        this.movie = movie;
        this.slot = slot;
        this.amountSlotMax = amountSlotMax;
        this.amountSlotAvailable = amountSlotAvailable;
        this.time = time;
    }

    public MovieSlot() {
    }

    public int getMovieSlotId() {
        return movieSlotId;
    }

    public void setMovieSlotId(int movieSlotId) {
        this.movieSlotId = movieSlotId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public int getAmountSlotMax() {
        return amountSlotMax;
    }

    public void setAmountSlotMax(int amountSlotMax) {
        this.amountSlotMax = amountSlotMax;
    }

    public int getAmountSlotAvailable() {
        return amountSlotAvailable;
    }

    public void setAmountSlotAvailable(int amountSlotAvailable) {
        this.amountSlotAvailable = amountSlotAvailable;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
