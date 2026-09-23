import java.util.Scanner;

public class Tugas2Pemilihan_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah SKS: ");
        int sks = sc.nextInt();
        if (sks > 24) {
            System.out.println("SKS melebihi batas maksimal");
        } else if (sks < 1) {
            System.out.println("SKS tidak valid");
        } else {
            System.out.println("SKS valid, jumlah SKS: " + sks);
        }
    }
}
