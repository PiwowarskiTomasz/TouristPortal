package com.piwowarski.touristportal.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String suranme;
    private String email;
    private String description;
    private String backgroundImg;
    private String profileImg;
    private String role;
    private String password;
    @Transient
    private String passwordConfirmation;

    public User() {
    }

    public User(String name, String suranme, String email, String description, String backgroundImg, String profileImg, String role) {
        this.name = name;
        this.suranme = suranme;
        this.email = email;
        this.description = description;
        this.backgroundImg = backgroundImg;
        this.profileImg = profileImg;
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirmation() {
        return passwordConfirmation;
    }

    public void setPasswordConfirmation(String passwordConfirmation) {
        this.passwordConfirmation = passwordConfirmation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuranme() {
        return suranme;
    }

    public void setSuranme(String suranme) {
        this.suranme = suranme;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBackgroundImg() {
        return backgroundImg;
    }

    public void setBackgroundImg(String backgroundImg) {
        this.backgroundImg = backgroundImg;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(name, user.name) &&
                Objects.equals(suranme, user.suranme) &&
                Objects.equals(email, user.email) &&
                Objects.equals(description, user.description) &&
                Objects.equals(backgroundImg, user.backgroundImg) &&
                Objects.equals(profileImg, user.profileImg) &&
                Objects.equals(role, user.role);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, suranme, email, description, backgroundImg, profileImg, role);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", suranme='" + suranme + '\'' +
                ", email='" + email + '\'' +
                ", description='" + description + '\'' +
                ", backgroundImg='" + backgroundImg + '\'' +
                ", profileImg='" + profileImg + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
