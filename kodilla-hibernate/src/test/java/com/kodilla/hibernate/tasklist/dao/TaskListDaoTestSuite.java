package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindListNameByListName(){
        //given
        /*final String NAME = "Nazwa";
        TaskList taskList = new TaskList(NAME, "Opis");
        taskListDao.save(taskList);

        //when
        List<TaskList> resultList = taskListDao.findTaskListsByListName(NAME);

        //then
        Assert.assertEquals(1, resultList.size());

        //clean up
        int id = resultList.get(0).getId();
        taskListDao.delete(id);*/
    }



}
