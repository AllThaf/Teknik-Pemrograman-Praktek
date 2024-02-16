
/**
 * Tujuan dari pembuatan kode di bawah ini adalah untuk memenuhi nilai dari mata
 * pelajaran Teknik Pemrograman
 * 15-02-2024
 *
 * @author Thafa Fadillah Ramdani | 231524027
 */

public class FloatingPoint {
  public static void main(String[] args) {
    // variabel double yang dapat menampung 15 desimal digit yang signifikan
    double x = 92.98;

    /*
     * Math.round(x) memiliki fungsi untuk membulatkan bilangan pecahan ke bilangan
     * bulat terdekat
     * jika >= .5 maka akan dibulatkan ke atas dan jika < .5 maka akan dibulatkan ke
     * bawah
     */
    int nx = (int) Math.round(x);

    System.out.println(nx);
  }
}
