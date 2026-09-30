import java.util.Scanner;

public class tugas1DiskonTokoBuku_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hari;
        String jenisBuku;
        int jumlahBuku;
        int diskon = 0;

        System.out.print("Masukkan hari: ");
        hari = sc.nextLine().trim();
        System.out.print("Masukkan jenis buku: ");
        jenisBuku = sc.nextLine().trim();
        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = sc.nextInt();

        if (hari.equalsIgnoreCase("rabu")) {
            if (jenisBuku.equalsIgnoreCase("kamus")) {
                diskon += 10;
                if (jumlahBuku > 2) {
                    diskon += 2;
                }
            } else if (jenisBuku.equalsIgnoreCase("novel")) {
                diskon += 7;
                if (jumlahBuku > 3) {
                    diskon += 2;
                } else {
                    diskon += 1;
                }
            } else {
                if (jumlahBuku > 3) {
                    diskon += 5;
                }
            }
            System.out.println("Diskon: " + diskon);
        } else {
            System.out.println("Diskon terdapat hanya di hari rabu");
        }
    }
}