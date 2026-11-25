import java.util.Scanner;
public class RekapLaundry24 {
    static Scanner sc = new Scanner(System.in);

    static int[][] inputData() {
        int[][] dataLaundry = new int[4][6];
        for (int i = 0; i < dataLaundry.length; i++) {
            for (int j = 0; j < dataLaundry[i].length; j++) {
                System.out.print("Layanan ke-"+( i + 1)+": Hari ke-"+(j+1));
                dataLaundry[i][j] = sc.nextInt();
            }
        }
        return dataLaundry;
    }
    static void nampilinData(int[][] data) {
        System.out.println("          1  2  3  4  5  6 ");
        for (int i = 0; i < data.length; i++) {
            System.out.print("layanan "+(i + 1));
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(" "+data[i][j] + " ");
            }
            System.out.print("\n");

        }
    }
    static int totalPerLayanan(int[][] data, int idxLayanan) {
        int total = 0;
        for (int i = 0; i < data[idxLayanan].length; i++) {
            total += data[idxLayanan][i];
        }
        return total;
    }
    static String layananTersibuk(int[][] data) {
        String[] layanan = {"Cuci Kering", "Cuci Setrika", "Setrika Saja", "Express"};
        int totalTertinggi = 0;
        int indexnya = 0;
        for (int i = 0; i < data.length; i++) {
            int total = 0 ;
            for (int j = 0; j < data[i].length;j++) {
                total += data[i][j];
            }
            if (total > totalTertinggi) {
                totalTertinggi = total;
                indexnya = i;
            }
        }
        return "LAYANAN TERSIBUK: "+ layanan[indexnya] + " DENGAN TOTAL BERAT: " + totalTertinggi;
    }
    static int hariTersibuk(int[][] data) {
        int totalTertinggi = 0 ;
        int harinya=0;
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
        int[] harga = {6000,8000,5000,12000};
        for (int i = 0; i < data.length; i++) {
            System.out.print("layanan "+(i + 1) + ": ");
            int total = 0;
            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
            }
            System.out.println(total * harga[i]);
        }
    }
    public static void main(String[] args) {
        System.out.println("Masukin data");
        int[][] data = inputData();
        nampilinData(data);
        System.out.println("Check total layanan: ");
        int layananke = sc.nextInt();
        System.out.println("TOTAL dari layanan ke-"+layananke +" adalah "+totalPerLayanan(data, (layananke -1)));
        System.out.println(layananTersibuk(data));
        System.out.println("HARI TERSIBUK HARI KE-" + (hariTersibuk(data) + 1));
        System.out.println("PENDAPATAN");
        nampilinPendapatan(data);


    }


}
