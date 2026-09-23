    import java.util.Scanner;

    public class Latihan01_24 {
        
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int totalBiaya = 0;
            System.out.print("Lama Parkir: 1");
            int lamaParkir = scn.nextInt();
            int parkir2Jam = 2000;
            if (lamaParkir == 2){
                totalBiaya = parkir2Jam;
            
            }
            else if (lamaParkir > 2) {
                totalBiaya= parkir2Jam + ((lamaParkir - 2) * 1000);

            }

            System.out.println("Total Biaya Parkir: " + totalBiaya);        
            scn.close();

        }
    }
