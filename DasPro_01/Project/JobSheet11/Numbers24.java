import java.util.Arrays;

public class Numbers24 {
    public static void main(String[] args) {
           
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

           
        System.out.println("--- Menampilkan setiap baris dengan Arrays.toString() ---");
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }      
        System.out.println("\n--- Hasil Arrays.toString(myNumbers) ---");
        System.out.println(Arrays.toString(myNumbers));

           
        System.out.println("\n--- Hasil Arrays.deepToString(myNumbers) ---");
        System.out.println(Arrays.deepToString(myNumbers));

           
        System.out.println("\n--- Panjang Setiap Baris ---");
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1) + ": " + myNumbers[i].length);
        }           
        System.out.println("\n--- Setelah myNumbers[0] = new int[7] ---");
        myNumbers[0] = new int[7];
        System.out.println("myNumbers.length    : " + myNumbers.length);
        System.out.println("myNumbers[0].length : " + myNumbers[0].length);
        System.out.println("Isi myNumbers[0]    : " + Arrays.toString(myNumbers[0]));

           
        System.out.println("\n--- Pertanyaan Diskusi: Pengujian Referensi Array ---");
        int[][] salinan = myNumbers;
        salinan[0][0] = 99;
        System.out.println("Nilai salinan[0][0]  : " + salinan[0][0]);
        System.out.println("Nilai myNumbers[0][0]: " + myNumbers[0][0]);
    }
}
