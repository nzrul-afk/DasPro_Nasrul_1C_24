import java.util.Scanner;

public class latihan3_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Merek (converse/sketcher/nike): ");
        String merek = sc.nextLine().toLowerCase();

        System.out.print("Kategori: ");
        String kategori = sc.nextLine().toLowerCase();

        System.out.print("Ukuran: ");
        int ukuran = sc.nextInt();

        int harga = 0;

        if (merek.equals("converse")) {
            if (kategori.equals("slip on")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 800000;
                    }
                }
            } else if (kategori.equals("high top")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1200000;
                    }
                }
            }
        } else if (merek.equals("sketcher")) {
            if (kategori.equals("woman")) {
                if (ukuran >= 36) {
                    if (ukuran <= 41) {
                        harga = 1000000;
                    }
                }
            } else if (kategori.equals("man")) {
                if (ukuran >= 41) {
                    if (ukuran <= 44) {
                        harga = 1800000;
                    }
                }
            }
        } else if (merek.equals("nike")) {
            if (kategori.equals("kids")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 750000;
                    }
                }
            } else if (kategori.equals("adult")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1500000;
                    }
                }
            }
        }

        if (harga == 0) {
            System.out.println("Data tidak ditemukan / ukuran tidak tersedia");
        } else {
            System.out.println("Harga sepatu: Rp" + harga);
        }
    }
}