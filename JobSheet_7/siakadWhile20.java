package Jobsheet7;

import java.util.Scanner;

public class siakadWhile20 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            // INISIALISASI VARIABEL BARU
            int nilai, jml, i = 0;
            int tertinggi = 0;           // Diinisialisasi 0 agar setiap nilai > 0 akan menjadi yang tertinggi
            int terendah = 100;          // Diinisialisasi 100 agar setiap nilai < 100 akan menjadi yang terendah
            int lulus = 0;               // Counter untuk mahasiswa lulus
            int tidakLulus = 0;          // Counter untuk mahasiswa tidak lulus
            boolean inputPertama = true; // Flag untuk menangani kasus inisialisasi pada input pertama

            System.out.print("Masukan jumlah mahasiswa: ");
            jml = input.nextInt();

            while (i < jml){
                System.out.print("Masukan nilai mahasiswa ke-"+ (i+ 1)+ ": ");
                nilai = input.nextInt();
                
                // VALIDASI INPUT
                if (nilai < 0 || nilai > 100){
                    System.out.println("Nilai tidak valid, masukkan nilai yang benar. Ulangi input.");
                    continue; // Melompati iterasi saat ini tanpa menaikkan i
                }
                
                // LOGIKA PENCARIAN TERTINGGI & TERENDAH
                // Menggunakan inisialisasi pada input pertama agar lebih aman
                if (inputPertama) {
                    tertinggi = nilai;
                    terendah = nilai;
                    inputPertama = false;
                } else {
                    if (nilai > tertinggi) {
                        tertinggi = nilai;
                    }
                    if (nilai < terendah) {
                        terendah = nilai;
                    }
                }

                // LOGIKA PENENTUAN LULUS/TIDAK LULUS (Minimal 60)
                if (nilai >= 60) {
                    lulus++;
                } else {
                    tidakLulus++;
                }

                // (Bagian penentuan Nilai Huruf dan output perulangan tetap ada di sini...)
                if(nilai > 80 && nilai <= 100){
                    System.out.println("Nilai mahasiwa ke-"+(i+1)+ " Adalah A");
                } else if(nilai > 73 && nilai <= 80){
                    System.out.println("Nilai mahasiwa ke-"+(i+1)+ " Adalah B+");
                } else if (nilai > 65 && nilai <= 73){
                    System.out.println("Nilai mahasiwa ke-"+(i+1)+ " Adalah B");
                } else if (nilai > 60 && nilai <= 65 ){
                    System.out.println("Nilai mahasiwa ke-"+(i+1)+ " Adalah C+");
                } else if (nilai > 50 && nilai <= 60 ){
                    System.out.println("Nilai mahasiwa ke-"+(i+1)+ " Adalah C");
                } else if (nilai > 39 && nilai <= 50 ){
                    System.out.println("Nilai mahasiwa ke-"+(i+1)+ " Adalah D");
                } else {
                    System.out.println("Nilai mahasiwa ke-"+(i+1)+ " Adalah E");
                }
                
                i++; // Menaikkan counter perulangan
            }
            
            // OUTPUT AKHIR (Setelah perulangan selesai)
            System.out.println("\n-------------------------------------------");
            System.out.println("LAPORAN AKHIR PENILAIAN");
            System.out.println("Nilai Tertinggi yang diinput: " + tertinggi);
            System.out.println("Nilai Terendah yang diinput : " + terendah);
            System.out.println("-------------------------------------------");
            System.out.println("Jumlah Mahasiswa Lulus      : " + lulus);
            System.out.println("Jumlah Mahasiswa Tidak Lulus: " + tidakLulus);
            System.out.println("-------------------------------------------");
        }
    }
}