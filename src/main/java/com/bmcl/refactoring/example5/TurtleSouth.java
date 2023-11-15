package com.bmcl.refactoring.example5;

public class TurtleSouth extends TurtleState{
    public TurtleSouth() { }
    public TurtleSouth(Turtle turtle) {
        this.turtle = turtle;
    }
    @Override
    public void moveForward() {
        turtle.setRow(turtle.getRow() + 1);
    }
    @Override
    public void rotateRight() {
        turtle.setDirection(new TurtleWest(turtle));
    }
    @Override
    public void rotateLeft() {
        turtle.setDirection(new TurtleEast(turtle));
    }
}