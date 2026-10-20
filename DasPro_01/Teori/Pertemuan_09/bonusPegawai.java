import java.util.Scanner;

public class bonusPegawai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan jam kerja (negatif untuk berhenti): ");
            int jamKerja = sc.nextInt();
            if (jamKerja < 0) {
                System.out.println("Selesai (pegawai tidak diproses).");
                break;
            }

            System.out.print("Masukkan gaji harian: ");
            double gajiHarian = sc.nextDouble();

            double bonus;
            if (jamKerja > 8) {
                bonus = gajiHarian * 0.20;
            } else {
                bonus = 0;
            }

            System.out.println("Bonus pegawai: " + bonus);
            System.out.println();
        }
        sc.close();
    }
}