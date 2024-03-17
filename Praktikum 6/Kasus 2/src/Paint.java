// *********************************************************
// Paint.java
//
// Represnets a type of paint that has a fixed area
// covered by a gllon. All measurements are in feet.
// *********************************************************

public class Paint {
  private double coverage; // number of square feet per gallon

  // --------------------------------------
  // Constructor: Sets uo the paint object.
  // --------------------------------------
  public Paint(double c) {
    coverage = c;
  }

  // -------------------------------------------------
  // Returns the amount of paint (number of gallons)
  // needed to paint the shape fiven as the parameter
  // -------------------------------------------------
  public double amount(Shape s) {
    // Leave the print statement
    System.out.println("Computing amount for " + s);
    // The amount of paint needed is the area of the shape divided by the coverage
    // for the paint
    return s.area() / coverage;
  }
}
