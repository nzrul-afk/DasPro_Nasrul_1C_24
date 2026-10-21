import java.util.Scanner;
public class jamBelajar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalJam = 0;
        int hari = 1;

        while (hari <= 7) {
            int jamBelajar;
            do {
                System.out.print("Masukkan jam belajar hari ke-" + hari + ": ");
                jamBelajar = sc.nextInt();

                if (jamBelajar > 10) {
                    System.out.println("Input tidak valid!");
                }
            } while (jamBelajar > 10);

            totalJam = totalJam + jamBelajar;
            hari = hari + 1;
        }

        System.out.println("Total jam belajar selama seminggu: " + totalJam + " jam");
        sc.close();
    }
}