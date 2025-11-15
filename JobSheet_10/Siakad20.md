# Laporan Jobsheet: Modifikasi Array Dinamis pada Program SIAKAD

## ❓ Jawaban Pertanyaan: Dinamisasi Array
1. Bagaimana jika terdapat perubahan jumlah siswa dan jumlah mata kuliah? Modifikasi kode program SIAKAD untuk mengakomodasi jumlah siswa dan jumlah mata kuliah yang dinamis.
```java
import java.util.Scanner;

public class Siakad20Modif {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){

            int jmlMahasiswa, jmlMataKuliah;
            // Meminta user untuk memasukkan jumlah mahasiswa dan mata kuliah
            System.out.print("Masukkan jumlah mahasiswa: ");
            jmlMahasiswa = input.nextInt();

            // Meminta user untuk memasukkan jumlah mata kuliah
            System.out.print("Masukkan jumlah mata kuliah: ");
            jmlMataKuliah = input.nextInt();
            // Inisialisasi array 2D dengan ukuran berdasarkan input user
            int nilai [][] = new int [jmlMahasiswa][jmlMataKuliah];
            
            for (int i = 0; i < nilai.length; i++) {
                System.out.println("Masukkan nilai mahasiswa ke-" + (i+1) + " :");
                double totalPerMahasiswa = 0;
                for (int j = 0; j < nilai[i].length; j++) {
                    System.out.print("Nilai mata kuliah ke-" + (j+1) + " : ");
                    nilai[i][j] = input.nextInt();
                    totalPerMahasiswa += nilai[i][j];
                }
                System.out.println(" Rata rata nilai: " + totalPerMahasiswa/jmlMataKuliah);
            }

            System.out.println("================================");
            System.out.println("Rata rata nilai per mata kuliah:");

            // Menghitung rata-rata nilai per mata kuliah berdasarkan input user
            for (int i = 0; i < nilai.length; i++) {
                double totalPerMataKuliah = 0;
                for (int j = 0; j < nilai[i].length; j++) {
                    totalPerMataKuliah += nilai[j][i];
                }
                System.out.println("Mata kuliah ke-" + (i+1) + " : " + totalPerMataKuliah/jmlMahasiswa);
            }
        }
    }
}

```