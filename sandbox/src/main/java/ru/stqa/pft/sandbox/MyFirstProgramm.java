package ru.stqa.pft.sandbox;

public class MyFirstProgramm {
  public static void main(String[] args) {

    Square s = new Square();
    s.l = 5;
    System.out.println("площадь квадрата со стороной " + s.l + " = " + area(s));

    double a = 4;
    double b = 6;
    System.out.println("площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));

  }
    public static double area(Square s){
      return s.l * s.l;

    }

    public static double area( double a, double b){
      return a * b;

    }
  }