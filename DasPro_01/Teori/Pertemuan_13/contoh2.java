import java.util.Scanner;
public class contoh2 {
    public static void main(String[] args) {
    String[] kota = {"Tokyo", "Osaka", "Sapporo",
                    "Fukuoka", "Naha"};
    double[][] suhu = new double[5][7];  // baris = kota, kolom = hari
    Scanner sc = new Scanner(System.in);

    double suhutertinggiseluruhnyaa = 0;
    double suhuterrendahseluruhnyaa = 99999;
    String suhutertinggiseluruhnya = "";
    String suhuterrendahseluruhnya = "";

    for (int i = 0; i < suhu.length; i++) {
        double suhuTertinggii = 0;
        String suhuTertinggi = "";
        double suhuTerendahh = 999999999;
        String suhuTerendah = "";
        for (int j = 0; j < suhu[i].length; j++) {
            System.out.print(kota[i] + " hari " + (j + 1) + ": ");
            suhu[i][j] = sc.nextDouble();

            if (suhu[i][j] > suhuTertinggii) {
                suhuTertinggii=suhu[i][j];
                suhuTertinggi = "suhu tertinggi di "+ kota[i] +" hari ke-"+ j + " yaitu " + suhu[i][j];
            }
            if (suhu[i][j] < suhuTerendahh) {
                suhuTerendahh = suhu[i][j];
                suhuTerendah = "suhu terendah di "+ kota[i] +" hari ke-"+ j + " yaitu " + suhu[i][j];
            }
        }
        if (suhuTertinggii > suhutertinggiseluruhnyaa) {
            suhutertinggiseluruhnyaa = suhuTertinggii;
            suhutertinggiseluruhnya = suhuTertinggi;
        } 
        if (suhuTerendahh < suhuterrendahseluruhnyaa) {
            suhuterrendahseluruhnyaa = suhuTerendahh;
            suhuterrendahseluruhnya = suhuTerendah;
        } 
        System.out.println(suhuTertinggi);
        System.out.println( suhuTerendah);
}
    System.out.println("seluruh kota " + suhutertinggiseluruhnya);
    System.out.println("seluruh kota "+suhuterrendahseluruhnya);

}
}
