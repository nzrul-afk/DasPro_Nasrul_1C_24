import java.util.Scanner;

public class TugasParkir_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== SISTEM PARKIR ===");
        System.out.print("Masukkan jenis kendaraan (1=Motor, 2=Mobil): ");
        int jenis = sc.nextInt();
        System.out.print("Masukkan durasi parkir (jam): ");
        int durasi = sc.nextInt();
        int tarif;
        if (jenis == 1) {
            if (durasi <= 1) {
                tarif = 2000;
            } else {
                tarif = 2000 + (durasi - 1) * 1000;
            }
            System.out.println("Jenis Kendaraan: Motor");
            System.out.println("Durasi Parkir: " + durasi + " jam");
            System.out.println("Total Biaya Parkir: Rp" + tarif);
        } else if (jenis == 2) {
            if (durasi <= 1) {
                tarif = 5000;
            } else {
                tarif = 5000 + (durasi - 1) * 2000;
            }
            System.out.println("Jenis Kendaraan: Mobil");
            System.out.println("Durasi Parkir: " + durasi + " jam");
            System.out.println("Total Biaya Parkir: Rp" + tarif);
        } else {
            System.out.println("Jenis kendaraan tidak valid");
        }
    }
}
