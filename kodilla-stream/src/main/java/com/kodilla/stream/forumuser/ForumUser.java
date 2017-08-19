package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private int id;
    private String userName;
    private char sex;
    private LocalDate dateOfBirth;
    private int postNumber;

    public ForumUser(int id, String userName, char sex, LocalDate dateOfBirth, int postNumber) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postNumber = postNumber;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostNumber() {
        return postNumber;
    }
}
