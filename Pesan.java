public class Pesan extends Restaurant {
  private static String[] menu = new String[10];
  private static int[] harga = new int[10];
  private static int[] jumlah = new int[10];
  private static int[] total1 = new int[10];
  private static int total2 = 0;
  private static int id = 0;
  // agar lebih rapih, saya menerapkan encapsulasi
  // dibuat mirip antara Pesan.java dengan Restaurant.java
  // dengan menggunakan inheritance

  public static void tambahPesanan(String nama, int jumlah) {
    int[] data = isOutOfStock(nama, jumlah);
    // isOutOfStock ada pada Restaurant.java
    boolean found = data[0] == 0;
    int index = data[1];
    // disesuaikan dengan pada isOutOfStock
    if (found) {
      int harga = hargaMakanan[index]; 
      menu[id] = nama;
      Pesan.harga[id] = harga;
      Pesan.jumlah[id] = jumlah;
      total1[id] = harga * jumlah;
      total2 += harga * jumlah;
      id++; // id bertambah otomatis
      stok[index] -= jumlah; 
      // mengurangi stok
    }
  }

  public static void tampilPesanan() {
    System.out.println("\nDaftar pesanan: ");
    String header = "   Nama           jum  total";
    System.out.println(header);
    for (int i = 0; i < id; i++) {
      System.out.printf("%d. %s%15s%d%5d\n", i + 1, menu[i], " ".repeat(Math.max(0, 15 - menu[i].length())), jumlah[i], total1[i]);
    }
    System.out.println("total                   " + total2);
  }
}
