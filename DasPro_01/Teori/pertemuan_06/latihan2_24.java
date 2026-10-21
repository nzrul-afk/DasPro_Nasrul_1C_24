import java.util.Scanner;
public class latihan2_24 {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        System.out.println("masukan hari pembelian: ");
        String hari=sc.nextLine();


        if (hari.toLowerCase().equals("rabu")) {
            System.out.println("masukan jenis buku yang dibeli: ");
            String jenisBuku=sc.nextLine();
            System.out.println("jumlah buku yang dibeli: ");
            int jumlahBuku=sc.nextInt();
            int diskon = 0;
            if (jenisBuku.equals("kamus")) {
                diskon += 10;
                if (jumlahBuku > 2) {
                    diskon += 2;
                }

            }
            else if (jenisBuku.equals("novel")) {
                diskon += 7;
                if (jumlahBuku > 3) {
                    diskon += 2;
                }
                else {
                    diskon +=1;
                }
            }

            else {
                if (jumlahBuku > 3) {
                    diskon += 5;
                }
            }
            System.out.println("jenis buku yang dibeli: " + jenisBuku);
            System.out.println("jumlah buku yang dibeli: " + jumlahBuku);
            System.out.println("diskon pelanggan sebesar: " + diskon);
        }
        else {
            System.out.println("tidak dapat diskon karena diskonnya terdapat dihari rabu saja");
        }
}}
