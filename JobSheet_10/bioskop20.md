# Laporan Jobsheet: Analisis Array 2D dan Perulangan

## 📄 Analisis Kode Program Awal (bioskop20modif1.java)
Program ini mendeklarasikan array dua dimensi (penonton) dengan ukuran 4 * 2. Ini berarti ada 4 baris (indeks 0 hingga 3) dan 2 kolom per baris (indeks 0 dan 1). Program mengisi semua 8 elemen dengan nama penonton.
Logika utama program adalah menggunakan atribut .length untuk mendapatkan ukuran dimensi array dan menggunakan perulangan FOR untuk menampilkan panjang setiap baris.

## ❓ Jawaban Pertanyaan Analisis dan Modifikasi
1. Mengapa pengisian elemen array harus dilakukan secara berurutan mulai dari indeks ke-0?
* Alasan: Di Java, array selalu menggunakan indeks berbasis nol (zero-based indexing). Indeks pertama (awal) dari setiap array (baik dimensi pertama maupun dimensi kedua) adalah 0. Mengisi dari indeks 0 memastikan semua elemen array diakses dan digunakan dengan benar.

2. Mengapa terdapat null pada daftar nama penonton?
* Alasan: null muncul jika array 2D dideklarasikan dan diinisialisasi ukurannya (misalnya new String[4][2]), tetapi elemennya belum diberi nilai secara manual. Karena array tipe String adalah tipe data referensi, nilai default-nya adalah null.

3. Lengkapi daftar penonton pada langkah ke-4 sebagai berikut [disertai kode pengisian].


4. Tambahkan kode program berikut... Jelaskan fungsi dari penonton.length dan penonton[0].length!
| Atribut | Kode | Fungsi | Output(Contoh 4×2) |
| :---: | :---: | :---: | :---: | 
| Dimensi ke-1 | penonton.length | Menghasilkan jumlah baris (Outer dimension). | 4 | 
| Dimensi ke-2 | penonton[0].length | Menghasilkan jumlah kolom (panjang array di baris ke-0). | 2 |
Apakah penonton[0].length, penonton[1].length, dst., memiliki nilai yang sama? Mengapa?
Ya, nilainya sama, yaitu 2.

* Alasan: Array Anda adalah array persegi (String[4][2]), yang berarti setiap baris memiliki jumlah kolom yang sama. Jika ini adalah array tidak beraturan (ragged array), nilainya bisa berbeda.

5. Modifikasi kode program untuk menampilkan panjang setiap baris array menggunakan for loop [disertai kode].
Keluaran yang Dihasilkan (Output):
```java
4
Panjang baris ke-1 : 2
Panjang baris ke-2 : 2
Panjang baris ke-3 : 2
Panjang baris ke-4 : 2
```

6. Modifikasi kode program untuk menampilkan panjang setiap baris array menggunakan foreach loop [disertai kode].
Modifikasi Kode:
```java
for (String[] barisPenonton : penonton) {
    System.out.println("Panjang baris ke-" + count + " : " + barisPenonton.length);
    count++;
}
```
Keluaran yang Dihasilkan: Sama seperti soal 5, tetapi menggunakan sintaks foreach.

7. Tambahkan kode program untuk menampilkan nama penonton pada baris ke-3 menggunakan for loop [disertai kode].
* Modifikasi Kode:
```java
System.out.println("Penonton pada baris ke-3:");
// Indeks baris ke-3 adalah [2]
for (int i = 0; i < penonton[2].length; i++) {
    System.out.println(penonton[2][i]); 
}
```
* Keluaran yang Dihasilkan (Contoh):
```java
Penonton pada baris ke-3:
Eka
Farhan
```

8. Modifikasi kode program pada pertanyaan 7 menggunakan foreach loop [disertai kode].
* Modifikasi Kode:
```java
System.out.println("Penonton pada baris ke-3:");
// Mengakses baris ke-3 langsung: penonton[2]
for (String nama : penonton[2]) { 
    System.out.println(nama); 
}
```
Keluaran yang Dihasilkan: Sama dengan soal 7.

9. Modifikasi kembali kode program pada langkah 11 [soal 5] untuk menampilkan nama penonton untuk setiap baris.
* Modifikasi Kode:
```java
for (int i = 0; i < penonton.length; i++) {
    // Array penonton[i] adalah array 1D berisi nama penonton
    // String.join digunakan untuk menggabungkan elemen array dengan pemisah ", "
    String daftarNama = String.join(", ", penonton[i]); 
    System.out.println("Penonton pada baris ke-" + (i + 1) + ": " + daftarNama);
}
```

10. Menurut Anda, apa kekurangan dan kelebihan foreach loop dibandingkan dengan for loop?

| Fitur	| Foreach Loop | For Loop | 
| :---: | :---: | :---: |
| Kelebihan	| Lebih ringkas, mudah dibaca, dan aman dari ArrayIndexOutOfBoundsException. | Fleksibel: dapat melompati elemen, berjalan mundur, atau mengakses array secara parsial. |
| Kekurangan | Tidak bisa mengakses indeks elemen. Tidak bisa mengubah (memodifikasi) nilai elemen di dalam array. | Membutuhkan inisialisasi, kondisi, dan step yang harus diatur dengan hati-hati untuk menghindari error. | 

11. Berapa indeks baris maksimal pada array penonton?
* Ukuran baris (penonton.length) adalah 4.
* Indeks Baris Maksimal: **3** (karena indeks dimulai dari 0: 0, 1, 2, 3).

12. Berapa indeks kolom maksimal pada array penonton?
* Ukuran kolom (penonton[i].length) adalah 2.
* Indeks Kolom Maksimal: **1** (karena indeks dimulai dari 0: 0, 1).

13. Apa fungsi dari String.join()?
* Fungsi: String.join() adalah method statis yang digunakan untuk menggabungkan semua elemen dari array atau list menjadi satu string tunggal, dengan menggunakan pemisah (delimiter) yang spesifik di antara setiap elemen.Contoh: String.join(", ", {"A", "B"}) menghasilkan "A, B".