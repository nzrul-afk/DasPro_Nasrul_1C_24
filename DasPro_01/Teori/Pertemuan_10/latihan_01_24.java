public class latihan_01_24 {
    public static void main(String[] arg) {
        for (int i = 0; i < 10; i++) {       
            for (int j = 9; j >= i ; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("\n\n");
        for (int i = 0; i < 10; i++) {       
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}