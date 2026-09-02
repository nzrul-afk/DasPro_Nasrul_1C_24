public class Bank_24 {
    public static void main(String[] args) {
        //input
        int jml_tabungan_awal = 5000000;
        int lama_menabung = 5;
        double prosentase_bunga = 0.02;
        //proses
        double bunga = lama_menabung * prosentase_bunga * jml_tabungan_awal;
        double jml_tabungan_akhir= bunga + jml_tabungan_awal;
        //output
        System.out.println("bunga adalah "+ bunga);
        System.out.println("Jumlah tabungan akhir anda adalah "+jml_tabungan_akhir) ;
    }
}
