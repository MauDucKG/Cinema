package cinema.model;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commentId")
    private int commentId;

    @Column(name = "userid")
    private int userid;

    @ManyToOne
    @JoinColumn(name="movieid", nullable=false)
    private Movie movie;
    @Column(name = "content", columnDefinition = "TEXT")
    private String content;

    @Column(name = "movieid")
    private int movieid;

    @Column(name = "date")
    private Date date;

    public Comment(int commentId, int userid, String content, int movieid, Date date) {
        this.commentId = commentId;
        this.userid = userid;
        this.content = content;
        this.movieid = movieid;
        this.date = date;
    }

    public Comment() {
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getUserId() {
        return userid;
    }

    public void setUser(int userid) {
        this.userid = userid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getMovieId() {
        return movieid;
    }

    public void setMovieId(int movieid) {
        this.movieid = movieid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
