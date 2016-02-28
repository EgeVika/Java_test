package ua.stqa.javatest.sendbox;

/**
 * Created by Buka on 28.02.2016.
 */
public class Point {
  public int a;
  public int b;

  public Point(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public double distance(Point p1) {
    return Math.sqrt(Math.pow((this.a - p1.a), 2) + Math.pow((this.b - p1.b), 2));

  }


}
