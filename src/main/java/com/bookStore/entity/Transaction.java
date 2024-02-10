package com.bookStore.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "Transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transactionId")
    private int transactionId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @Column(name = "totalPrice", precision = 10, scale = 2)
    private BigDecimal totalPrice;

    @Column(name = "date")
    private Date date;

    @Column(name = "tickAmount")
    private int tickAmount;

    @Column(name = "type", length = 255)
    private String type;

    @Column(name = "status", length = 255)
    private String status;

    @ManyToOne
    @JoinColumn(name = "movie_slotID")
    private MovieSlot movieSlot;

    public Transaction(int transactionId, User user, BigDecimal totalPrice, Date date, int tickAmount, String type, String status, MovieSlot movieSlot) {
        this.transactionId = transactionId;
        this.user = user;
        this.totalPrice = totalPrice;
        this.date = date;
        this.tickAmount = tickAmount;
        this.type = type;
        this.status = status;
        this.movieSlot = movieSlot;
    }

    public Transaction() {
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTickAmount() {
        return tickAmount;
    }

    public void setTickAmount(int tickAmount) {
        this.tickAmount = tickAmount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public MovieSlot getMovieSlot() {
        return movieSlot;
    }

    public void setMovieSlot(MovieSlot movieSlot) {
        this.movieSlot = movieSlot;
    }
}
