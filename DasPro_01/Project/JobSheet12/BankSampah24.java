import java.util.Scanner;
public class BankSampah24 {
    static Scanner sc = new Scanner(System.in);
    static Double[] inputStoran(int n) {
        Double[] setoranArray = new Double[n];
        for (int i =0; i < n; i++) {
            System.out.println("MASUKAN SETORAN UNTUK NASABAH KE-" + (i + 1));
            setoranArray[i]= sc.nextDouble();
        }
        return setoranArray;
    }
    static void tampilStoran(Double[] array) {
        for (int i =0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    static Double TotalStoran(Double[] array) {
        double total = 0;
        for (int i =0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }
    static Double[] hitungSaldo(Double[] berat, int harga) {
        Double[] saldoArray = new Double[berat.length];
        for (int i = 0; i < berat.length;i++) {
            saldoArray[i] = berat[i] * harga;
        }
        return saldoArray;
    }
    static Integer nasabahTerbanyak(Double[] storan) {
        double terbanyak = 0;
        int indexNasabah= 0 ;
        for (int i = 0; i < storan.length;i++) {
            if (storan[i] > terbanyak) {
                terbanyak = storan[i];
                indexNasabah = i + 1;
            }
        }
        return indexNasabah;
    }

    public static void main(String[] args) {
        System.out.println("MASUKAN TOTAL PENASABAH");
        int jumlahNasabah = sc.nextInt();
        Double[] setoran = inputStoran(jumlahNasabah);
        tampilStoran(setoran);
        System.out.println("TOTAL NASABAH: "+TotalStoran(setoran));
        for (double penasabah : hitungSaldo(setoran, 3000)) {
            System.out.println("SALDO PENASABAH: " + penasabah );
        }
        
        System.out.println("NASABAH TERBANYAK DIPEGANG OLEH INDEX NASABAH KE "+nasabahTerbanyak(setoran));
        }
        }
