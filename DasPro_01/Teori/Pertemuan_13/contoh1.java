import java.util.Arrays;
public class contoh1 {
    public static void main(String[] args) {
    int[][] penjualan = {
    {2, 8, 6},    // Dieng
    {7, 3, 6},    // Soehat
    {4, 6, 5}     // Sengkaling
    };
    // penjualan[0][1] = 8 → Dieng, Komik
    System.out.println("  Cabang/Kategori   |  Novel | Komik | Ensiklopedia | total");
    System.out.println("       Dieng        |    " + penjualan[0][0]  + "   |   "+ penjualan[0][1]  + "   |      " + penjualan[0][2]  + "       |   " + Arrays.stream(penjualan[0]).sum() );
    System.out.println("       Soehat       |    "  + penjualan[1][0]  + "   |   "+ penjualan[1][1]  + "   |      " + penjualan[1][2]  + "       |   " + Arrays.stream(penjualan[1]).sum() );
    System.out.println("     Sengkaling     |    " + penjualan[2][0]  + "   |   "+ penjualan[2][1]  + "   |      " + penjualan[2][2]  + "      |   " + Arrays.stream(penjualan[2]).sum() );


}
}