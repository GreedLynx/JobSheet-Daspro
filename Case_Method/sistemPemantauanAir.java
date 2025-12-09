import java.util.Scanner;

public class sistemPemantauanAir {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            // Deklarasi variabel
            int hari, wilayah;
            double rataHarian, konsumsiTertinggi = 0, konsumsiHariTertinggi, wilayahTertinggi = 0, konsumsiWilayahTertinggi ;
            System.out.println("Sistem Pemantauan Air BPSDA");

            // Input jumlah hari dan wilayah
            System.out.print("Masukkan jumlah hari pemantauan: ");
            hari = input.nextInt();

            // Input jumlah wilayah
            System.out.print("Masukkan jumlah wilayah yang dipantau: ");
            wilayah = input.nextInt();

            // Deklarasi array untuk menyimpan data konsumsi air setiap wilayah
            double[][] konsumsiAir = new double[wilayah][hari];

            // Input data konsumsi air harian untuk setiap wilayah
            for (int i = 0; i < wilayah; i++) {
                System.out.println("Wilayah ke-" + (i + 1) + ":");
                double totalKonsumsiPerWilayah = 0;
                for (int j = 0; j < hari; j++) {
                    System.out.print("Konsumsi air hari ke-"+ (j + 1) +" (dalam meter kubik): ");
                    konsumsiAir[i][j] = input.nextDouble();
                    totalKonsumsiPerWilayah += konsumsiAir[i][j];
                }
                System.out.println("Total konsumsi air wilayah ke-" + (i + 1) + " selama " + hari + " hari: " + totalKonsumsiPerWilayah + " meter kubik\n");
            }

            //Proses perhitungan mencari rata konsumsi air harian seluruh wilayah
            System.out.println("Rata Rata Konsumsi Air seluruh wilayah per hari:");
            for (int j = 0; j < hari; j++) {
                double totalKonsumsiPerHari = 0;
                for (int i = 0; i < wilayah; i++) {
                    totalKonsumsiPerHari += konsumsiAir[i][j];
                }
                rataHarian = totalKonsumsiPerHari / wilayah;
                System.out.println("Hari ke-" + (j + 1) + ": " + rataHarian + " meter kubik");
            }
            
            // Mencari hari dengan konsumsi air tertinggi
            System.out.println("\nHari dengan konsumsi air tertinggi: ");
            konsumsiHariTertinggi = 0;
            for (int j = 0; j < hari; j++) {
                double totalKonsumsiPerHari = 0;
                for (int i = 0; i < wilayah; i++) {
                    totalKonsumsiPerHari += konsumsiAir[i][j];
                }
                if (totalKonsumsiPerHari > konsumsiTertinggi) {
                    konsumsiTertinggi = totalKonsumsiPerHari;
                    konsumsiHariTertinggi = j + 1;
                }
                
            }
            System.out.println("Konsumsi air tertinggi adalah hari ke-" + konsumsiHariTertinggi + " dengan total konsumsi " + konsumsiTertinggi + " meter kubik");

            // Mencari wilayah dengan konsumsi air tertinggi
            System.out.println("\nWilayah dengan konsumsi air tertinggi: ");
            konsumsiWilayahTertinggi = 0;
            for (int i = 0; i < wilayah; i++) {
                double totalKonsumsiPerWilayah = 0;
                for (int j = 0; j < hari; j++) {
                    totalKonsumsiPerWilayah += konsumsiAir[i][j];
                }
                if (totalKonsumsiPerWilayah > konsumsiWilayahTertinggi) {
                    konsumsiWilayahTertinggi = totalKonsumsiPerWilayah;
                    wilayahTertinggi = i + 1;
                }
            }
            System.out.println("Konsumsi air tertinggi adalah wilayah ke-" + wilayahTertinggi + " dengan total konsumsi " + konsumsiWilayahTertinggi + " meter kubik");
        }
    }
}
