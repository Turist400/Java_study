package ru.stqa.pft.sandbox;

public class PointProgramm {

  public static void main(String[] args) {
    Point p1 = new Point();
    p1.x = 8.3;
    p1.y = 7.7;

    Point p2 = new Point();
    p2.x = 2.8;
    p2.y = 2.2;

    double dx = p1.x - p2.x;
    double dy = p1.y - p2.y;
    System.out.println("distance between points " + dx + " и " + dy + " = " + distance(dx, dy));

  }

  public static double distance(double p1, double p2) {
    return Math.sqrt(p1*p1 + p2*p2);
  }
}
