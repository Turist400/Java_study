package ru.stqa.pft.sandbox;

public class Point {

    public double x;
    public double y;

    public Point() {

        //this.x = 0;
        //this.y = 0;
    }

    public double distance(Point p) {
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }


}
