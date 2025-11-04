import java.util.Scanner;   

public class pesananKafe {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            // Deklarasi variabel
            int jmlPesanan, totalBiaya = 0;
            String[] menu = {"Espresso", "Cappuccino", "Latte", "Mocha", "Tea"};
            double[] harga = {15000, 20000, 25000, 30000, 10000};
            
            // Input jumlah pesanan
            System.out.print("Masukkan jumlah pesanan: ");
            jmlPesanan = input.nextInt();   
            String[] pesanan = new String[jmlPesanan];
            int[] biayaPesanan = new int[jmlPesanan];

            //input pesanan
            for (int i = 0; i < jmlPesanan; i++) {
                System.out.print("Masukkan pesanan ke-" + (i + 1) + " (Espresso/Cappuccino/Latte/Mocha/Tea): ");
                pesanan[i] = input.next();
                
                // Mencari harga sesuai pesanan
                boolean found = false;
                for (int j = 0; j < menu.length; j++) {
                    if (pesanan[i].equalsIgnoreCase(menu[j])) {
                        biayaPesanan[i] = (int) harga[j];
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Menu tidak tersedia. Biaya diatur ke 0.");
                    biayaPesanan[i] = 0;
                }
                totalBiaya += biayaPesanan[i];
            }

            // Menampilkan rincian pesanan
            System.out.println("==================================");
            System.out.println("Rincian Pesanan:");
            for (int i = 0; i < jmlPesanan; i++) {
                System.out.printf("Pesanan ke-%d: %s - Rp%d%n", (i + 1), pesanan[i], biayaPesanan[i]);
            }
            System.out.println("==================================");
            System.out.printf("Total Biaya: Rp%d%n", totalBiaya);
        }
    }
}