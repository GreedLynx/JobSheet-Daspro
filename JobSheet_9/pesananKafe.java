//package JobSheet_9;

import java.util.Scanner;   

public class pesananKafe {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            // Deklarasi variabel
            int jmlPesanan = 0, totalBiaya = 0;
            String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappuccino", "Coklat Ice"};
            double[] harga = {15000, 12000, 20000, 30000, 12000, 8000, 15000};
            
            // Input jumlah pesanan
            do {
                System.out.print("Masukkan jumlah pesanan: ");
                jmlPesanan = input.nextInt();
                input.nextLine(); // Clear newline
                if (input.hasNextInt()) {
                    System.out.println("Jumlah pesanan harus lebih dari 0. Silakan coba lagi.");
                    if (jmlPesanan > 0) {
                        break;
                    }else {
                        System.out.println("Jumlah pesanan tidak valid.");
                        input.nextLine(); // Clear invalid input
                    } 
                } else {
                    System.out.println("Input tidak valid. Silakan masukkan angka.");
                    input.nextLine(); // Clear invalid input
                } 
            }while (true);
            
            input.nextLine(); // Clear newline after integer input

            String[] pesanan = new String[jmlPesanan];
            int[] biayaPesanan = new int[jmlPesanan];

            System.out.println("Menu Kafe:");
            for (int i = 0; i < menu.length; i++) {
                System.out.printf("%d. %s - Rp%.0f%n", (i + 1), menu[i], harga[i]);
            }
            //input pesanan
            for (int i = 0; i < jmlPesanan; i++) {
                System.out.print("Masukkan pesanan ke-" + (i + 1) + " :");
                pesanan[i] = input.nextLine();
                
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