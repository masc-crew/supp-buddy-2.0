package io.suppbuddy.suppbuddy_20.model.questionnaire;

import jakarta.persistence.*;

@Entity
public class UserAnswer {

    @Id
    @GeneratedValue
    private Long id;

    // Should these relationships be only the Long id's or the whole entity?
    @ManyToOne
    @JoinColumn(name = "user_id") // this should enable to search with the UserId in the UserAnswer repo.

    private User user;

    @ManyToOne
    private Question question;

    @ManyToOne
    private AnswerOption answerOption;

    public UserAnswer() {
    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public AnswerOption getAnswerOption() {
        return answerOption;
    }

    public void setAnswerOption(AnswerOption answerOption) {
        this.answerOption = answerOption;
    }
}
