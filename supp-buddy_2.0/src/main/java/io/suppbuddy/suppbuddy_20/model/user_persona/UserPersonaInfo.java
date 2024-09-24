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

    public Long getUserPersonaInfoID() {
        return userPersonaInfoID;
    }

    public void setUserPersonaInfoID(Long userPersonaInfoID) {
        this.userPersonaInfoID = userPersonaInfoID;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUserLifestyleType() {
        return userLifestyleType;
    }

    public void setUserLifestyleType(String userLifestyleType) {
        this.userLifestyleType = userLifestyleType;
    }

    public boolean isBalanced() {
        return isBalanced;
    }

    public void setBalanced(boolean balanced) {
        isBalanced = balanced;
    }

    public String getPrimaryHealthFocus() {
        return primaryHealthFocus;
    }

    public void setPrimaryHealthFocus(String primaryHealthFocus) {
        this.primaryHealthFocus = primaryHealthFocus;
    }

    public String getSecondaryHealthFocus() {
        return secondaryHealthFocus;
    }

    public void setSecondaryHealthFocus(String secondaryHealthFocus) {
        this.secondaryHealthFocus = secondaryHealthFocus;
    }
}
