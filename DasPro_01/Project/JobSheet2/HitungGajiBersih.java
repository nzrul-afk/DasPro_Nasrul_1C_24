import java.util.Scanner;

public class HitungGajiBersih {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double danapensiun = 0.10; //10%
        //input
        System.out.print("Masukan Gaji Pokoknya Rp.");
        int gajiPokok= scan.nextInt(); //gaji pak danur
        System.out.println("Masukan tunjangan per anak Rp.");
        int tunjanganPerAnak = scan.nextInt(); //per anak
        System.out.println("Masukan Total anak");
        int anakpakDanur = scan.nextInt();
        //proses
        double jmlTunjanganAnakPakDanur =  tunjanganPerAnak * anakpakDanur;
        double danaPensiunPakDanur = gajiPokok * danapensiun;
        double gajiBersihPakDanur =  gajiPokok + jmlTunjanganAnakPakDanur - danaPensiunPakDanur;

        //output
        System.out.println("Gaji Pak Danur: RP."+ gajiPokok);
        System.out.println("tunjangan 4 anak Pak Danur: RP."+ jmlTunjanganAnakPakDanur);
        System.out.println("dana pensiun Pak Danur: RP"+ danaPensiunPakDanur);
        System.out.println("Jadi gaji bersih pak Danur dalam sebulan adalah RP."+ gajiBersihPakDanur);
    }
}
