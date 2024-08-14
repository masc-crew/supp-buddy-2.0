package io.suppbuddy.suppbuddy_20.model;

import jakarta.persistence.*;

@Entity
@Table(name = "answer_options")
public class AnswerOption {

    @Id
    @GeneratedValue
    private long id;

    private String answerText;
    private int nsScore;
    private int ihScore;
    private int ghScore;
    private int mwScore;

    // Not sure if this relationship is needed.
//    @ManyToOne
//    private Question question;


    public AnswerOption() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public int getNsScore() {
        return nsScore;
    }

    public void setNsScore(int nsScore) {
        this.nsScore = nsScore;
    }

    public int getIhScore() {
        return ihScore;
    }

    public void setIhScore(int ihScore) {
        this.ihScore = ihScore;
    }

    public int getGhScore() {
        return ghScore;
    }

    public void setGhScore(int ghScore) {
        this.ghScore = ghScore;
    }

    public int getMwScore() {
        return mwScore;
    }

    public void setMwScore(int mwScore) {
        this.mwScore = mwScore;
    }
}
