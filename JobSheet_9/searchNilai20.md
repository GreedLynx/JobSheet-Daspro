# Laporan Jobsheet: Analisis Array Search dan Statement BREAK

## 📄 Analisis Kode Program Awal (searchNilai20.java)
Program ini mengimplementasikan metode Pencarian Linier (Linear Search) untuk menemukan indeks elemen (key) dalam array arrNilai.
| Baris Kode | Konsep | Keterangan |
| int [] arrNilai = {80, ... }; | Array 1D | Array yang dideklarasikan secara statis untuk menyimpan nilai yang akan dicari. |
| for (int i = 0; i < arrNilai.length; i++) | Pencarian Linier | Perulangan ini secara sistematis memeriksa setiap elemen array mulai dari indeks 0 hingga akhir. |
| if (arrNilai[i] == key) | Pemilihan | Kondisi yang dicari: apakah nilai elemen array saat ini sama dengan nilai kunci (key). |

## ❓ Jawaban Pertanyaan dan Modifikasi
1. Jelaskan maksud dari statement break; pada baris ke-10 kode program percobaan 4 di atas.
* Maksud: Pernyataan break; digunakan untuk menghentikan perulangan FOR sepenuhnya saat kondisi yang dicari sudah terpenuhi.
* Kegunaan: Begitu program menemukan arrNilai[i] sama dengan key (misalnya, key = 90 ditemukan pada indeks ke-4), program tidak perlu lagi melanjutkan pengecekan sisa elemen array. break menghemat waktu pemrosesan dengan langsung melompat ke baris kode setelah loop.

2. Modifikasi kode program pada percobaan 4 di atas sehingga program dapat menerima input berupa banyaknya elemen array, isi array, dan sebuah nilai (key) yang ingin dicari...
Modifikasi ini mengubah array dari statis menjadi dinamis (ukuran ditentukan pengguna) dan mengimplementasikan Pencarian Linier Interaktif.

**🛠️ Kode Modifikasi (Pertanyaan 2 & 3)**
```java
import java.util.Scanner;

public class searchNilai20Modif {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            
            // MODIFIKASI 1: Input Ukuran Array Dinamis
            System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
            int jml = input.nextInt(); 
            int[] arrNilai = new int[jml]; // Array dengan ukuran N
            
            // Variabel untuk melacak status penemuan (Sentinel)
            int indeksDitemukan = -1; // Inisialisasi -1 menunjukkan "tidak ditemukan"
            
            // --- LOOP INPUT (Mengisi Array) ---
            for (int i = 0; i < arrNilai.length; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
                arrNilai[i] = input.nextInt();
            }
            
            // --- INPUT KEY ---
            System.out.print("Masukkan nilai yang ingin dicari: ");
            int key = input.nextInt();
            
            // --- LOOP PENCARIAN LINIER ---
            for (int i = 0; i < arrNilai.length; i++) {
                if (arrNilai[i] == key) {
                    indeksDitemukan = i; // Catat indeks saat ditemukan
                    break; // Hentikan perulangan (sesuai fungsi break)
                }
            }
            
            // --- OUTPUT AKHIR (Menggabungkan Pertanyaan 2 & 3) ---
            System.out.println();
            
            // Logika Pemilihan (IF-ELSE) untuk menampilkan hasil
            if (indeksDitemukan != -1) {
                // Output sesuai contoh no. 2
                // (Nilai i+1 karena output untuk pengguna dimulai dari 1)
                System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (indeksDitemukan + 1));
            } else {
                // Output sesuai contoh no. 3
                System.out.println("Nilai yang dicari tidak ditemukan");
            }
        }
    }
}
```
