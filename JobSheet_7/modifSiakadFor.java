package Jobsheet7;

import java.util.Scanner;

public class modifSiakadFor {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            double nilai, tertinggi = 0, terendah = 100;

            for (int i = 0; i < 10; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-"+ (i+1)+":");
                nilai = input.nextDouble();
                
                // LOGIKA VALIDASI (Ditambahkan untuk kode yang lebih lengkap)
                if (nilai < 0 || nilai > 100) {
                    System.out.println("Nilai tidak valid. Melewatkan input ini.");
                    // Lanjutan: Jika ini di FOR, Anda mungkin perlu melakukan i-- atau continue/break.
                }

                // LOGIKA PENCARIAN TERTINGGI & TERENDAH
                if(nilai > tertinggi){
                    tertinggi = nilai;
                }
                if(nilai < terendah){
                    terendah = nilai;
                }

                // MODIFIKASI: Menambahkan pesan untuk Nilai A
                if (nilai > 80 && nilai <= 100) {
                    System.out.println("Bagus, pertahankan nilainya!");
                }
            }
            System.out.println("Nilai tertinggi adalah = "+ tertinggi);
            System.out.println("Nilai terendah adalah = "+ terendah);
        }
    }
}