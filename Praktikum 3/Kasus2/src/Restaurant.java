
/**
 * Resaturant class
 *
 * @author Thafa Fadillah Ramdani - 231524027
 */

public class Restaurant {

  /**
   * Method untuk menampilkan menu yang tersedia
   *
   * @param produk objek dari kelas Produk
   */
  public void tampilMenu(Produk[] produk) {
    System.out.println("\t\tMENU PRODUK\t\t");
    System.out.println("==========================================");
    for (int i = 0; i < 10; i++) {
      if (cekStok(produk, i)) {
        System.out.printf("%d. %-20s [%d] = RP.%.1f \n", (i + 1), produk[i].getNama(), produk[i].getQuantity(),
            produk[i].getHarga());
      }
    }
  }

  /**
   * Method untuk mengecek ada tidaknya stok produk
   *
   * @param produk objek dari kelas Produk
   * @param i      index
   * @return boolean yang menmpresentasikan ada tidaknya stok
   */
  public boolean cekStok(Produk[] produk, int i) {
    if (produk[i].getQuantity() == 0) {
      return false;
    } else {
      return true;
    }
  }

}
