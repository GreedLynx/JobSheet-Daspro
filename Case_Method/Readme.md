# Laporan Penilaian Akademik Mahasiswa

Program berbasis konsol untuk menghitung Nilai Akhir dua mata kuliah (Algoritma dan Struktur Data) serta menentukan status kelulusan berdasarkan range nilai.

## Deskripsi Proyek

Program Java ini berfungsi sebagai simulasi sistem akademik sederhana. Program akan menerima input nilai UTS (30%), UAS (40%), dan Tugas (30%) untuk dua mata kuliah utama. Logika utama program adalah menggunakan struktur IF-ELSE IF-ELSE bertingkat dan Operator Logika AND (&&) untuk mengkonversi Nilai Akhir menjadi Nilai Huruf dan menentukan Status Kelulusan semester (rata-rata $\ge 70$).

## Konsep yang Digunakan

- Struktur Runtutan (Sequence): Urutan input dan perhitungan dilakukan secara berurutan.
- Pemilihan Bersusun (If-Else If): Digunakan untuk menentukan range Nilai Huruf dari A hingga E.
- Operator Logika: Digunakan untuk mendefinisikan batas bawah dan batas atas (range) nilai (> 80 && <= 100).
- Operator Ternary (? :): Digunakan untuk menentukan status LULUS/TIDAK LULUS per mata kuliah dan status semester.

## 🚀 Persiapan dan Eksekusi

## Kebutuhan Dasar (Dependencies)

- Java Development Kit (JDK) (Versi 8 atau yang lebih baru).
- Program ini berjalan di lingkungan Console/Terminal (CLI).

## Cara Menjalankan Program

1. Kompilasi File: Buka Terminal/Command Prompt di direktori tempat file caseMethod.java berada.

```
javac caseMethod.java
```

2. Eksekusi Program:

```
java caseMethod
```

3. Ikuti petunjuk di konsol untuk memasukkan data nilai (NIM, UTS, UAS, Tugas) secara berurutan.

## 🔎 Analisis dan Logika Nilai

Program menggunakan pembobotan nilai sebagai berikut: UTS (30%) + UAS (40%) + Tugas (30%).

## Struktur IF-ELSE IF (Konversi Nilai Huruf)

Logika konversi nilai diimplementasikan menggunakan struktur if-else if untuk mencocokkan Nilai Akhir (nilaiAkhirAlgo atau nilaiAkhirStruktur) dengan range yang telah ditetapkan:
Kondisi Nilai Akhir (N) Nilai Huruf Nilai Setara

| Kondisi Nilai Akhir N | Nilai Huruf Setara |
| :-------------------- | :----------------- |
| N > 80                | A 4.0              |
| N > 73 && N <= 80     | B+ 3.5             |
| N > 65 && N <= 73     | B 3.0              |
| N > 60 && N <= 65     | C+ 2.5             |
| N > 50 && N <= 60     | C 2.0              |
| N > 39 && N <= 50     | D 1.0              |
| N <= 39               | E 0                |

## ⚠️ Peringatan: Variabel Tertimpa (Code Smell)

Perlu diperhatikan bahwa variabel nilaiSetara dan kualifikasi dideklarasikan hanya sekali di awal dan digunakan untuk kedua mata kuliah.

Ini adalah kesalahan desain variabel scope yang umum terjadi. Nilai yang ditetapkan untuk Mata Kuliah Algoritma akan tertimpa dan hilang saat program memproses Nilai Mata Kuliah Struktur Data. Meskipun output tabel Anda hanya menggunakan nilaiHuruf (yang sudah terpisah) dan status (yang sudah terpisah), penggunaan variabel nilaiSetara dan kualifikasi yang tidak terpisah dapat menyebabkan bug serius jika nilai tersebut digunakan dalam perhitungan lebih lanjut.
**Status Kelulusan**

- Status Mata Kuliah: Ditentukan menggunakan Ternary Operator: LULUS jika Nilai Akhir >= 60, selain itu TIDAK LULUS.
- Status Semester: LULUS jika Rata-rata Nilai Akhir >= 70.

Kontributor
[GreedLynx]
[-]

Lisensi
This project is licensed under the - License.
