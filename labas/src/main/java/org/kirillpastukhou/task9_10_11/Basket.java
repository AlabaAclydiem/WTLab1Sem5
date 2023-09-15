package org.kirillpastukhou.task9_10_11;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private final List<Ball> balls;

    public Basket() {
        this.balls = new ArrayList<Ball>();
    }
    public Basket(List<Ball> balls) {
        this.balls = balls;
    }
    public double getAllBallsWeight() {
        double totalWeight = 0;
        for (Ball ball : balls) {
            totalWeight += ball.getWeight();
        }
        return totalWeight;
    }

    public int howManyBlueBalls() {
        int totalBlues = 0;
        for (Ball ball : balls) {
            if (ball.getColor().equals("Blue")) {
                totalBlues++;
            }
        }
        return totalBlues;
    }
}
