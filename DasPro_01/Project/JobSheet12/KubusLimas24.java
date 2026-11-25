import java.util.Scanner;
public class KubusLimas24 {
    static double luasPersegi(int s) {
        return s*s;
    }
    static double volumeKubus(int s){
        return s*s*s;
    }
    static double luasPermukaanKubus(int s) {
        return 6*(s * s);
    }
    static double volumeLimasPersegi(int s,int t){
        return s*s*t/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("1. HITUNG LUAS PERSEGI\n2. HITUNG VOLUME KUBUS\n3. HITUNG LUAS PERMUKAAN KUBUS\n4. HITUNG VOLUME LIMAS PERSEGI\n5.EXIT\nMASUKAN ANGKA PILIHAN:");
            pilihan = sc.nextInt();
            switch (pilihan) {
                case (1):
                    System.out.println("LUAS PERSEGI");
                    System.out.println("masukan angka: ");
                    int angka = sc.nextInt();
                    System.out.println("hasil: "+ luasPersegi(angka));
                    break;
                case (2):
                    System.out.println("VOLUME KUBUS");
                    System.out.println("masukan angka: ");
                    int angka1 = sc.nextInt();
                    System.out.println("hasil: "+ volumeKubus(angka1));;
                    break;
                case (3):
                    System.out.println("LUAS PERMUKAAN KUBUS");
                    System.out.println("masukan angka: ");
                    int angka2 = sc.nextInt();
                    System.out.println("hasil: "+ luasPermukaanKubus(angka2));;
                    break;
                case (4):
                    System.out.println("VOLUME LIMAS PERSEGI");
                    System.out.println("masukan sisi: ");
                    int angka3 = sc.nextInt();
                    System.out.println("masukan tinggi: ");
                    int angka4 = sc.nextInt();
                    System.out.println("hasil: "+ volumeLimasPersegi(angka3, angka4));
                    break;
                case (5):
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("angka tidak valid");
            }
        } while (pilihan != 5);
    }   
}
