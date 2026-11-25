
import java.util.Scanner;

public class HitungBalok24 {
    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }

    static int hitungLuasPermukaanBalok(int p, int l, int t) {
        int luasPermukaan = 2 * (hitungLuas(p, l) + hitungLuas(p, t) + hitungLuas(l, t));
        return luasPermukaan;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol, lp;

        System.out.println("Masukkan panjang");
        p = input.nextInt();
        System.out.println("Masukkan lebar");
        l = input.nextInt();
        System.out.println("Masukkan tinggi");
        t = input.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah " + L);

        vol = hitungVolume(t, p, l);
        System.out.println("Volume Balok adalah " + vol);

        lp = hitungLuasPermukaanBalok(p, l, t);
        System.out.println("Luas Permukaan Balok adalah " + lp);

        System.out.println("\n--- Perhitungan 3 Balok Berbeda ---");
        int[][] ukuranBalok = {{4, 3, 5}, {6, 2, 4}, {10, 5, 3}};
        for (int i = 0; i < ukuranBalok.length; i++) {
            int bp = ukuranBalok[i][0];
            int bl = ukuranBalok[i][1];
            int bt = ukuranBalok[i][2];
            System.out.println("Balok " + (i + 1) + " (" + bp + "x" + bl + "x" + bt + ") -> Luas Permukaan: "
                    + hitungLuasPermukaanBalok(bp, bl, bt) + ", Volume: " + hitungVolume(bt, bp, bl));
        }

        input.close();
    }
}
