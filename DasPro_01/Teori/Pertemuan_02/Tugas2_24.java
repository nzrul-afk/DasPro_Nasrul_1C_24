public class Tugas2_24 {
    public static void main(String[] args) {

        //input data
        double phi = Math.PI;
        int lebarTanah = 30;
        int panjangTanah = 100;
        double diameterKolamIkan = 5;
        int sisiTamanBunga = 2;
        
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
