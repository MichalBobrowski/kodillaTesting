package com.kodilla.patterns2.observer.homework;

import java.util.List;

public class Mentor implements ObservedStudent {
    private String mentorName;
    private List<Student> studentList;
    private int notifications;

    public Mentor(String mentorName, List<Student> studentList, int notifications) {
        this.mentorName = mentorName;
        this.studentList = studentList;
        this.notifications = notifications;
    }

    public Mentor(String mentorName, List<Student> studentList) {
        this.mentorName = mentorName;
        this.studentList = studentList;
    }

    @Override
    public void registerStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public void becomeNotyfied() {
        notifications++;
    }

    @Override
    public void removeStudent(Student student) {
        studentList.remove(student);
    }

    public String getMentorName() {
        return mentorName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public int getNotifications() {
        return notifications;
    }
}
