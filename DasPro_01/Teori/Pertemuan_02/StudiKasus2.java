import java.util.Scanner;

public class StudiKasus2 {
    public static void main(String[] args) {
        double  prosentase_bunga = 0.02;
        Scanner scan = new Scanner(System.in);
        System.out.println("masukan jumlah tabungan awal");
        int jml_tabungan_awal = scan.nextInt();
        System.out.println("masukan lama menabung");
        int lama_nabung = scan.nextInt();
        double bunga = lama_nabung * prosentase_bunga * jml_tabungan_awal;
        double tabungan_akhir = jml_tabungan_awal + bunga;
        System.out.println("total bunga = "+ bunga);
        System.err.println("Jumlah tabungan akhir = "+ tabungan_akhir);
    }
}
