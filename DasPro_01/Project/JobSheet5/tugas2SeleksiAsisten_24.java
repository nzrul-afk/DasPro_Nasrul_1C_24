import java.util.Scanner;

public class tugas2SeleksiAsisten_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;

        System.out.print("Apakah mahasiswa berstatus aktif? (true/false): ");
        boolean aktif = sc.nextBoolean();
        System.out.print("Apakah mahasiswa sedang mendapat sanksi akademik? (true/false): ");
        boolean sanksi = sc.nextBoolean();
        System.out.print("Masukkan nilai Dasar Pemrograman: ");
        int nilaiDasPro = sc.nextInt();
        System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (true/false): ");
        boolean sertifikat = sc.nextBoolean();

        if (aktif && !sanksi) {
            if (nilaiDasPro >= 80 || sertifikat) {
                System.out.print("Masukkan nilai wawancara: ");
                int nilaiWawancara = sc.nextInt();

                if (nilaiWawancara >= 75) {
                    pesan = "Selamat! Mahasiswa diterima sebagai asisten praktikum";
                } else {
                    pesan = "Gagal! Nilai wawancara kurang dari 75";
                }
            } else {
                pesan = "Gagal! Nilai Dasar Pemrograman kurang dari 80 dan tidak memiliki sertifikat kompetensi pemrograman";
            }
        } else {
            pesan = "Gagal! Mahasiswa tidak berstatus aktif atau sedang mendapat sanksi akademik";
        }

        System.out.println(pesan);
    }
}