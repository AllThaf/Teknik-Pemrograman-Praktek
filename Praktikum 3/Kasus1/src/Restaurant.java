public class Restaurant {
    private Makanan[] makanan;
    private static byte idMakanan = 0;

    public Restaurant() {
        makanan = new Makanan[10];
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        makanan[idMakanan] = new Makanan(nama, harga, stok);
        idMakanan++;
    }

    public void tampilMenuMakanan() {
        for (int i = 0; i < idMakanan; i++) {
            if (!isOutOfStock(i)) {
                System.out.println(makanan[i].getNama() + "[" + makanan[i].getStok() + "]" + "\tRp. "
                        + makanan[i].getHarga());
            }
        }
    }

    public boolean isOutOfStock(int idMakanan) {
        if (makanan[idMakanan].getStok() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void pesanMakanan(int idMakanan) {
        if (!isOutOfStock(idMakanan - 1)) {
            System.out.println("Pesanan berhasil diproses");
            makanan[idMakanan - 1].kurangiStok();
        } else {
            System.out.println("Pesanan tidak dapat diproses");
        }
    }
}
