package store;

/**
 * This is the PartTime class file extends AbstractStoreEmployee class
 * file.
 *
 * @author Thafa Fadillah Ramdani
 */
public class PartTime extends AbstractStoreEmployee {
  private final double hoursTarget;

  /**
   * This is a argument constructor which Initializes variable hoursTarget
   * and
   * need to call its super class to initialize other variables
   *
   * @param hoursTarget         - The parameter Weeklly target of hours worked
   *                            is passed
   * @param numberOfHoursWorked - The parameter Number of hours worked is
   *                            passed.
   * @param hourlyRate          - The parameter Hourly Rate is passed.
   * @param storeDetails        - The parameter Details of the Store is passed.
   * @param associateName       - The parameter Name of the Sales Associate is
   *                            passed.
   * @param basePay             - The parameter Base pay is passed.
   * @param partTimeName        - The paramater Name of Part Timer is passed
   */
  public PartTime(double hoursTarget, double numberOfHoursWorked, double hourlyRate,
      String storeDetails, double basePay, String partTimeName) {
    super(numberOfHoursWorked, hourlyRate, storeDetails, basePay, partTimeName);
    this.hoursTarget = hoursTarget;
  }

  /**
   * This method checks if the employee will get fired or not.
   *
   * @return This method returs boolean the position for an employee
   */
  @Override
  public boolean willFired() {
    if (getNumberOfHoursWorked() < (getHoursTarget() - 10)) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Returns calculated Pay of the Part Time. The calculated pay is the
   * sum of basePay, commission and the product of number of hours worked and
   * hourly rate.
   *
   * @return - This method returns Payment of the Part Time.
   */
  @Override
  public double calculatePay() {
    return super.getBasePay() + calculateCommission() +
        (super.getNumberOfHoursWorked() * super.getHourlyRate());
  }

  /**
   * Checks if the part time should be awarded with a bonus.
   *
   * @return - This method returns boolean the eligibility status for
   *         bonus for an employee.
   */
  @Override
  public boolean checkPromotionEligibility() {
    if (getNumberOfHoursWorked() >= getHoursTarget()) {
      return true;
    } else {
      return false;
    }
  }

  public double getHoursTarget() {
    return hoursTarget;
  }

  /**
   * Returns the String representation of Sales. Append Super Class toString()
   * along with the Sales Rate.
   *
   * @return - This method returns a String representation of Sales and
   *         Employee details.
   */
  @Override
  public String toString() {
    return super.toString() + "Hours target per week: " + getHoursTarget() + " hours";
  }
}
