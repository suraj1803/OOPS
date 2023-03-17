package interfaceDemo;

public class Point implements Comparable<Point>, Cloneable{
  public double x;
  public double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public int compareTo(Point o) {
    double distance1 = distanceFromOrigin(x, y);
    double distance2 = distanceFromOrigin(o.x, o.y);
    if (distance1 == distance2)
      return 0;
    else if (distance1 > distance2)
      return 1;
    else
      return -1;
  }

  private double distanceFromOrigin(double x, double y) {
    return Math.sqrt(x * x + y * y);
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  @Override
  public String toString() {
    return "(" + x + ", " + y + ")";
  }
}
