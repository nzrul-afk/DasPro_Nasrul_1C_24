import java.util.Scanner;

public class kafe24 {
    public static void Menu(String namaPelanggan, boolean isMember, int jamKunjung) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        if (jamKunjung >= 14 && jamKunjung <= 16) {
            System.out.println("Happy Hour! Diskon 20% untuk semua minuman");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHargaNoAbsen(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    public static int hitungDiskon(int total, String kodePromo, boolean isMember) {
        int persenDiskon = 0;
        if (kodePromo.equals("DISKON50")) {
            persenDiskon += 50;
        } else if (kodePromo.equals("DISKON30")) {
            persenDiskon += 30;
        } else if (!kodePromo.isEmpty() && !kodePromo.equals("-")) {
            System.out.println("Kode promo invalid");
        }

        if (isMember) {
            persenDiskon += 10;
        }

        return (total * persenDiskon) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = sc.nextLine();
        System.out.print("Apakah Anda member (y/n)? ");
        boolean isMember = sc.nextLine().equalsIgnoreCase("y");
        System.out.print("Masukkan jam kunjung (0-23): ");
        int jamKunjung = sc.nextInt();
        sc.nextLine();

        Menu(namaPelanggan, isMember, jamKunjung);

        int totalHarga = 0;
        char lanjut;
        do {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu < 1 || pilihanMenu > 6) {
                System.out.println("Menu tidak tersedia");
            } else {
                System.out.print("Masukkan jumlah item yang ingin dipesan: ");
                int banyakItem = sc.nextInt();
                totalHarga += hitungTotalHargaNoAbsen(pilihanMenu, banyakItem);
            }

            System.out.print("Apakah ingin memesan menu lain (y/n)? ");
            lanjut = sc.next().charAt(0);
        } while (lanjut == 'y' || lanjut == 'Y');

        sc.nextLine();
        System.out.print("Masukkan kode promo (atau '-' jika tidak ada): ");
        String kodePromo = sc.nextLine();

        int besarDiskon = hitungDiskon(totalHarga, kodePromo, isMember);
        int totalBayar = totalHarga - besarDiskon;

        System.out.println("\nTotal harga sebelum diskon: Rp " + totalHarga);
        System.out.println("Besar diskon: Rp " + besarDiskon);
        System.out.println("Total yang harus dibayar: Rp " + totalBayar);

        sc.close();
    }
}
