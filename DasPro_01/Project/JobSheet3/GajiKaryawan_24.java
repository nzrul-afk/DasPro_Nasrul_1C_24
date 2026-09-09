import java.util.Scanner;

public class GajiKaryawan_24 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int gajiPokok;
        double bonus, totGaji;
        double tunjtransp=600000;
        double tunjMkn=400000;

        gajiPokok = scn.nextInt();

        bonus = 0.05 * gajiPokok;
        totGaji = gajiPokok+tunjtransp+tunjMkn+bonus-0.1*gajiPokok;

        System.out.println("Bonus bulanan anda adalah Rp. "+ bonus);
        System.out.println("Gaji yang diterima adalah Rp. "+ totGaji);



    }
}
