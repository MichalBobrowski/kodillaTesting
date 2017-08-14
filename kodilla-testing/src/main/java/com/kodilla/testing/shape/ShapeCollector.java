package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> listOfFigures = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        listOfFigures.add(shape);
    }

    public boolean removeFigure(Shape shape){
        if(listOfFigures.contains(shape)){
            listOfFigures.remove(shape);
            return true;
        }
        else{
            return false;
        }
    }


    public Shape getFigure(int n){
        return listOfFigures.get(n);
    }

    public String showFigures(){
        String result = "";
        for (Shape shape1 : listOfFigures ) {
            result = result + shape1.getShapeName() + " ";
        }
    return result;
    }

    public int getNumberOfFigures(){
        return listOfFigures.size();
    }
}
