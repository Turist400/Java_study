package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;



public class SquareTests {
    @Test
    public void testArea() {
        Square s = new Square(5);
        assert s.area() == 25;
    }

    @Test
    public void testDistance() {                 //Positive test. Distance equal.
        Point p1 = new Point(1.0, 1.0);
        Point p2 = new Point(5.0, 7.0);
        Assert.assertEquals (p1.distance(p2),  7.211102550927978);
    }
    @Test
    public void testDistanceNegative() {         //Negative test. Distance not equal.
        Point p1 = new Point(1.0, 1.0);
        Point p2 = new Point(5.0, 7.0);
        Assert.assertNotEquals (p1.distance(p2),  10.0);
    }
    @Test
    public void testDistanceNegative1() {        //Positive test. Distance not Null.
        Point p1 = new Point(1.0, 1.0);
        Point p2 = new Point(5.0, 7.0);
        Assert.assertNotNull (p1.distance(p2));
    }
}
