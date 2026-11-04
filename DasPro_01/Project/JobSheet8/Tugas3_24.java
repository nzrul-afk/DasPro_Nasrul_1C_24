import java.util.Scanner;

public class Tugas3_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahToko;
        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1! Ulangi input.");
           
            }
        } while (jumlahToko < 1);

        int totalBarangSemua = 0;
        int maxBarang = -1;
        int tokoTerbanyak = 1;

        for (int t = 1; t <= jumlahToko; t++) {
            System.out.println("--- Toko " + t + " ---");
            int jumlahPelanggan;
            do {
                System.out.print("Masukkan jumlah pelanggan: ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif! Ulangi input.");
                }
            } while (jumlahPelanggan < 0);
            int totalBarangToko = 0;
            for (int p = 1; p <= jumlahPelanggan; p++) {
                int barang;
                do {
                    System.out.print("  Jumlah barang pelanggan ke-" + p + ": ");
                    barang = sc.nextInt();
                    if (barang < 0) {
                        System.out.println("  Jumlah barang tidak boleh negatif! Ulangi input.");
                    }
                } while (barang < 0);
                totalBarangToko += barang;
            }

            System.out.println("Toko " + t + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);
            totalBarangSemua += totalBarangToko;

            if (totalBarangToko > maxBarang) {
                maxBarang = totalBarangToko;
                tokoTerbanyak = t;
            }
        }

        System.out.println("====================================");
        System.out.println("Total barang seluruh toko: " + totalBarangSemua);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        sc.close();
    }
}
