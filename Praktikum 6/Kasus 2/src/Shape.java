/**
 * Abstract class Shape
 *
 * @author Thafa Fadillah Ramdani
 */

public abstract class Shape {
  // An instance variable shapeName of type String
  private String shapeName;

  public Shape(String name) {
    this.shapeName = name;
  }

  // An abstract method area()
  public abstract double area();

  // A toString method that returns the name of the shape
  public String toString() {
    return shapeName;
  }
}
