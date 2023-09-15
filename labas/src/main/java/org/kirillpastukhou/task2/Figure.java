package org.kirillpastukhou.task2;

public class Figure {
    public final int topRect_top = 5, topRect_bottom = 0, topRect_left = -4, topRect_right = 4;
    public final int bottomRect_top = 0, bottomRect_bottom = -3, bottomRect_left = -6, bottomRect_right = 6;

    public boolean isPointIn(double x, double y) {
        boolean inTop, inBottom;
        inTop = topRect_left <= x && x <= topRect_right && topRect_bottom <= y && y <= topRect_top;
        inBottom = bottomRect_left <= x && x <= bottomRect_right && bottomRect_bottom <= y && y <= bottomRect_top;
        return inTop || inBottom;
    }
}
