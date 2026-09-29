import java.util.Scanner;
public class latihan1_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukan bilangan pertama");
        int bil1 = sc.nextInt() ;
        System.out.println("masukan bilangan kedua");
        int bil2 = sc.nextInt() ;
        System.out.println("masukan bilangan ketiga");
        int bil3 = sc.nextInt() ;
        int terbesar = bil1;
        
        if (bil1 > bil2) {
            terbesar=bil1;
            if (terbesar < bil3) {
                terbesar=bil3;
            }

        }
        else if (bil1 < bil2) {
            terbesar=bil2;
            if (terbesar < bil3) {
                terbesar = bil3;
            }
        }

        System.out.println("bilangan terbesar: " + terbesar);
    }
}
