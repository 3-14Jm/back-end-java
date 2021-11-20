package com.fox.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Review {
    private Integer id;
    private String text;
    private Integer rate;
    private User userByUserId;
    private Pot potByPotId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "text")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Basic
    @Column(name = "rate")
    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Review review = (Review) o;

        if (!Objects.equals(id, review.id)) return false;
        if (!Objects.equals(text, review.text)) return false;
        return Objects.equals(rate, review.rate);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (rate != null ? rate.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    public User getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(User userByUserId) {
        this.userByUserId = userByUserId;
    }

    @ManyToOne
    @JoinColumn(name = "pot_id", referencedColumnName = "id", nullable = false)
    public Pot getPotByPotId() {
        return potByPotId;
    }

    public void setPotByPotId(Pot potByPotId) {
        this.potByPotId = potByPotId;
    }
}
