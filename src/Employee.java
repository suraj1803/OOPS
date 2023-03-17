public class Employee {
  private int baseSalary;
  private int hourlyRate;

  public static int numberOfEmployees;

  public Employee(int baseSalary) {
    this(baseSalary, 0);
  }

  public Employee(int baseSalary, int hourlyRate) {
    setBaseSalary(baseSalary);
    setHourlyRate(hourlyRate);
    numberOfEmployees++;
  }

  public static void printNumberOfEmployees() {
    System.out.println(numberOfEmployees);
  }

  public int calculateWage(int extraHours) {
    return baseSalary + hourlyRate * extraHours;
  }

  public int calculateWage() {
    return calculateWage(0);
  }

  private void setBaseSalary(int baseSalary) {
    if (baseSalary <= 0)
      throw new IllegalArgumentException("Salary cannot be zero or less");
    this.baseSalary = baseSalary;
  }

  public void setHourlyRate(int hourlyRate) throws IllegalArgumentException{
    if (hourlyRate < 0)
      throw new IllegalArgumentException("Hourly rate cannot be zero or less");
    this.hourlyRate = hourlyRate;
  }

  private int getBaseSalary() {
    return baseSalary;
  }

  private int getHourlyRate() {
    return hourlyRate;
  }
}

