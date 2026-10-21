import java.util.Scanner;

public class TugasAntrean_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== MESIN ANTREAN AKADEMIK ===");
        System.out.println("1. Pendaftaran Mahasiswa Baru");
        System.out.println("2. Pembayaran UKT");
        System.out.println("3. Pengambilan Ijazah");
        System.out.println("4. Konsultasi Akademik");
        System.out.print("Masukkan kode layanan (1-4): ");
        int kode = sc.nextInt();
        switch (kode) {
            case 1:
                System.out.println("Anda memilih: Pendaftaran Mahasiswa Baru");
                System.out.println("Silakan menuju loket 1");
                break;
            case 2:
                System.out.println("Anda memilih: Pembayaran UKT");
                System.out.println("Silakan menuju loket 2");
                break;
            case 3:
                System.out.println("Anda memilih: Pengambilan Ijazah");
                System.out.println("Silakan menuju loket 3");
                break;
            case 4:
                System.out.println("Anda memilih: Konsultasi Akademik");
                System.out.println("Silakan menuju loket 4");
                break;
            default:
                System.out.println("Kode layanan tidak tersedia");
                break;
        }
    }
}
