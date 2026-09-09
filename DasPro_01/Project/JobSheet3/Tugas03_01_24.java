import java.util.Scanner;

public class Tugas03_01_24 {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();
        double persentaseBunga = 0.02;
        int sisaHarga = x - y;
        double bunga = sisaHarga * persentaseBunga;
        double cicilanPerBulan = sisaHarga / z;
        double cicilanPerbulandenganBunga = cicilanPerBulan + bunga;
        System.out.println("total bunga: " + bunga);
        System.out.println("cicilan yang harus dibayar setiap bulannya: Rp."+ cicilanPerbulandenganBunga);
    }
}
