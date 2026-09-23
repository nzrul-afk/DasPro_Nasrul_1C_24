import java.util.Scanner;

public class Latihan02_24 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Masukkan kode layanan (1-4): ");
        int kode = scn.nextInt();

        String layanan;
        String loket;

        switch (kode) {
            case 1:
                layanan = "Legalisir Ijazah";
                loket = "Loket A";
                break;
            case 2:
                layanan = "Surat Keterangan Aktif Kuliah";
                loket = "Loket B";
                break;
            case 3:
                layanan = "Pembayaran UKT";
                loket = "Loket C";
                break;
            case 4:
                layanan = "Pengajuan Cuti Akademik";
                loket = "Loket D";
                break;
            default:
                layanan = "Tidak Dikenal";
                loket = "-";
                System.out.println("Kode layanan tidak valid!");
                scn.close();
                return;
        }

        System.out.println("Layanan: " + layanan);
        System.out.println("Loket Tujuan: " + loket);

        scn.close();
    }
}