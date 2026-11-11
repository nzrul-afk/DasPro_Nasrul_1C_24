import java.util.Scanner;

public class Tugas2_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar", 
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("==============================================");
        System.out.println("           DAFTAR MENU KAFE KAMPUS            ");
        System.out.println("==============================================");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%d. %-18s : Rp %,d%n", (i + 1), menu[i], harga[i]);
        }
        System.out.println("==============================================");

        // Fitur Pencarian Menu
        System.out.print("\nApakah Anda ingin mencari menu terlebih dahulu? (y/n): ");
        String cariLagi = sc.nextLine().trim();

        while (cariLagi.equalsIgnoreCase("y")) {
            System.out.print("Masukkan nama menu yang ingin dicari: ");
            String key = sc.nextLine().trim();

            boolean ketemu = false;
            int indeksDitemukan = -1;

            // Algoritma Linear Search
            for (int i = 0; i < menu.length; i++) {
                if (menu[i].equalsIgnoreCase(key)) {
                    ketemu = true;
                    indeksDitemukan = i;
                    break;
                }
            }

            if (ketemu) {
                System.out.printf(">> Menu \"%s\" TERSEDIA! Harga: Rp %,d%n", 
                    menu[indeksDitemukan], harga[indeksDitemukan]);
            } else {
                System.out.printf(">> Maaf, menu \"%s\" TIDAK TERSEDIA dalam daftar menu kafe.%n", key);
            }

            System.out.print("Cari menu lain? (y/n): ");
            cariLagi = sc.nextLine().trim();
        }

        // Fitur Pemesanan Menu
        System.out.println("\n---------------- FORM PEMESANAN --------------");
        System.out.print("Masukkan jumlah item pesanan yang ingin dipesan: ");
        int jumlahItem = sc.nextInt();
        sc.nextLine(); // Clear newline buffer

        String[] pesananNama = new String[jumlahItem];
        int[] pesananHarga = new int[jumlahItem];
        int totalBiaya = 0;

        for (int i = 0; i < jumlahItem; i++) {
            while (true) {
                System.out.print("Nama menu untuk pesanan ke-" + (i + 1) + ": ");
                String pilihan = sc.nextLine().trim();

                // Validasi menu ada dalam daftar menu menggunakan linear search
                int matchIndex = -1;
                for (int m = 0; m < menu.length; m++) {
                    if (menu[m].equalsIgnoreCase(pilihan)) {
                        matchIndex = m;
                        break;
                    }
                }

                if (matchIndex != -1) {
                    pesananNama[i] = menu[matchIndex];
                    pesananHarga[i] = harga[matchIndex];
                    totalBiaya += pesananHarga[i];
                    break;
                } else {
                    System.out.println(">> Menu tidak valid/tidak ada di daftar. Silakan input ulang!");
                }
            }
        }

        // Tampilan Rekap Pesanan
        System.out.println("\n==============================================");
        System.out.println("                 STRUK PESANAN                ");
        System.out.println("==============================================");
        System.out.printf("%-4s %-25s %-12s%n", "No", "Nama Menu", "Harga");
        System.out.println("----------------------------------------------");
        for (int i = 0; i < jumlahItem; i++) {
            System.out.printf("%-4d %-25s Rp %,d%n", (i + 1), pesananNama[i], pesananHarga[i]);
        }
        System.out.println("==============================================");
        System.out.printf("TOTAL BIAYA              : Rp %,d%n", totalBiaya);
        System.out.println("==============================================");

        sc.close();
    }
}
