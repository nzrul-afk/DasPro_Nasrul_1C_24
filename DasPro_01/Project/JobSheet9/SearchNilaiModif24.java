import java.util.Scanner;

public class SearchNilaiModif24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya elemen array: ");
        int jml = input.nextInt();

        int[] nilai = new int[jml];
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari (key): ");
        int key = input.nextInt();

        boolean ditemukan = false;
        int indeks = -1;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                ditemukan = true;
                indeks = i;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + indeks);
        } else {
            System.out.println("Pencarian Gagal: Nilai " + key + " tidak ditemukan di dalam seluruh " + nilai.length + " data array.");
        }

        input.close();
    }
}
