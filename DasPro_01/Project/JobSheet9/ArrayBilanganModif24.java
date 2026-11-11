public class ArrayBilanganModif24 {
    public static void main(String[] args) {
        // Inisialisasi sekaligus saat deklarasi
        int[] bil = {5, 13, -7, 17};

        // Menampilkan dengan modifikasi perkalian double
        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i] + ", double = " + (bil[i] * 2));
        }
    }
}
