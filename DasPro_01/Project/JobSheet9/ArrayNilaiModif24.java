import java.util.Scanner;

public class ArrayNilaiModif24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];
        int jmlLulus = 0;
        int jmlTidakLulus = 0;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
            if (nilaiAkhir[i] > 70) {
                jmlLulus++;
            } else {
                jmlTidakLulus++;
            }
        }

        System.out.println("\n--- Daftar Mahasiswa yang LULUS ---");
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (LULUS)");
            }
        }

        System.out.println("\n==================================");
        System.out.println("Jumlah mahasiswa LULUS       : " + jmlLulus);
        System.out.println("Jumlah mahasiswa TIDAK LULUS : " + jmlTidakLulus);

        input.close();
    }
}
