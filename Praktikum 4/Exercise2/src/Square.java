/** Subclass yang meng-extend kelas Rectangle */
public class Square extends Rectangle {

  /**
   * Kosntruktor non-argument dengan nilai default
   * width: 1.0
   * length: 1.0
   * Karena mengambil default dari kelas super
   */
  public Square() {
    super();
  }

  /**
   * Konstuktor ke-2 dengan variabel:
   *
   * @param side inisialisasi panjang sisi
   */
  public Square(double side) {
    // Memakai konstruktor ke-2 dari kelas supernya untuk menginisialisasi
    super(side, side);
  }

  /**
   * Konstruktor ke-3 dengan variabel:
   *
   * @param side inisialisasi panjang sisi
   * @param clr  inisialisasi color
   * @param fill inisialisasi filled
   */
  public Square(double side, String clr, boolean fill) {
    // Memakai konstruktor ke-3 dari kelas supernya untuk menginisialisasi
    super(side, side, clr, fill);
  }

  public double getSide() {
    return getWidth();
  }

  public void setSide(double side) {
    setWidth(side);
  }

  /**
   * Override keliling karena rumusnya berbeda
   * Luas tidak perlu di-override karena rumusnya sama
   */
  @Override
  public double getPerimeter() {
    return 4 * getSide();
  }

  /** Menetapkan side sebagai width */
  @Override
  public void setWidth(double side) {
    super.setWidth(side);
  }

  /** Menetapkan side sebagai length */
  @Override
  public void setLength(double side) {
    super.setLength(side);
  }

  /**
   * @return spesifikasi dari kelas Square dan superclass-nya
   */
  @Override
  public String toString() {
    return "A Square with side= " + getWidth() + ", which is a subclass of " + super.toString();
  }
}
