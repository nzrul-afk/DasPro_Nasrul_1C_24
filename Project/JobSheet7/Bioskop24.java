import java.util.Scanner;

public class Bioskop24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int HARGA_TIKET = 50000;
        int totalTiketTerjual = 0;
        double totalPenjualan = 0;
        int jumlahTiket;

        System.out.println("=== PROGRAM PENJUALAN TIKET BIOSKOP ===");
        System.out.println("Harga per tiket: Rp 50.000");
        System.out.println("Ketik '0' jika transaksi hari ini sudah selesai.\n");

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                System.out.println("Sesi penjualan tiket hari ini diakhiri.");
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid (tidak boleh negatif)! Masukkan ulang.");
                continue;
            }

            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15; // Diskon 15%
            } else if (jumlahTiket > 4) {
                diskon = 0.10; // Diskon 10%
            }

            double totalHargaTransaksi = jumlahTiket * HARGA_TIKET;
            double nominalDiskon = totalHargaTransaksi * diskon;
            double bayar = totalHargaTransaksi - nominalDiskon;

            totalTiketTerjual += jumlahTiket;
            totalPenjualan += bayar;

            System.out.println("Diskon: " + (int)(diskon * 100) + "% (Rp " + (long)nominalDiskon + ")");
            System.out.println("Total bayar transaksi: Rp " + (long)bayar);
            System.out.println("----------------------------------------------");
        }

        System.out.println("\n========== REKAPITULASI PENJUALAN HARIAN ==========");
        System.out.println("Total tiket terjual        : " + totalTiketTerjual + " tiket");
        System.out.println("Total harga penjualan tiket: Rp " + (long)totalPenjualan);
        System.out.println("===================================================");
        sc.close();
    }
}
