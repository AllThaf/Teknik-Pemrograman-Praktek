package pair3;

public class Manager extends Employee {
  private int bonus;

  public Manager(String name, int salary, int year, int month, int day) {
    super(name, salary, year, month, day);
    setBonus(0);
  }

  public int getBonus() {
    return bonus;
  }

  public void setBonus(int bonus) {
    this.bonus = bonus;
  }
}
