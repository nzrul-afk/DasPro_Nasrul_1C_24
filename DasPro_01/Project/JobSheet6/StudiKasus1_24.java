import java.util.Scanner;
public class  StudiKasus1_24 {
    public static void main(String[] args) {
        int hargaPerCup=1800;
        int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;
        Scanner scn = new Scanner(System.in);
        jumlahCup = scn.nextInt();
        uangBayar = scn.nextInt();

        totalHarga=jumlahCup*hargaPerCup;
        diskon=0;

        if (totalHarga >= 100000) {
            diskon=totalHarga*10/100;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Total Harga anda adalah: " + totalHarga);
        System.out.println("Diskon yang diperoleh: " + diskon);
        System.out.println("Nominal yang harus dibayar: "+totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("uang kembalian: "+ kembalian);
        }
        kurang = totalBayar - uangBayar;
        System.out.println("Uang tidak cukup kurang RP" + kurang);
        scn.close();

    }
}