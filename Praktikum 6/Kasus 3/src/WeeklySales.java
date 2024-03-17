// ******************************************************************
// WeeklySales.java
//
// Sorts the Sales staff in descending oreder by sales.
// ******************************************************************

import java.util.Scanner;

public class WeeklySales {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Berapa banyak pekerja yang ingin anda input? ");
    int MAX_PEKERJA = scan.nextInt();
    scan.nextLine();

    Salesperson[] salesStaff = new Salesperson[MAX_PEKERJA];

    for (int i = 0; i < MAX_PEKERJA; i++) {
      System.out.println("Pekerja nomor " + (i + 1));
      System.out.println("Masukkan first name: ");
      String first = scan.nextLine();
      System.out.println("Masukkan last name: ");
      String last = scan.nextLine();
      System.out.println("Masukkan tatal sales: ");
      int totalSales = scan.nextInt();
      scan.nextLine();

      salesStaff[i] = new Salesperson(first, last, totalSales);
    }

    scan.close();
    Sorting.insertionSort(salesStaff);
    System.out.println("\nRanking of Sales for the Week\n");
    for (Salesperson s : salesStaff)
      System.out.println(s);
  }
}

// Salesperson[] salesStaff = new Salesperson[10];

// salesStaff[0] = new Salesperson("Jane", "Jones", 3000);
// salesStaff[1] = new Salesperson("Daffy", "Duck", 4935);
// salesStaff[2] = new Salesperson("James", "Jones", 3000);
// salesStaff[3] = new Salesperson("Dick", "Walter", 2800);
// salesStaff[4] = new Salesperson("Don", "Trump", 1570);
// salesStaff[5] = new Salesperson("Jane", "Black", 3000);
// salesStaff[6] = new Salesperson("Harry", "Taylor", 7300);
// salesStaff[7] = new Salesperson("Andy", "Adams", 5000);
// salesStaff[8] = new Salesperson("Jim", "Doe", 2850);
// salesStaff[9] = new Salesperson("Walt", "Smith", 3000);