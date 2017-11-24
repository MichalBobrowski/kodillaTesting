package com.kodilla.patterns2.observer.homework;

public interface ObservedStudent {
    void registerStudent(Student student);
    void becomeNotyfied();
    void removeStudent(Student student);
}
