import java.util.Scanner;
public class lathian_04_24 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("masukan produk yang anda punya : ");
    int jumPro =  sc.nextInt();
    System.out.print("masukan total hari setiap produk : ");
    int jumHari =  sc.nextInt();
    int totSemPro = 0;
    int produk = 1;
    while (produk <= jumPro + 1) {
        int totPro = 0;
        System.out.println("Produk " + produk);
        for (int hari= 1; hari <= jumHari;hari++) {
            System.out.print("Hari " + hari + ": ");
            totPro += sc.nextInt();
        }
        System.out.println("Total Produk "+ produk + " = " + totPro);
        totSemPro += totPro;
        produk++;
    }
    System.out.println("Total seemua produk = " + totSemPro);
    sc.close();
    }

}
