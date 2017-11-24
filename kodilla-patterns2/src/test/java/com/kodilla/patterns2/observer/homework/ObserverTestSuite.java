package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ObserverTestSuite {

    @Test
    public void sendNextTaskObserver(){
        //given
        Mentor mentor1 = new Mentor("Lord Vader", new ArrayList<>(), 0);
        Mentor mentor2 = new Mentor("Emperor Palpatine", new ArrayList<>(), 0);

        Student student1 = new Student("Young men", mentor1, new ArrayList<>());
        Student student2 = new Student("Young girl", mentor2, new ArrayList<>());
        Student student3 = new Student("Young stranger", mentor1, new ArrayList<>());

        //when
        student1.sendNextTask(19.1);
        student1.sendNextTask(19.2);
        student3.sendNextTask(20.4);
        student2.sendNextTask(1.1);

        //then
        Assert.assertEquals(1, mentor2.getNotifications());
        Assert.assertEquals(3, mentor1.getNotifications());
    }
}
