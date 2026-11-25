import java.util.Scanner;

public class RekapLaundry24 {
    static Scanner sc = new Scanner(System.in);

    static String[] layanan = {"Cuci Kering", "Cuci Setrika", "Setrika Saja", "Express"};
    static int[] harga = {6000, 8000, 5000, 12000};
    static String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};

    static int[][] inputData() {
        int[][] dataLaundry = new int[layanan.length][hari.length];
        for (int i = 0; i < dataLaundry.length; i++) {
            for (int j = 0; j < dataLaundry[i].length; j++) {
                System.out.print(layanan[i] + " - " + hari[j] + " (kg): ");
                dataLaundry[i][j] = sc.nextInt();
            }
        }
        return dataLaundry;
    }

    static void nampilinData(int[][] data) {
        System.out.printf("%-14s", "Layanan");
        for (int j = 0; j < hari.length; j++) {
            System.out.printf("%8s", hari[j]);
        }
        System.out.println();
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-14s", layanan[i]);
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%8d", data[i][j]);
            }
            System.out.println();
        }
    }

    static int totalPerLayanan(int[][] data, int idxLayanan) {
        int total = 0;
        for (int i = 0; i < data[idxLayanan].length; i++) {
            total += data[idxLayanan][i];
        }
        return total;
    }
    static void layananTersibuk(int[][] data) {
        int indexnya = 0;
        int totalTertinggi = totalPerLayanan(data, 0);
        for (int i = 1; i < data.length; i++) {
            int total = totalPerLayanan(data, i);
            if (total > totalTertinggi) {
                totalTertinggi = total;
                indexnya = i;
            }
        }
        System.out.println("Layanan tersibuk: " + layanan[indexnya] + " dengan total " + totalTertinggi + " kg");
    }

    static int hariTersibuk(int[][] data) {
        int totalTertinggi = 0;
        int harinya = 0;
        for (int i = 0; i < data[0].length; i++) {
            int total = 0;
            for (int j = 0; j < data.length; j++) {
                total += data[j][i];
            }
            if (total > totalTertinggi) {
                totalTertinggi = total;
                harinya = i;
            }
        }
        return harinya;
    }
    static void nampilinPendapatan(int[][] data) {
        int totalSemua = 0;
        for (int i = 0; i < data.length; i++) {
            int pendapatan = totalPerLayanan(data, i) * harga[i];
            System.out.println(layanan[i] + ": Rp" + pendapatan);
            totalSemua += pendapatan;
        }
        System.out.println("Total pendapatan 6 hari: Rp" + totalSemua);
    }

    public static void main(String[] args) {
        System.out.println("=== INPUT DATA BERAT CUCIAN ===");
        int[][] data = inputData();

        System.out.println("\n=== REKAP BERAT CUCIAN (kg) ===");
        nampilinData(data);

        System.out.print("\nCek total layanan ke- (1-" + data.length + "): ");
        int layananke = sc.nextInt();
        if (layananke >= 1 && layananke <= data.length) {
            System.out.println("Total " + layanan[layananke - 1] + " selama 6 hari: "
                    + totalPerLayanan(data, layananke - 1) + " kg");
        } else {
            System.out.println("Nomor layanan tidak valid");
        }

        System.out.println();
        layananTersibuk(data);
        System.out.println("Hari tersibuk: " + hari[hariTersibuk(data)]);

        System.out.println("\n=== PENDAPATAN ===");
        nampilinPendapatan(data);
    }
}
