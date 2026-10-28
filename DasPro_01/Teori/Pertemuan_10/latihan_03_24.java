public class latihan_03_24 {
    public static void main(String[] args) {
        int keberapa = 5;
        int total = 1;
        String penjumlahan= "1";
        System.out.println("n = 1 -> jumlah kuadrat = " + 1 + " = 1");
        for (int n = 2; n < keberapa + 1; n++){
            System.out.print("n = " + n);
            
            int hasil = 0 + (n*n);
            total += hasil;
            penjumlahan += " + " + hasil;
            System.out.print(" -> jumlah kuadrat = " + penjumlahan + " = " + total);
            System.out.println();
        }
    }
}
