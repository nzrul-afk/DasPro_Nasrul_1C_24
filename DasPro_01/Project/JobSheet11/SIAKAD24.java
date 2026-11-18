import java.util.Scanner;

public class SIAKAD24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();

            
        int[][] nilai = new int[jumlahMahasiswa][jumlahMataKuliah];

            
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("\nInput nilai mahasiswa ke-" + (i + 1) + ":");
            double totalPerSiswa = 0;     

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            double rataSiswa = totalPerSiswa / nilai[i].length;
            System.out.printf("Nilai rata-rata mahasiswa ke-%d: %.2f\n", (i + 1), rataSiswa);
        }

            
        System.out.println("\n========================================");
        System.out.println("Rata-rata nilai setiap mata kuliah:");

        for (int j = 0; j < nilai[0].length; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < nilai.length; i++) {
                totalPerMatkul += nilai[i][j];
            }

            double rataMatkul = totalPerMatkul / nilai.length;
            System.out.printf("Mata kuliah %d: %.2f\n", (j + 1), rataMatkul);
        }

        sc.close();
    }
}
