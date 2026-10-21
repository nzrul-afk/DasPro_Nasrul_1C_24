import java.util.Scanner;

public class StudiKasus1{
    public static void main (String[] args) {
        Scanner scan  = new Scanner(System.in);

        int panjang = scan.nextInt();
        int lebar = scan.nextInt();
        int keliling = 2 * (panjang + lebar);
        System.out.print(keliling); 
    }
}