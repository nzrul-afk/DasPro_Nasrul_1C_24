
public class PengunjungCafe24 {
    static void daftarPengunjung(int nomorMeja, String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung (Meja " + nomorMeja + "):");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }

    static int hitungTotalBelanja(int... harga) {
        int total = 0;
        for (int h : harga) {
            total += h;
        }
        return total;
    }

    public static void main(String[] args) {
        daftarPengunjung(1, "Ali", "Budi", "Citra");
        daftarPengunjung(2, "Andi");
        daftarPengunjung(3, "Doni", "Eti", "Fahmi", "Galih");

        System.out.println("Total belanja 1 item: Rp " + hitungTotalBelanja(15000));
        System.out.println("Total belanja 3 item: Rp " + hitungTotalBelanja(15000, 20000, 12000));
        System.out.println("Total belanja 5 item: Rp " + hitungTotalBelanja(15000, 20000, 22000, 12000, 10000));
    }
}
