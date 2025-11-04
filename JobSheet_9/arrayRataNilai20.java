//package JobSheet_9;

import java.util.Scanner;

public class arrayRataNilai20 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[] nilaiMhs = new int[10];
            double totalNilai = 0, rataRata;

            for (int i = 0; i < nilaiMhs.length; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
                nilaiMhs[i] = input.nextInt();
            }
            for (int i = 0; i < nilaiMhs.length; i++) {
                totalNilai += nilaiMhs[i];
            }

            rataRata = (double) totalNilai / nilaiMhs.length;
            System.out.println("Rata-rata nilai akhir dari 10 mahasiswa adalah: " + rataRata);
        }
    }
}
