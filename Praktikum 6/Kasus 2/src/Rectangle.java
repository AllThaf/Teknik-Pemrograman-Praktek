/**
 * Rectangle class
 *
 * @author Thafa Fadillah Ramdani
 */

// Rectangle class is descendants of the Shape class
public class Rectangle extends Shape {
  // A rectangle is defined by its length and width
  private double widht;
  private double lenght;

  // --------------------------------
  // Constructor: sets up the rectangle.
  // --------------------------------
  public Rectangle(double w, double l) {
    super("Rectangle");
    widht = w;
    lenght = l;
  }

  // ---------------------------------------
  // Returns the surface area of the rectangle.
  // Its area is length times width
  // ---------------------------------------
  public double area() {
    return widht * lenght;
  }

  // --------------------------------
  // Returns the rectangle as a String.
  // --------------------------------
  public String toString() {
    return super.toString() + " of widht " + widht + " and lenght " + lenght;
  }
}
