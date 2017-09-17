package com.kodilla.patterns.factory.task;

import com.kodilla.patterns.factory.tasks.ShoppingTask;
import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.Assert;
import org.junit.Test;

public class FactoryTaskTestSuite {

    @Test
    public void creatingTaskTest(){
        //given
        TaskFactory taskFactory = new TaskFactory();

        //when
        Task shoppingTask = taskFactory.makeTask(taskFactory.SHOPPING);
        Task paintingTask = taskFactory.makeTask(taskFactory.PAINTING);
        Task drivingTask = taskFactory.makeTask(taskFactory.DRIVING);

        //then

        Assert.assertEquals("Rutynowe zakupy", shoppingTask.getTaskName());
        Assert.assertEquals("Malowanie salonu", paintingTask.getTaskName());
        Assert.assertEquals("Pogotowie podwożące", drivingTask.getTaskName());
    }

    @Test
    public void executingTaskTest(){
        //given
        TaskFactory taskFactory = new TaskFactory();
        Task shoppingTask = taskFactory.makeTask(taskFactory.SHOPPING);
        Task paintingTask = taskFactory.makeTask(taskFactory.PAINTING);
        Task drivingTask = taskFactory.makeTask(taskFactory.DRIVING);

        //when
        shoppingTask.executeTask();
        paintingTask.executeTask();
        drivingTask.executeTask();

        //then

        Assert.assertTrue(shoppingTask.isTaskExecuted());
        Assert.assertTrue(paintingTask.isTaskExecuted());
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }
}
