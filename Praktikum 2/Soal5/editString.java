
/**
 * Tujuan dari pembuatan kode di bawah ini adalah untuk memenuhi nilai dari mata
 * pelajaran Teknik Pemrograman
 * 15-02-2024
 *
 * @author Thafa Fadillah Ramdani | 231524027
 */

import java.util.Scanner;

public class editString {
  public static void main(String[] agrs) {
    Scanner scan = new Scanner(System.in);

    // Menerima input string A dan B
    String A = scan.next();
    String B = scan.next();

    // Menjumlahkan string A dan string B
    System.out.println(A.length() + B.length());

    // Membandingkan lexicographically string A dan string B
    // Apabila A lebih besar daripada B maka akan mengembalikan YES
    // Apabila B lebih besar daripada A maka akan mengembalikan NO
    System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

    // Mengubah huruf pertama setiap string menjadi kapital dan menggabungkan kedua
    // string tersebut
    System.out.println(
        A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
  }
}
