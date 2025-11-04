# Laporan Jobsheet: Modifikasi Array dan Perhitungan Rata-Rata Bersyarat

## 📄 Analisis Kode Program Awal (arrayRataNilai20.java)
Program ini menggunakan array satu dimensi untuk menyimpan 10 nilai mahasiswa. Program terdiri dari dua perulangan FOR: yang pertama untuk input data ke array dan yang kedua untuk akumulasi nilai total (totalNilai). Program kemudian menghitung dan menampilkan rata-rata keseluruhan.

* Ukuran Array Awal: Ukuran array ditetapkan secara statis ke 10 (new int[10]).
* Perhitungan Rata-Rata: Dilakukan secara sequence (berurutan) setelah perulangan selesai, yaitu totalNilai dibagi dengan nilaiMhs.length.

## ❓ Jawaban Pertanyaan dan Modifikasi
1. Modifikasi 1: Menghitung Jumlah Mahasiswa Lulus (> 70)
Modifikasi ini menambahkan logika pemilihan (IF) di dalam perulangan untuk menghitung dan menampilkan banyaknya mahasiswa yang nilainya lebih besar dari 70.

**🛠️ Kode Modifikasi (Pertanyaan 1)**
```java
// Tambahkan variabel counter di awal main
int countLulus = 0; 
// ...

// Perulangan untuk mengecek kelulusan (bisa di dalam atau setelah loop akumulasi)
for (int i = 0; i < nilaiMhs.length; i++) {
    if (nilaiMhs[i] > 70) { // Cek kondisi: Nilai > 70
        countLulus++;        // Tambah counter jika TRUE
    }
}

// Output
System.out.println("Banyaknya mahasiswa yang memiliki nilai > 70 adalah: " + countLulus);
```

2. Modifikasi 2: Input Ukuran Dinamis dan Rata-Rata Lulus/Tidak Lulus
Modifikasi ini menggabungkan beberapa konsep: Input dinamis, variabel akumulator berganda, dan IF-ELSE untuk menghitung rata-rata secara terpisah untuk yang Lulus dan Tidak Lulus.

**🛠️ Kode Modifikasi (Pertanyaan 2)**
```java 
import java.util.Scanner;

public class arrayRataNilai20Modif {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            
            // MODIFIKASI 1: Menerima ukuran array secara dinamis
            System.out.print("Masukkan jumlah mahasiswa : ");
            int jmlMhs = input.nextInt(); // Ukuran N dari pengguna
            int[] nilaiMhs = new int[jmlMhs]; // Array dibuat dengan ukuran dinamis
            
            // MODIFIKASI 2: Variabel akumulator berganda
            double totalLulus = 0;
            double totalTidakLulus = 0;
            int countLulus = 0;
            int countTidakLulus = 0;

            // --- PERULANGAN INPUT ---
            for (int i = 0; i < nilaiMhs.length; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
                nilaiMhs[i] = input.nextInt();
            }
            
            // --- PERULANGAN AKUMULASI BERSYARAT ---
            for (int i = 0; i < nilaiMhs.length; i++) {
                // Kriteria Kelulusan: Nilai > 70
                if (nilaiMhs[i] > 70) {
                    totalLulus += nilaiMhs[i];
                    countLulus++;
                } else {
                    // Blok ELSE: Untuk yang Tidak Lulus (Nilai <= 70)
                    totalTidakLulus += nilaiMhs[i];
                    countTidakLulus++;
                }
            }

            // --- PERHITUNGAN RATA-RATA AKHIR ---
            double rataRataLulus = (countLulus > 0) ? (totalLulus / countLulus) : 0.0;
            double rataRataTidakLulus = (countTidakLulus > 0) ? (totalTidakLulus / countTidakLulus) : 0.0;

            // --- OUTPUT (Sesuai Ilustrasi) ---
            System.out.println("\n---------------- OUTPUT ------------------");
            System.out.printf("Rata-rata nilai lulus = %.1f\n", rataRataLulus);
            System.out.printf("Rata-rata nilai tidak lulus = %.1f\n", rataRataTidakLulus);
            System.out.println("------------------------------------------");
        }
    }
}
```
