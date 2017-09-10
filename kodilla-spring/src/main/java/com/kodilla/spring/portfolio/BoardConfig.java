package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {

    @Bean(name = "toDoListBean")
    @Scope("prototype")
    public TaskList getToDoList(){
        return new TaskList();
    }

    @Bean(name = "inProgressListBean")
    @Scope("prototype")
    public TaskList getInProgressList(){
        return new TaskList();
    }

    @Bean(name = "doneListBean")
    @Scope("prototype")
    public TaskList getDoneList(){
        return new TaskList();
    }

    @Bean(name = "BoardBean")
    public Board getBoard (){
        return new Board(getToDoList(), getInProgressList(), getDoneList());
    }

}
