
/**
 * Penjualan class
 *
 * @author Thafa Fadillah Ramdani - 231524027
 */

public class Penjualan {
  private String nama;
  private int quantity;
  private double hargaBarang = 0;
  private double hargaTotal = 0;

  /**
   * Constructor dari kelas Penjualan
   *
   * @param nama
   * @param quantity
   */
  public Penjualan(String nama, int quantity) {
    setNama(nama);
    setQuantity(quantity);
  }

  /**
   * Untuk memproses harga total dari produk yang dibeli
   * Juga memanggil method kurangiStok dari kelas Produk agar stok berkurang
   * sesuai dengan quantity yang dibeli
   *
   * @param produk
   * @param input
   * @param quantity
   */
  public void totalHarga(Produk[] produk, int input, int qty) {
    setHargaBarang(produk[input - 1].getHarga() * qty);
    setHargaTotal(hargaTotal += hargaBarang);
    produk[input - 1].kurangiStok(quantity);
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public double getHargaTotal() {
    return hargaTotal;
  }

  public void setHargaTotal(double hargaTotal) {
    this.hargaTotal = hargaTotal;
  }

  public double getHargaBarang() {
    return hargaBarang;
  }

  public void setHargaBarang(double hargaBarang) {
    this.hargaBarang = hargaBarang;
  }
}