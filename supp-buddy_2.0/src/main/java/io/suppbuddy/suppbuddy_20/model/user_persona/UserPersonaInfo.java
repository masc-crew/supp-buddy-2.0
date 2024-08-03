package io.suppbuddy.suppbuddy_20.model.user_persona;

import jakarta.persistence.*;

@Entity
public class UserPersonaInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long userPersonaInfoID;

    public UserPersonaInfo(Long userPersonaInfoID) {
        this.userPersonaInfoID = userPersonaInfoID;
    }

    @Column(unique = true, nullable = false)
    String uuid;

    String userLifestyleType;
    boolean isBalanced;
    String primaryHealthFocus;
    String secondaryHealthFocus;

    public UserPersonaInfo() {
    }

    public UserPersonaInfo(String uuid, String userLifestyleType, boolean isBalanced, String primaryHealthFocus, String secondaryHealthFocus) {
        this.uuid = uuid;
        this.userLifestyleType = userLifestyleType;
        this.isBalanced = isBalanced;
        this.primaryHealthFocus = primaryHealthFocus;
        this.secondaryHealthFocus = secondaryHealthFocus;
    }

    public UserPersonaInfo(Long userPersonaInfoID, String uuid, String userLifestyleType, boolean isBalanced, String primaryHealthFocus, String secondaryHealthFocus) {
        this.userPersonaInfoID = userPersonaInfoID;
        this.uuid = uuid;
        this.userLifestyleType = userLifestyleType;
        this.isBalanced = isBalanced;
        this.primaryHealthFocus = primaryHealthFocus;
        this.secondaryHealthFocus = secondaryHealthFocus;
    }
}
