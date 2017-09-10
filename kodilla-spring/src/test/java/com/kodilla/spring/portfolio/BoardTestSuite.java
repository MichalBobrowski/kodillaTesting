package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class BoardTestSuite {

    // test sprawdzający jakie są beany i test po dodaniu zadania do każdej listy (4testy

    @Test
    public void showBeansTest(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");

        //when & then
        System.out.println("List of beans names: ");
        Arrays.stream(context.getBeanDefinitionNames()).
                forEach(System.out::println);
    }

    @Test
    public void testTaskAdd(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);
        board.getToDoList().getTasks().add("Zadanie 1");
        board.getInProgressList().getTasks().add("Zadanie 2");
        board.getDoneList().getTasks().add("zadanie 3");

        //when & then
       board.getToDoList().getTasks().stream().forEach(System.out::println);
       board.getInProgressList().getTasks().stream().forEach(System.out::println);
       board.getDoneList().getTasks().stream().forEach(System.out::println);



    }

}
