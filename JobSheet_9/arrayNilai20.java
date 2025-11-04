package JobSheet_9;

import java.util.Scanner;

public class arrayNilai20 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int [] nilaiAkhir = new int[10];
            for (int i = 0; i < nilaiAkhir.length; i++) {
                System.out.print("Masukkan nilai akhir mahasiswa ke-" + (i + 1) + ": ");
                nilaiAkhir[i] = input.nextInt();
            }

            for (int i = 0; i < nilaiAkhir.length; i++) {
                if (nilaiAkhir[i] > 70) {
                    System.out.print("Selamat! Mahasiswa ke-" + (i + 1) + " lulus. ");
                }
                else {
                    System.out.print("Maaf. Mahasiswa ke-" + (i + 1) + " tidak lulus. ");
                }
            }

        }
    }
}
