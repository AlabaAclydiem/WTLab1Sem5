package org.kirillpastukhou.task9_10_11;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    @Test
    void getAllBallsWeight() {
        List<Ball> balls = Arrays.asList(new Ball(10.4, "Blue"), new Ball(), new Ball(6.7),
                new Ball("Blue"), new Ball(8.9, "Blue"));
        Basket basket = new Basket(balls);
        assertEquals(Math.round(basket.getAllBallsWeight()), 46);
    }

    @Test
    void howManyBlueBalls() {
        List<Ball> balls = Arrays.asList(new Ball(10.4, "Blue"), new Ball(), new Ball(6.7),
                new Ball("Blue"), new Ball(8.9, "Blue"));
        Basket basket = new Basket(balls);
        assertEquals(basket.howManyBlueBalls(), 3);
    }
}