package Laba4;

public class Circle {
    private double x;
    private double y;
    private double r;
    private String colour;

    public Circle(double x, double y, double r, String colour) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.colour = colour;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getR() {
        return this.r;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getLength() {
        double c = 2 * Math.PI * this.r;
        return c;
    }

    public String toString() {
        return "Circle{x=" + this.x + ", y=" + this.y + ", r=" + this.r + ", colour='" + this.colour + "'}";
    }
}
