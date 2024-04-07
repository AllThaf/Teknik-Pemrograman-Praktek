package pair3;

import java.time.LocalDate;

public class Employee {
  private String name;
  private int salary;
  private LocalDate hiring;

  public Employee(String name, int salary, int year, int month, int day) {
    setName(name);
    setSalary(salary);
    setHiring(LocalDate.of(year, month, day));
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public LocalDate getHiring() {
    return hiring;
  }

  public void setHiring(LocalDate hiring) {
    this.hiring = hiring;
  }
}
