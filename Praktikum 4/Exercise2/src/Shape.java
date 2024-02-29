/**
 * Superclass Shape yang nanti akan di-extend oleh kelas Circle dan Rectacngle
 */
public class Shape {
  private String color;
  private boolean filled;

  /**
   * Konstruktor tanpa parameter/argumen dengan nilai default
   * Color: Green
   * Filled: true
   */
  public Shape() {
    setColor("Green");
    setFilled(true);
  }

  /**
   * Konstruktor ke-2 dengan variabel
   *
   * @param clr  inisialisasi warna
   * @param fill inisialisasi filled
   */
  public Shape(String clr, boolean fill) {
    setColor(clr);
    setFilled(fill);
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isFilled() {
    return filled;
  }

  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /**
   * @return spesifikasi dari kelas Shape
   */
  public String toString() {
    return "A Shape with color of " + color + " and " + ((filled) ? "filled" : "not filled");
  }
}