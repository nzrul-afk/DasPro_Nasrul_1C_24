import java.util.Scanner;

public class PemilihanIf_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();
        if (uktLunas) {
            System.out.println("Selamat! Anda dapat mencetak KRS");
            System.out.println("Silakan menuju halaman pencetakan KRS");
        }
    }
}
