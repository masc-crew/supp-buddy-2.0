package io.suppbuddy.suppbuddy_20.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "answer_options")
public class AnswerOption {

    @Id
    @GeneratedValue
    private long id;

    private String answerText;
    private int nsScore;
    private int ihScore;

}
