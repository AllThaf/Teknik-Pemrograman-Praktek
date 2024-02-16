
/**
 * Tujuan dari pembuatan kode di bawah ini adalah untuk memenuhi nilai dari mata
 * pelajaran Teknik Pemrograman
 * 15-02-2024
 *
 * @author Thafa Fadillah Ramdani | 231524027
 */

class ConvertDataType {
  static short methodOne(long l) {
    // Mengubah long menjadi int
    int i = (int) l;
    // Mengembalikan nilai sebagai short
    return (short) i;
  }

  public static void main(String[] args) {
    double d = 10.25;
    // Mengubah double menjadi float
    float f = (float) d;

    // Mengubah long menjadi byte
    // Long diubah menjadi short terlebih dahulu dalam function methodOne
    byte b = (byte) methodOne((long) f);
    System.out.println(b);
  }
}
