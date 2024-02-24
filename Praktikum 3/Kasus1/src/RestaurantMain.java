public class RestaurantMain {
  public static void main(String[] args) {
    Restaurant menu = new Restaurant();
    menu.tambahMenuMakanan("1. Bala-Bala", 1_000, 20);
    menu.tambahMenuMakanan("2. Gehu", 1_000, 20);
    menu.tambahMenuMakanan("3. Tahu", 1_000, 0);
    menu.tambahMenuMakanan("4. Molen", 1_000, 20);
    menu.tampilMenuMakanan();

    menu.pesanMakanan(1);
    menu.tampilMenuMakanan();
    menu.pesanMakanan(3);
    menu.tampilMenuMakanan();

  }
}
