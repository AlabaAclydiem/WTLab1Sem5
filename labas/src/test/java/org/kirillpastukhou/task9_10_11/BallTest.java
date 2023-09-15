package org.kirillpastukhou.task9_10_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    void getWeight() {
        Ball ball = new Ball(11, "Yellow");
        assertEquals(ball.getWeight(), 11);
    }

    @Test
    void getColor() {
        Ball ball = new Ball(11, "Yellow");
        assertEquals(ball.getColor(), "Yellow");
    }
}