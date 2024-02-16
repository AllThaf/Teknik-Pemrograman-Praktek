
/**
 * Tujuan dari pembuatan kode di bawah ini adalah untuk memenuhi nilai dari mata
 * pelajaran Teknik Pemrograman
 * 15-02-2024
 *
 * @author Thafa Fadillah Ramdani | 231524027
 */

public class Constants {
  public static void main(String[] args) {
    // variabel lokal yang hanya bisa di akses dalam method 'main' saja
    final double CM_PER_INCH = 2.54;
    double paperWidth = 8.5;
    double paperHeight = 11;
    System.out.println("Paper size in centimeters: " +
        paperWidth * CM_PER_INCH + " by " + paperHeight *
            CM_PER_INCH);
  }
}