import java.util.Scanner;

public class MenghitungLuasPersegiPanjang_24 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int panjang;
        int lebar;
        int luas;

        panjang = scn.nextInt();
        lebar = scn.nextInt();
        luas = panjang * lebar;

        System.out.println("Luas persegi adalah: "+ luas);
    }
}