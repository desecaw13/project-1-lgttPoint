package com.csc205.project1;

public class Point {

    private double x;
    private double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void shiftX(int amount) {
        x += amount;
    }

    public void shiftY(int amount) {
        y += amount;
    }

    public double distance(Point point2) {
        return Math.sqrt(Math.pow(x - point2.x, 2) + Math.pow(y - point2.y, 2));
    }

    public void rotate(double theta) {
        double oldX = x;
        x = oldX * Math.cos(theta) - y * Math.sin(theta);
        y = oldX * Math.sin(theta) + y * Math.cos(theta);
    }

    public double dot(Point point2) {
        return x * point2.x + y * point2.y;
    }

    @Override
    public String toString() {
        return String.format("Point(x=%s, y=%s)", x, y);
    }
}
