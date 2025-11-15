import java.util.Scanner;

public class Siakad20 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            // Inisialisasi array 2D dengan ukuran berdasarkan input user
            int nilai [][] = new int [4][3];
            
            // Menghitung rata-rata nilai per Mahasiswa berdasarkan input user
            for (int i = 0; i < nilai.length; i++) {
                System.out.println("Masukkan nilai mahasiswa ke-" + (i+1) + " :");
                double totalPerMahasiswa = 0;
                for (int j = 0; j < nilai[i].length; j++) {
                    System.out.print("Nilai mata kuliah ke-" + (j+1) + " : ");
                    nilai[i][j] = input.nextInt();
                    totalPerMahasiswa += nilai[i][j];
                }
                System.out.println(" Rata rata nilai: " + totalPerMahasiswa/3);
            }

            System.out.println("================================");
            System.out.println("Rata rata nilai per mata kuliah:");

            // Menghitung rata-rata nilai per mata kuliah berdasarkan input user
            for (int i = 0; i < nilai.length; i++) {
                double totalPerMataKuliah = 0;
                for (int j = 0; j < nilai[i].length; j++) { 
                    totalPerMataKuliah += nilai[i][j];
                }
                System.out.println("Mata kuliah ke-" + (i+1) + " : " + totalPerMataKuliah/4);
            }
        }
    }
}
