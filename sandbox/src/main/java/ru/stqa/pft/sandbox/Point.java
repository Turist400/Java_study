package ru.stqa.pft.sandbox;

import java.util.Locale;

public class Point {

    public double x;
    public double y;

    public Point(double x, double y) {

        this.x = x;
        this.y = y;
    }
    @Override
    public String toString () {
        return String.format (Locale.US,"(%.1f;%.1f)", x, y );
    }

    public double distance(Point p) {
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }


}
