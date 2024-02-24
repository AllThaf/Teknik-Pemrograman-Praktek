
/**
 * Main class
 *
 * @author Thafa Fadillah Ramdani - 231524027
 */

import java.util.Scanner;

public class PemesananMain {
    static Penjualan[] penjualan = new Penjualan[100];
    static Produk[] produk = new Produk[10];
    static Restaurant menu = new Restaurant();

    public static void main(String[] args) throws Exception {
        double hargaTotal = 0;
        int index = 0;
        Scanner scan = new Scanner(System.in);

        // Objek produk dijadikan sebuah array agar mudah dioperasikannya
        produk[0] = new Produk("Mie instan goreng", 4_000, 20);
        produk[1] = new Produk("Mie instan rebus", 4_000, 4);
        produk[2] = new Produk("Biskuit", 5_000, 10);
        produk[3] = new Produk("Ciki", 2_000, 50);
        produk[4] = new Produk("Air mineral botol", 3_000, 24);
        produk[5] = new Produk("Air mineral gelas", 500, 48);
        produk[6] = new Produk("Susu kaleng", 7_000, 0);
        produk[7] = new Produk("Roti", 3_000, 12);
        produk[8] = new Produk("Es krim", 5_000, 7);
        produk[9] = new Produk("Pop mie", 6_000, 2);
        menu.tampilMenu(produk);

        // While loop untuk memesan makanan
        boolean pesanLagi = true;
        while (pesanLagi) {
            System.out.print("Pilih menu: ");
            int pilihMenu = scan.nextInt();
            scan.nextLine();

            // Validasi input pilih menu
            while (pilihMenu < 1 || pilihMenu > produk.length) {
                System.out.println("Mohon masukkan nomor yang benar");
                System.out.print("Pilih menu: ");
                pilihMenu = scan.nextInt();
                scan.nextLine();
            }

            // Validasi ada tidaknya stok
            if (!menu.cekStok(produk, pilihMenu - 1)) {
                System.out.println("Stok habis");
            } else {
                System.out.print("Ingin berapa banyak: ");
                int pilihQuantity = scan.nextInt();
                scan.nextLine();

                // Validasi apabila pesanan melebih stok
                while (pilihQuantity > produk[pilihMenu - 1].getQuantity()) {
                    System.out.println("Stok tidak mencukupi untuk pesanan ini.");
                    System.out.print("Ingin berapa banyak: ");
                    pilihQuantity = scan.nextInt();
                    scan.nextLine();
                }

                // Validasi apakah pembeli memesan barang yang sudah dipesan
                boolean beliSama = false;
                for (int i = 0; i < index; i++) {
                    if (penjualan[i].getNama().equals(produk[pilihMenu - 1].getNama())) {
                        penjualan[i].totalHarga(produk, pilihMenu, pilihQuantity);
                        System.out.printf("%nPesanan: %-20s quantity: %-5d Harga: %.1f%n\n", penjualan[i].getNama(),
                                pilihQuantity, penjualan[i].getHargaBarang());
                        penjualan[i].setQuantity(pilihQuantity + penjualan[i].getQuantity());
                        hargaTotal += penjualan[i].getHargaBarang();
                        index--;
                        beliSama = true;
                    }
                }

                // Apabila tidak terindikasi kesamaan pesanan, buat index baru
                // untuk menampung pesanan
                if (!beliSama) {
                    penjualan[index] = new Penjualan(produk[pilihMenu - 1].getNama(), pilihQuantity);
                    penjualan[index].totalHarga(produk, pilihMenu, penjualan[index].getQuantity());
                    hargaTotal += penjualan[index].getHargaTotal();
                    System.out.printf("%nPesanan: %-20s quantity: %-5d Harga: %.1f%n\n", penjualan[index].getNama(),
                            penjualan[index].getQuantity(), penjualan[index].getHargaTotal());
                }

                // Untuk mengecek apakah seluruh produk sudah habis atau belum
                if (!menu.cekStok(produk, 0) &&
                        !menu.cekStok(produk, 1) &&
                        !menu.cekStok(produk, 2) &&
                        !menu.cekStok(produk, 3) &&
                        !menu.cekStok(produk, 4) &&
                        !menu.cekStok(produk, 5) &&
                        !menu.cekStok(produk, 6) &&
                        !menu.cekStok(produk, 7) &&
                        !menu.cekStok(produk, 8) &&
                        !menu.cekStok(produk, 9)) {
                    System.out.println("Seluruh stok sudah habis, terimasik sudah berbelanja\n");
                    index++;
                    pesanLagi = false;
                } else {
                    System.out.println("Apakah ingin memesan lagi? ya/tidak");
                    String konfirmasi = scan.nextLine().toLowerCase();
                    pesanLagi = konfirmasi.equals("ya");
                    index++;
                    if (pesanLagi) {
                        menu.tampilMenu(produk);
                    }
                }
            }

        }

        // Menampilkan total pesanan
        System.out.println("\t\t\tTotal pemesanan");
        System.out.println("=========================================================");
        for (int i = 0; i < index; i++) {
            System.out.printf("%d. %-20s quantity: %-5d Harga: %.1f\n", i + 1, penjualan[i].getNama(),
                    penjualan[i].getQuantity(), penjualan[i].getHargaTotal());
        }
        System.out.println("Total bayar: " + hargaTotal);

        scan.close();
    }
}
