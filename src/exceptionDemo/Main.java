package exceptionDemo;
public class Main {
  public static void main(String[] args) {
    Circle circle = new Circle(1);
    try {
      circle.setRadius(-1);
    } catch (ArithmeticException ex) {
      System.out.println("Arithmatic exception");
    } catch (IllegalArgumentException ex) {
      System.out.println("IllegalArgument exception");
    }
  }
}