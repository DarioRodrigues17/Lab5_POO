package com.bmcl.refactoring.example2;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class ShapeTest {
    @Test
    public void getAreaCircle() throws Exception {
        Circle circle = new Circle(5, 5, 10);
        assertEquals(314.16, circle.getArea(), 0.01);
    }
    @Test
    public void getAreaRectangle() throws Exception {
        Rectangle rectangle = new Rectangle(5, 5, 10, 20);
        assertEquals(200, rectangle.getArea(), 0.01);
    }
    @Test
    public void getPerimeterCircle() throws Exception {
        Circle circle = new Circle(5, 5, 10);
        assertEquals(62.83, circle.getPerimeter(), 0.01);
    }
    @Test
    public void getPerimeterRectangle() throws Exception {
        Rectangle rectangle = new Rectangle(5, 5, 10, 20);
        assertEquals(60, rectangle.getPerimeter(), 0.01);
    }
    @Test
    public void drawCircle() {
        GraphicFramework graphics = Mockito.mock(GraphicFramework.class);
        Circle circle = new Circle(5, 5, 10);
        circle.draw(graphics);
        Mockito.verify(graphics, Mockito.times(1)).drawCircle(5, 5, 10);
    }
    @Test
    public void drawRectangle() {
        GraphicFramework graphics = Mockito.mock(GraphicFramework.class);
        Rectangle rectangle = new Rectangle(5, 5, 10, 20);
        rectangle.draw(graphics);
        Mockito.verify(graphics, Mockito.times(1)).drawLine(5, 5, 15, 5);
        Mockito.verify(graphics, Mockito.times(1)).drawLine(15, 5, 15, 25);
        Mockito.verify(graphics, Mockito.times(1)).drawLine(15, 25, 5, 25);
        Mockito.verify(graphics, Mockito.times(1)).drawLine(5, 25, 5, 5);
    }
}