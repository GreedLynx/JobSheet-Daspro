package Jobsheet7;

import java.util.Scanner;

public class kafeDoWhile20 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            //deklarasi tipe data 
            int kopi, teh, roti, hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000, totalHarga;
            String namaPelanggan;

            //pemberian kondisi 
            do {
                System.out.print("Masukan nama pelanggan (ketik batal untuk keluar) : ");
                namaPelanggan = input.nextLine();

                if(namaPelanggan.equalsIgnoreCase("batal")){
                    System.out.println("Transaksi dibatalkan");
                    break;
                }
                //masukan jumlah kopi yang dipesan
                System.out.print("Jumlah kopi: ");
                kopi = input.nextInt();
                //masukan jumlah teh yang dipesan
                System.out.print("Jumlah teh : ");
                teh = input.nextInt();
                //masukan jumlah roti yang dipesan
                System.out.print("Jumlah Roti : ");
                roti = input.nextInt();

                //proses menghitung total harga yang harus dibayar
                totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
                System.out.println("Biaya yang harus dibayar adalah: Rp." + totalHarga);
                input.nextLine();
            } while (true);
            System.out.println("Semua Transaksi Selesai");
        }
    }
}
