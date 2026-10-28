public class latihan_02_24 {
    public static void main(String[] args) {
        int tinggi = 50;
        char alfabet = 'A';
        for (int i = 1; i <= tinggi; i ++) {
            for (int j = 1; j <= (tinggi - i); j ++) {
                System.out.print(" ");
            }
            for (int k =1; k < (2 * i - 1) ; k++) {
                System.out.print(alfabet);
                alfabet++;
            }
            System.out.println();
        }
    }
}
