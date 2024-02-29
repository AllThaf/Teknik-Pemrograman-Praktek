/** Subclass yang meng-extend kelas Shape */
public class Circle extends Shape {
  private double radius;

  /**
   * Kosntruktor non-argument dengan nilai default
   * radius: 1.0
   */
  public Circle() {
    setRadius(1.0);
  }

  /**
   * Konstruktor ke-2 dengan variabel:
   * color dan filled memiliki nilai default kontruktor non-argument kelas super
   *
   * @param rad inisialisasi radius
   */
  public Circle(double rad) {
    setRadius(rad);
  }

  /**
   * Konstruktor ke-3 dengan variabel:
   *
   * @param rad  inisialisasi radius
   * @param clr  inisialisasi color
   * @param fill inisialisasi filled
   */
  public Circle(double rad, String clr, boolean fill) {
    super(clr, fill);
    setRadius(rad);
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  /**
   * @return luas lingkaran (circle)
   */
  public double getArea() {
    return radius * radius * Math.PI;
  }

  /**
   * @return keliling lingkaran (circle)
   */
  public double getPerimeter() {
    return 2 * Math.PI * radius;
  }

  /**
   * @return spesifikasi dari kelas Cicle dan superclass-nya
   */
  @Override
  public String toString() {
    return "A Circle with radius= " + radius + ", which is a subclass of " + super.toString();
  }
}
