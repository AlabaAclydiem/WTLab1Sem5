package org.kirillpastukhou.task9_10_11;

public class Ball {
    private final double weight;
    private final String color;
    public Ball() {
        this.weight = 10;
        this.color = "Red";
    }

    public Ball(String color) {
        this.weight = 10;
        this.color = color;
    }

    public Ball(double weight) {
        this.weight = weight;
        this.color = "Red";
    }

    public Ball(double weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}
