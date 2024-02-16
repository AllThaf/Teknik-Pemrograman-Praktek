
/**
 * Tujuan dari pembuatan kode di bawah ini adalah untuk memenuhi nilai dari mata pelajaran Teknik Pemrograman
 * 15-02-2024
 * @author Thafa Fadillah Ramdani | 231524027
 */

import java.util.Scanner;
import java.math.BigInteger;

public class dataTypes {
  public static void main(String[] agrs) {
    Scanner scanner = new Scanner(System.in);

    // Input max number
    System.out.println("Enter how much: ");
    Integer T = scanner.nextInt();

    System.out.println("Enter number: ");
    // Deklarasi panjang array dengan tipe data String
    String[] n = new String[T];

    // Loop untuk mengisi array String yang sudah dideklarasikan
    for (int i = 0; i < T; i++) {
      n[i] = scanner.next();
    }

    // Loop untuk mengecek dan menampilkan ke layar hasil dari logika
    for (int i = 0; i < T; i++) {
      BigInteger number = new BigInteger(n[i]);
      if (number.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0
          && number.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
        System.out.println(n[i] + " Can be fitted in:");

        if (number.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0
            && number.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {
          System.out.println("* byte");
        }
        if (number.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0
            && number.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {
          System.out.println("* short");
        }
        if (number.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0
            && number.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
          System.out.println("* int");
        }
        System.out.println("* long");
      } else {
        System.out.println(n[i] + " Can't be fitted anymore");
      }
    }
  }
}
