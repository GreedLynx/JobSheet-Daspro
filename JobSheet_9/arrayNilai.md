# Laporan Jobsheet: Analisis Array dan Pemilihan (Mahasiswa Lulus)

## 📄 Analisis Kode Program Awal (arrayNilai20.java)
Program ini mendeklarasikan array nilaiAkhir berukuran 10. Program menggunakan dua perulangan FOR terpisah:

1. Perulangan pertama untuk mengisi nilai akhir ke setiap elemen array (indeks 0 hingga 9).

2. Perulangan kedua untuk menampilkan kembali semua nilai yang sudah diinput.

## ❓ Jawaban Pertanyaan dan Modifikasi
1. Ubah statement pada langkah nomor 5 [Baris 8-10] menjadi seperti berikut... Jalankan program. Apakah terjadi perubahan? Mengapa demikian?
* Keluaran Program: Tidak terjadi perubahan fungsional pada hasil akhir program (yaitu, program tetap meminta 10 input nilai dan menyimpannya ke array).
* Mengapa Demikian:
    * Perubahan hanya terjadi pada tampilan output saat input diminta. Kode asli menggunakan counter i + 1 (misalnya: "ke-1", "ke-2") untuk tampilan yang lebih mudah dibaca manusia.
    * Kode modifikasi menggunakan counter i saja (misalnya: "ke-0", "ke-1").
    * Secara logika pemrograman, kedua loop menjalankan tugas yang sama: nilaiAkhir[i] = input.nextInt();, yang secara benar mengisi array dari indeks 0 hingga 9.

2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length?
* Maksud Kondisi: Kondisi ini adalah syarat agar perulangan FOR terus berjalan.
* Penjelasan: Variabel nilaiAkhir.length mengembalikan ukuran total array (yaitu 10). Karena array di Java selalu diindeks mulai dari 0, indeks valid terakhir adalah length - 1 (yaitu 9). Kondisi i < nilaiAkhir.length memastikan counter i berjalan dari 0 hingga 9, dan berhenti saat i=10, sehingga tidak terjadi ArrayIndexOutOfBoundsException.

3. Ubah statement pada langkah nomor 6 [Baris 12-14] menjadi... Jalankan program dan jelaskan alur program!
Kode Modifikasi (Hanya Menampilkan yang Lulus):
```java
for (int i = 0; i < nilaiAkhir.length; i++) {
    if (nilaiAkhir[i] > 70) {
        System.out.println("Mahasiswa ke-" + i + " lulus!");
    }
}
```
* Alur Program:
    1. Perulangan Runtun: Perulangan FOR berjalan dari indeks i=0 hingga i=9.
    2. Pengecekan Kondisi: Di setiap iterasi, program menggunakan IF Statement untuk mengecek kondisi nilaiAkhir[i] > 70.
    3. Output Selektif: Hanya jika kondisi tersebut bernilai TRUE (nilai mahasiswa lebih dari 70), output "Mahasiswa ke-i lulus!" akan dicetak. Mahasiswa yang nilainya <= 70 akan dilewati tanpa output.

    4. Modifikasi program agar menampilkan status kelulusan semua mahasiswa... seperti ilustrasi output [terlampir].
Untuk menampilkan status kelulusan semua mahasiswa (baik Lulus maupun Tidak Lulus), diperlukan struktur IF-ELSE.

🛠️ Kode Modifikasi Final (Menggantikan Baris 12-14)
```java
// Modifikasi untuk output No. 4
for (int i = 0; i < nilaiAkhir.length; i++) {
    // Memeriksa apakah nilai lebih dari 70 (LULUS)
    if (nilaiAkhir[i] > 70) {
        System.out.println("Mahasiswa ke-" + i + " lulus!");
    } else {
        // Blok ELSE: Jika nilai <= 70 (TIDAK LULUS)
        System.out.println("Mahasiswa ke-" + i + " tidak lulus!");
    }
}
```
