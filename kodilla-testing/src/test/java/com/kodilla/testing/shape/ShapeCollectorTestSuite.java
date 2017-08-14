package com.kodilla.testing.shape;

        import org.junit.Assert;
        import org.junit.Test;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure(){
        ShapeCollector testShapeCollector = new ShapeCollector();
        testShapeCollector.addFigure(new Square(10.0));
        testShapeCollector.addFigure(new Circle(5.0));
        testShapeCollector.addFigure(new Triangle(4.0, 3.0));

        Assert.assertEquals(3, testShapeCollector.getNumberOfFigures());
    }

    @Test
    public void testRemoveFigure(){
        ShapeCollector testShapeCollector = new ShapeCollector();
        Square square1 = new Square(10.0);
        testShapeCollector.addFigure(square1);

        boolean result = testShapeCollector.removeFigure(square1);
        Assert.assertTrue(result);
        //Assert.assertEquals(0, testShapeCollector.getNumberOfFigures());
    }

    @Test
    public void testGetFigure(){
        ShapeCollector testShapeCollector = new ShapeCollector();
        Circle circle1 = new Circle(5.0);
        testShapeCollector.addFigure(new Square(10.0));
        testShapeCollector.addFigure(circle1);
        testShapeCollector.addFigure(new Triangle(4.0, 3.0));

        Assert.assertEquals(circle1, testShapeCollector.getFigure(1));
    }

    @Test
    public void testShowFigures(){
        ShapeCollector testShapeCollector = new ShapeCollector();
        testShapeCollector.addFigure(new Square(10.0));
        testShapeCollector.addFigure(new Circle(5.0));
        testShapeCollector.addFigure(new Triangle(4.0, 3.0));

        Assert.assertEquals("square circle triangle ", testShapeCollector.showFigures());
    }



}