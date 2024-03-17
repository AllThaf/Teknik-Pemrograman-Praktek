/**
 * Commission Class untuk komisi karyawan
 *
 * @author Thafa Fadillah Ramdani
 */

// It extends the Hourly class
public class Commission extends Hourly {
  // It has two instance variables totalSales dan commissionRate
  private double totalSales;
  private double commissionRate;

  // The constructor takes 6 parameters
  public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate,
      double commissionRate) {
    super(eName, eAddress, ePhone, socSecNumber, rate);
    this.commissionRate = commissionRate;
  }

  // One additional method is needed: public void addSales (double totalSales)
  // that adds the parameter to the instance variable representing total sales.
  public void addSales(double totalSales) {
    this.totalSales += totalSales;
  }

  // The pay method must call the pay method of the parent class
  public double pay() {
    double payment = super.pay() + (commissionRate * totalSales);
    totalSales = 0;
    return payment;
  }

  // The toString method needs to call the toString method of the parent class
  // then add the total sales to that.
  public String toString() {
    String result = super.toString();
    result += "\nTotal sales: " + totalSales;
    return result;
  }
}
