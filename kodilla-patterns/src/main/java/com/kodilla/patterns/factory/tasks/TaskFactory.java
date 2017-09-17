package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public final static String SHOPPING = "SHOPPING";
    public final static String PAINTING = "PAINTING";
    public final static String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass){
        switch(taskClass){
            case SHOPPING:
                return new ShoppingTask("Rutynowe zakupy", "mięso", 5.0);
            case PAINTING:
                return new PaintingTask("Malowanie salonu", "czarny", "salon");
            case DRIVING:
                return new DrivingTask("Pogotowie podwożące", "szpital", "rower");
            default:
                return null;
        }
    }
}
