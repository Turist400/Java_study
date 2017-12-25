package ru.stqa.pft.sandbox;

public class PointProgramm {

  public static void main(String[] args) {
    Point p1 = new Point();
    p1.x = 8.3;
    p1.y = 7.7;

    Point p2 = new Point();
    p2.x = 2.8;
    p2.y = 2.2;


    System.out.println("distance between points " + p1 + " и " + p2 + " = " + p1.distance(p2));

  }


}
