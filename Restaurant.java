public class Restaurant {
  protected static String[] namaMakanan = new String[10];
  protected static int[] hargaMakanan = new int[10];
  protected static int[] stok = new int[10];
  protected static int id = 0;
  // agar lebih rapih, saya menerapkan encapsulasi

  public static void tambahMenuMakanan(String nama, int harga, int stok) {
    namaMakanan[id] = nama;
    hargaMakanan[id] = harga;
    Restaurant.stok[id] = stok;
    id++; // id bertambah otomatis
  }

  public static boolean isOutOfStock(int i) {
    return stok[i] == 0;
    // menghasilkan bolean yg memberitahu masi ada
    // stok atau tidak
    // jika masi ada, maka return false
  }

  public static void tampilMenuMakanan() {
    System.out.println("\nDaftar menu:");
    for (int i = 0; i < id; i++) {
      if (!isOutOfStock(i)) {
        System.out.printf("%d. %s%15s= %d\n", i + 1, namaMakanan[i], " ".repeat(Math.max(0, 15 - namaMakanan[i].length())), hargaMakanan[i]);
      }
    }
  }

  public static int[] isOutOfStock(String nama, int jumlah) {
    int[] result = new int[2];
    for (int i = 0; i < id; i++) {
      if (namaMakanan[i].equals(nama) && stok[i] >= jumlah) {
        result[0] = 0; // stok habis
        result[1] = i; // index barang
        return result; // return 2 nilai
      }
    }
    result[0] = 1; // out of stock
    return result;
  }
}
// kelas Penjualan saya beri nama Pesan.java
// karena saya rasa lebih sesuai