package JobSheet_8;

import java.util.Scanner;

public class kopiSenja {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int jumlahCabang, pelangganPerCabang, itemTerjual = 0, totalPelanggan = 0, totalItemTerjual = 0, itemPelanggan;

            System.out.print("Masukkan jumlah cabang kopi senja: ");
            jumlahCabang = input.nextInt();

            for (int i = 1; i <= jumlahCabang; i++) {
                System.out.println("---Cabang ke-" + i + "---");
                System.out.print("Masukkan jumlah pelanggan di cabang ke-" + i + ": ");
                pelangganPerCabang = input.nextInt();
                for (int j = 1; j <= pelangganPerCabang; j++) {
                    System.out.print("- Pelanggan ke-" + j + " memesan berapa item?  ");
                    itemPelanggan = input.nextInt();
                    itemTerjual += itemPelanggan;
                }
                System.out.println("-Cabang ke-" + i + " : ");
                System.out.println(" Total pelanggan: " + pelangganPerCabang);
                System.out.println(" Total item terjual: " + itemTerjual);
                totalPelanggan += pelangganPerCabang;
                totalItemTerjual += itemTerjual;
            }
            System.out.println("=== Rekapitulasi Kopi Senja ===");
            System.out.println("Total pelanggan di semua cabang: " + totalPelanggan);
            System.out.println("Total item terjual di semua cabang: " + totalItemTerjual);
        }   
    }
}
