/** Subclass yang meng-extend kelas Shape */
public class Rectangle extends Shape {
  private double width;
  private double length;

  /**
   * Kosntruktor non-argument dengan nilai default
   * width: 1.0
   * length: 1.0
   */
  public Rectangle() {
    setWidth(1.0);
    setLength(1.0);
  }

  /**
   * Konstruktor ke-2 dengan variabel:
   * color dan filled memiliki nilai default kontruktor non-argument kelas super
   *
   * @param wid inisialisasi width
   * @param len inisialisasi length
   */
  public Rectangle(double wid, double len) {
    setWidth(wid);
    setLength(len);
  }

  /**
   * Konstruktor ke-3 dengan variabel:
   *
   * @param wid  inisialisasi width
   * @param len  inisialisasi length
   * @param clr  inisialisasi color
   * @param fill inisialisasi filled
   */
  public Rectangle(double wid, double len, String clr, boolean fill) {
    super(clr, fill);
    setWidth(wid);
    setLength(len);
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  /**
   * @return luas persegi panjang
   */
  public double getArea() {
    return width * length;
  }

  /**
   * @return keliling persegi panjang
   */
  public double getPerimeter() {
    return (2 * width) + (2 * length);
  }

  /**
   * @return spesifikasi dari kelas Rectangle dan superclass-nya
   */
  @Override
  public String toString() {
    return "A Rectangle with width= " + width + " and length= " + length + ", which is a subclass of "
        + super.toString();
  }
}
