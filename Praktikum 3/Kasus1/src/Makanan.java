public class Makanan {
  private String nama;
  private double harga;
  private int stok;

  public Makanan(String nama, double harga, int stok) {
    setNama(nama);
    setHarga(harga);
    setStok(stok);
  }

  public void kurangiStok() {
    this.stok = stok - 1;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public void setHarga(double harga) {
    this.harga = harga;
  }

  public void setStok(int stok) {
    this.stok = stok;
  }

  public String getNama() {
    return nama;
  }

  public double getHarga() {
    return harga;
  }

  public int getStok() {
    return stok;
  }
}
