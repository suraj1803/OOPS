package exceptionDemo;

public class Circle {
  private double radius;

  private static int numberOfCircle = 0;

  public Circle() {
    this(1.0);
  }

  public Circle(double radius) {
    setRadius(radius);
    numberOfCircle++;
  }

  public double getRadius() {
    return radius;
  }

  // Although it is not necessary to declare
  // runtime exceptions or unchecked Exception in method
  public void setRadius(double radius) throws IllegalArgumentException{
    if (radius < 0)
      throw new IllegalArgumentException("Radius can't be negative");
    this.radius = radius;
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }
}
