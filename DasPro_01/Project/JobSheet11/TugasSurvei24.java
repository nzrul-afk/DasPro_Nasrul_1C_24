import java.util.Scanner;

public class TugasSurvei24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
             
        final int JUMLAH_RESPONDEN = 10;
        final int JUMLAH_PERTANYAAN = 6;

             
        int[][] survei = new int[JUMLAH_RESPONDEN][JUMLAH_PERTANYAAN];

        System.out.println("=================================================");
        System.out.println("        PROGRAM PENGOLAHAN DATA SURVEI          ");
        System.out.println("=================================================");
        System.out.println("Masukkan nilai survei untuk 10 responden (skala 1-5):");
        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            System.out.println("\n--- Responden ke-" + (i + 1) + " ---");
            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                int nilai;
                while (true) {
                    System.out.print("Nilai Pertanyaan " + (j + 1) + " (1-5): ");
                    nilai = sc.nextInt();
                    if (nilai >= 1 && nilai <= 5) {
                        break;
                    }
                    System.out.println("Nilai tidak valid! Masukkan angka antara 1 sampai 5.");
                }
                survei[i][j] = nilai;
            }
        }
        System.out.println("\n==================================================================");
        System.out.println("                     TABEL DATA HASIL SURVEI                      ");
        System.out.println("==================================================================");
        System.out.printf("%-15s", "Responden");
        for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
            System.out.printf("%-8s", "P" + (j + 1));
        }
        System.out.printf("%-12s\n", "Rata-rata");
        System.out.println("------------------------------------------------------------------");             
        double totalKeseluruhan = 0;
        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            System.out.printf("%-15s", "Responden " + (i + 1));
            double totalPerResponden = 0;
            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                System.out.printf("%-8d", survei[i][j]);
                totalPerResponden += survei[i][j];
                totalKeseluruhan += survei[i][j];
            }
            double rataResponden = totalPerResponden / JUMLAH_PERTANYAAN;
            System.out.printf("%-12.2f\n", rataResponden);
        }
        System.out.println("------------------------------------------------------------------");           
        System.out.println("\n=================================================");
        System.out.println("         RATA-RATA SETIAP PERTANYAAN             ");
        System.out.println("=================================================");
        for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
            double totalPerPertanyaan = 0;
            for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
                totalPerPertanyaan += survei[i][j];
            }
            double rataPertanyaan = totalPerPertanyaan / JUMLAH_RESPONDEN;
            System.out.printf("Pertanyaan %d: %.2f\n", (j + 1), rataPertanyaan);
        }        
        double rataKeseluruhan = totalKeseluruhan / (JUMLAH_RESPONDEN * JUMLAH_PERTANYAAN);
        System.out.println("\n=================================================");
        System.out.printf("Rata-rata Keseluruhan Survei: %.2f\n", rataKeseluruhan);
        System.out.println("=================================================");
        sc.close();
    }
}
