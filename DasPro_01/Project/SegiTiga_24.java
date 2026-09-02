import java.util.Scanner;

public class SegiTiga_24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //input
        System.out.println("Masukan alas: ");
        int alas = scan.nextInt();
        System.out.println("Masukan tinggi: ");
        int tinggi = scan.nextInt();

        //proses
        float luas = alas * tinggi / 2;
        System.out.println("Luas segitiga: "+ luas);
    }
}