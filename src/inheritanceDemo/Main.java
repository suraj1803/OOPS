package inheritanceDemo;

public class Main {
  public static void main(String[] args) {
    try {
      double result = divide(10, 0);
      System.out.println(result);
    } catch (ArithmeticException ex) {
      System.out.println("divisor can't be zero");
    }
  }

  public static double divide(int a, int b) {
    if (b == 0)
      throw new ArithmeticException();
    return (double) a / b;
  }
}
