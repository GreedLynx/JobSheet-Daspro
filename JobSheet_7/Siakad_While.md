# Laporan Percobaan 2.1

## 📄Analisis Kode Program Awal
Program siakadWhile20.java menerima jumlah mahasiswa dan kemudian mengulang proses input nilai menggunakan struktur WHILE. Setelah setiap input, program menggunakan serangkaian IF-ELSE IF-ELSE untuk mengkonversi nilai angka menjadi Nilai Huruf dan mencetak hasilnya.

## ❓Jawaban Pertanyaan 2.1
1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program Percobaan 1!
Catatan: Meskipun kode yang diberikan menggunakan **WHILE**, jawaban ini mengacu pada sintaks standar perulangan **FOR** (yang setara dengan kode **WHILE** Anda: **for (int i = 0; i < jml; i++)).**

| Komponen FOR | Keterangan | Fungsi dalam Perulangan |
| Inisialisasi (**int i = 0**) | Baris kode yang dijalankan hanya sekali di awal. | Menyiapkan variabel kontrol (counter) sebelum perulangan dimulai.
| Kondisi (**i < jml**) | Ekspresi boolean yang dicek sebelum setiap iterasi. | Jika **TRUE** , perulangan berlanjut; jika **FALSE**, perulangan berhenti. |
| Update/Iterasi (i++) | Baris kode yang dieksekusi setelah setiap iterasi selesai. | Mengubah nilai variabel kontrol (menaikkan **i**) untuk mendekati kondisi berhenti. |

2. Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?
| Variabel | Inisialisasi yang Benar | Alasan |
|:---|:---|:---|
| Tertinggi | 0 (Nilai minimal yang mungkin) | Nilai 0 memastikan bahwa nilai mahasiswa yang pertama kali diinput (misalnya 75) akan selalu lebih besar dari **tertinggi** (**75 > 0**), sehingga variabel **tertinggi** segera diperbarui ke nilai yang valid. |
| Terendah | 100 (Nilai maksimal yang mungkin) | Nilai 100 memastikan bahwa nilai mahasiswa yang pertama kali diinput (misalnya 75) akan selalu lebih kecil dari **terendah** (**75 < 100**), sehingga variabel **terendah** segera diperbarui ke nilai yang valid. |

**Konsekuensi Inisiasi Salah**

Jika **tertinggi** diinisialisasi 100 dan terendah diinisialisasi 0:

* **tertinggi = 100**: Semua nilai mahasiswa (misalnya 75) akan lebih kecil dari 100 (75 < 100). Akibatnya, nilai **tertinggi** tidak akan pernah ter-update kecuali ada nilai > 100 (yang tidak mungkin) dan hasil akhirnya akan salah (selalu 100).

* **terendah = 0**: Semua nilai mahasiswa (misalnya 75) akan lebih besar dari 0 (75 > 0). Akibatnya, nilai **terendah** tidak akan pernah ter-update kecuali ada nilai < 0 (yang tidak mungkin) dan hasil akhirnya akan salah (selalu 0).

3. Jelaskan fungsi dan alur kerja dari potongan kode berikut!
```java
if (nilai > tertinggi) {
    tertinggi = nilai;
}
if (nilai < terendah) {
    terendah = nilai;
} 
```
* Fungsi: Potongan kode ini berfungsi untuk mencari nilai tertinggi (Maksimum) dan nilai terendah (Minimum) dari serangkaian data yang dimasukkan dalam perulangan.

* Alur Kerja:
        1. Pengecekan Tertinggi: Program mengecek apakah nilai yang baru saja diinput lebih besar dari nilai yang saat ini disimpan di variabel tertinggi.
        2. Update Tertinggi: Jika ya, berarti nilai adalah rekor baru, maka tertinggi diperbarui menjadi nilai.
        3. Pengecekan Terendah: Program kemudian secara terpisah mengecek apakah nilai lebih kecil dari nilai yang saat ini disimpan di variabel terendah.
        4. Update Terendah: Jika ya, berarti nilai adalah rekor baru, maka terendah diperbarui menjadi nilai.

4. Modifikasi Kode Program
Berikut adalah modifikasi program siakadWhile20.java untuk menambahkan perhitungan Nilai Tertinggi, Terendah, Lulus, dan Tidak Lulus (dengan batas kelulusan $\ge 60$).Kode Program siakadWhile20.java (MODIFIKASI)
```java
package Jobsheet7;

import java.util.Scanner;

public class siakadWhile20 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            // MODIFIKASI: Variabel untuk Perulangan dan Status
            int nilai, jml, i = 0;
            int tertinggi = 0;          // Inisialisasi untuk Tertinggi
            int terendah = 100;         // Inisialisasi untuk Terendah
            int lulus = 0;              // Counter Lulus
            int tidakLulus = 0;         // Counter Tidak Lulus
            
            System.out.print("Masukan jumlah mahasiswa: ");
            jml = input.nextInt();

            while (i < jml){
                System.out.print("Masukan nilai mahasiswa ke-"+ (i+ 1)+ ": ");
                nilai = input.nextInt();
                
                // (Logika validasi nilai Anda di sini)

                // LOGIKA PENCARIAN TERTINGGI & TERENDAH
                if (nilai > tertinggi) {
                    tertinggi = nilai;
                }
                if (nilai < terendah) {
                    terendah = nilai;
                }

                // LOGIKA PENENTUAN LULUS/TIDAK LULUS (Minimal 60)
                if (nilai >= 60) {
                    lulus++;
                } else {
                    tidakLulus++;
                }

                // (Logika if-else if Nilai Huruf Anda yang asli di sini)
                
                i++;
            }
            
            // OUTPUT AKHIR (Laporan)
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
```