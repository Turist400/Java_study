package ru.stqa.pft.sandbox;

public class PointProgramm {

  public static void main(String[] args) {
    Point p1 = new Point(8.0, 7.0);

    Point p2 = new Point(2.0, 3.0);


    System.out.println("distance between points " + p1 + " и " + p2 + " = " + p1.distance(p2));


  }


}
