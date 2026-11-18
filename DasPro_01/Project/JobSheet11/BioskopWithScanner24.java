import java.util.Scanner;

public class BioskopWithScanner24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama;
        String[][] penonton = new String[4][2];
        int menu;

        while (true) {
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            // 
            if (!sc.hasNextInt()) {
                System.out.println("Input harus berupa angka!");
                sc.nextLine();
                continue;
            }
            menu = sc.nextInt();
            sc.nextLine();   

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        if (!sc.hasNextInt()) {
                            System.out.println("Nomor baris harus berupa angka. Silakan coba lagi.");
                            sc.nextLine();
                            continue;
                        }
                        baris = sc.nextInt();

                        System.out.print("Masukkan kolom (1-2): ");
                        if (!sc.hasNextInt()) {
                            System.out.println("Nomor kolom harus berupa angka. Silakan coba lagi.");
                            sc.nextLine();
                            continue;
                        }
                        kolom = sc.nextInt();
                        sc.nextLine();   

                          
                        if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[baris - 1].length) {
                            System.out.println("Nomor baris atau kolom tidak tersedia. Silakan masukkan nomor yang valid!");
                            continue;
                        }

                          
                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Peringatan: Kursi baris " + baris + " kolom " + kolom + 
                                               " sudah terisi oleh " + penonton[baris - 1][kolom - 1] + 
                                               ". Silakan pilih kursi lain!");
                            continue;
                        }

                          
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Penonton berhasil ditempatkan di baris " + baris + ", kolom " + kolom + ".");
                        break;
                    }
                    break;

                case 2:
                    System.out.println("\n--- DAFTAR PENONTON BIOSKOP ---");
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.print("Baris " + (i + 1) + ": ");
                        for (int j = 0; j < penonton[i].length; j++) {
                            String namaKursi = (penonton[i][j] != null) ? penonton[i][j] : "***";
                            System.out.print(namaKursi);
                            if (j < penonton[i].length - 1) {
                                System.out.print("\t|\t");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih. Program bioskop selesai.");
                    sc.close();
                    return;

                default:
                    System.out.println("Menu tidak valid. Silakan pilih antara 1, 2, atau 3.");
            }
        }
    }
}
