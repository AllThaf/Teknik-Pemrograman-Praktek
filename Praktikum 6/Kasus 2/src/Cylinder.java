/**
 * Cylinder class
 *
 * @author Thafa Fadillah Ramdani
 */

// Cylinder class is descendants of the Shape class
public class Cylinder extends Shape {
  // A cylinder is defined by a radius and height
  private double radius;
  private double height;

  // --------------------------------
  // Constructor: sets up the cylinder.
  // --------------------------------
  public Cylinder(double r, double h) {
    super("Cylinder");
    radius = r;
    height = h;
  }

  // ---------------------------------------
  // Returns the surface area of the cylinder.
  // Its area (surface area) is PI*radius^2*height
  // ---------------------------------------
  public double area() {
    return Math.PI * radius * radius * height;
  }

  // --------------------------------
  // Returns the cylinder as a String.
  // --------------------------------
  public String toString() {
    return super.toString() + " of radius " + radius + " and height " + height;
  }
}
