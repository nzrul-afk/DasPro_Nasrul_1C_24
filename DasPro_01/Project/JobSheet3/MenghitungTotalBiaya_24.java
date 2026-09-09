import java.util.Scanner;
public class MenghitungTotalBiaya_24 {
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     double harga;
     double potongan;
     double jml_bayar;
     double diskon=0.15;
     
     harga = scn.nextInt();

     potongan= diskon * harga;
     jml_bayar = harga-potongan;
     System.out.println("potongan harga: "+ potongan);    
     System.out.println("Jumlah yang harus anda bayar adalah: "+ jml_bayar);
    }
}