public class Tugas1_24 {
    public static void main(String[] args) {
        //input
        int gajiPokok= 5000000; //gaji pak danur
        int tunjanganPerAnak = 100000; //per anak
        double danapensiun = 0.10; //10%

        int anakpakDanur = 4;

        //proses
        double jmlTunjanganAnakPakDanur = tunjanganPerAnak * anakpakDanur;
        double danaPensiunPakDanur = gajiPokok * danapensiun;
        double gajiBersihPakDanur = gajiPokok + jmlTunjanganAnakPakDanur - danaPensiunPakDanur;

        //output
        System.out.println("Gaji Pak Danur: RP."+ gajiPokok);
        System.out.println("tunjangan 4 anak Pak Danur: RP."+ jmlTunjanganAnakPakDanur);
        System.out.println("dana pensiun Pak Danur: RP"+ danaPensiunPakDanur);
        System.out.println("Jadi gaji bersih pak Danur dalam sebulan adalah RP."+ gajiBersihPakDanur);
    }
}
