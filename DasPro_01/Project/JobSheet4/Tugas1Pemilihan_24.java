import java.util.Scanner;

public class Tugas1Pemilihan_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();
        String pesan = uktLunas
            ? "Selamat! Anda dapat mencetak KRS\nSilakan menuju halaman pencetakan KRS"
            : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";

        System.out.println(pesan);
    }
}
