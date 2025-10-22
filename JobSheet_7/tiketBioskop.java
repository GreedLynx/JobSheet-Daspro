package Jobsheet7;

import java.util.Scanner;

public class tiketBioskop {
    public static void main(String[] args) {
        try(Scanner input = new Scanner (System.in)){
            double hargaTiket = 50000, jumlahTiketSehari=0, totalHargaTiketSehari=0, totalTiket, totalHargaAwal, totalHargaAkhir;

            for (int i = 0; i < 5; i++) {
                do {
                System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
                totalTiket = input.nextDouble();

                    if (totalTiket <= 0) {
                        System.out.println("❌ Jumlah tiket tidak valid! Masukkan angka lebih dari 0.");
                    }
                } while (totalTiket <= 0);

                // hitung total harga awal
                totalHargaAwal = hargaTiket * totalTiket;
                totalHargaAkhir = totalHargaAwal;

                 // algoritma diskon
                if (totalTiket > 10) {
                    totalHargaAkhir = totalHargaAwal - (totalHargaAwal * 0.15);
                    System.out.println("🎟️ Diskon 15%! Anda harus membayar sebesar Rp." + totalHargaAkhir);
                } else if (totalTiket > 4) {
                    totalHargaAkhir = totalHargaAwal - (totalHargaAwal * 0.1);
                    System.out.println("🎟️ Diskon 10%! Anda harus membayar sebesar Rp." + totalHargaAkhir);
                } else {
                    System.out.println("Anda harus membayar sebesar Rp." + totalHargaAkhir);
                }

                // hitung total penjualan harian
                jumlahTiketSehari += totalTiket;
                totalHargaTiketSehari += totalHargaAkhir;
            }
            //Output data jumlah tiket terjual dan total omset dari penjualan tiket
            System.out.println("\nJumlah tiket yang terjual hari ini adalah : Rp." + jumlahTiketSehari);
            System.out.println("Total omset dari penjualan tiket yang sudah terjual hari ini : Rp."+ totalHargaTiketSehari);
        }
    }
}
