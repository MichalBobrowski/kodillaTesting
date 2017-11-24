package com.kodilla.patterns2.observer.homework;

import java.util.List;

public class Student implements  Observable {
    private String name;
    private Mentor mentor;
    private List<Double> tasksSendToMentor;

    public Student(String name, Mentor mentor, List<Double> tasksSendToMentor) {
        this.name = name;
        this.mentor = mentor;
        this.tasksSendToMentor = tasksSendToMentor;
    }


    public Student(String name, List<Double> tasksSendToMentor) {
        this.name = name;
        this.tasksSendToMentor = tasksSendToMentor;
    }

    public void sendNextTask(Double taskID){
        tasksSendToMentor.add(taskID);
        this.notifyMentor();
    }



    public String getName() {
        return name;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public List<Double> getTasksSendToMentor() {
        return tasksSendToMentor;
    }

    @Override
    public void notifyMentor() {
        mentor.becomeNotyfied();

    }
}
