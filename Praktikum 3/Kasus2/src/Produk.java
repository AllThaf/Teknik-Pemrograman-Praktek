
/**
 * Produk class
 *
 * @author Thafa Fadillah Ramdani - 231524027
 */

public class Produk {
  private String nama;
  private double harga;
  private int quantity;

  /**
   * Constuctor dari kelas Produk
   *
   * @param nama
   * @param harga
   * @param quantity
   */
  public Produk(String nama, double harga, int quantity) {
    setNama(nama);
    setHarga(harga);
    setQuantity(quantity);
  }

  /**
   * Method untuk mengurangi stok
   *
   * @param qty jumlah barang yang dibeli
   */
  public void kurangiStok(int qty) {
    this.quantity = quantity - qty;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public double getHarga() {
    return harga;
  }

  public void setHarga(double harga) {
    this.harga = harga;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

}
