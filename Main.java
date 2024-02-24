public class Main {
  public static void main(String[] args) {
    // berikut adalah input dengan scanner
    // saya menghilangkan nextId karena dirasa
    // tidak ada hubungannya dengan tambah menu
    Restaurant.tambahMenuMakanan("Bala-Bala", 1000, 20);
    Restaurant.tambahMenuMakanan("Gehu", 1000, 20);
    Restaurant.tambahMenuMakanan("Tahu", 1000, 0);
    Restaurant.tambahMenuMakanan("Molen", 1000, 20);
    Restaurant.tambahMenuMakanan("Pisang goreng", 1000, 20);
    Restaurant.tambahMenuMakanan("Tempe goreng", 1000, 20);
    Restaurant.tambahMenuMakanan("Cireng", 1000, 20);
    Restaurant.tambahMenuMakanan("Nasgor", 13000, 20);
    Restaurant.tambahMenuMakanan("Martabak", 20000, 20);
    Restaurant.tambahMenuMakanan("Telur", 3000, 20);

    Restaurant.tampilMenuMakanan();
    // stok tidak perlu ditampilkan

    Pesan.tambahPesanan("Bala-Bala", 5);
    Pesan.tambahPesanan("Gehu", 5);
    Pesan.tambahPesanan("Tahu", 5);
    // untuk memesan, argumen yang dibutuhkan hanya
    // nama dan jumlah

    Pesan.tampilPesanan();
    // ditampilkan seperti yang biasa ada pada bon

    Restaurant.tampilMenuMakanan();
    // jika stok habis, nama menu tdk tampil
  }
}

// karena kebiasaan saya, 
// saya membuat ulang semua proggram
// sesuai dengan fitur yang dibutuhkan

// kesulitan:
// kurang mengerti instruksi
// dibantu penjelasan teman saat presentas (yobel)