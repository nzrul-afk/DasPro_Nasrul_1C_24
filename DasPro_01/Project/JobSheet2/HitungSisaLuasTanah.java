import java.util.Scanner;
public class HitungSisaLuasTanah {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double phi = Math.PI;
        //input data
        System.out.println("Masukan luas tanah");
        int lebarTanah = scan.nextInt();
        System.out.println("Masukan panjang tanah");
        int panjangTanah = scan.nextInt();
        System.out.println("masukan diameter kolam ikan");
        double diameterKolamIkan = scan.nextDouble();
        System.out.println("masukan panjang sisi Taman Bunga");
        int sisiTamanBunga = scan.nextInt();
        
        //proses data        

        double luasTanah = lebarTanah * panjangTanah;
        double jariJariKolamIkan = diameterKolamIkan / 2;
        double luasKolamIkan = phi * jariJariKolamIkan * jariJariKolamIkan;
    
        double luasTamanBunga = sisiTamanBunga * sisiTamanBunga;

        double sisaluasTanah = luasTanah - luasKolamIkan - luasTamanBunga;

        //output data
        System.out.println("Luas total Tanah: " + luasTanah + "m2");
        System.out.println("Luas kolam ikan: "+ luasKolamIkan + "m2");
        System.out.println("Luas taman bunga: "+ luasTamanBunga + "m2");
        System.out.println("Sisa luas Tanah: "+ sisaluasTanah + "m2");
    }
    
}