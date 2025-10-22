# Laporan Percobaan 2.2

## 📄Analisis Kode Program Awal
Program ini adalah contoh klasik dari aplikasi perulangan (WHILE) yang dikombinasikan dengan struktur pemilihan (IF-ELSE IF) untuk memproses data input berulang (nilai mahasiswa) dan memberikan feedback langsung (konversi nilai huruf).

## ❓Jawaban Pertanyaan 2.2
1. Maksud dan Kegunaan Sintaks Validasi Nilai
a. nilai < 0 || nilai > 100
|Komponen |	Maksud |
|:---|:---|
| nilai < 0 |	Kondisi relasional: Apakah variabel nilai lebih kecil dari 0? |
|**`|	
| nilai > 100 |	Kondisi relasional: Apakah variabel nilai lebih besar dari 100? |
| Kegunaan Keseluruhan | Ekspresi ini akan bernilai TRUE jika Nilai yang diinput berada di luar jangkauan valid (yaitu < 0 ATAU > 100). Ini digunakan untuk memicu pesan kesalahan dan penanganan input yang tidak valid. |

b. continue
| Maksud | Kegunaan dalam Perulangan |
|:---|:---|
| continue | Pernyataan continue berfungsi untuk melewatkan satu iterasi (satu putaran) perulangan saat ini, tetapi perulangan tetap dilanjutkan ke iterasi berikutnya. |
| Kegunaan di Kode | Jika nilai tidak valid (TRUE), perintah continue akan dieksekusi. Semua kode di bawahnya (termasuk penambahan counter i dalam FOR atau baris yang tersisa) akan dilewati, dan program langsung meminta input nilai lagi di putaran berikutnya. |

2. Sintaks i++ dalam Perulangan WHILE
Catatan: Meskipun kode ini menggunakan FOR, pertanyaan ini berfokus pada WHILE yang setara (i++ disebut sebagai update).
| Posisi | Maksud | Konsekuensi Jika Salah |
|:---|:---|:---|
| Di Akhir (Posisi yang benar) | i++ dijalankan setelah seluruh blok kode di dalam WHILE selesai diproses. | Memastikan setiap data diproses satu kali sebelum i dinaikkan dan kondisi diuji ulang. |
| Di Awal (Posisi yang salah) | i++ dijalankan tepat setelah kondisi WHILE dicek dan sebelum memproses data input. | Iterasi pertama akan dilewatkan (karena i akan langsung menjadi 1), dan data terakhir tidak terproses (karena i mencapai batas terlalu cepat). |

3. Jumlah Perulangan WHILE 
Apabila jumlah mahasiswa yang dimasukkan adalah 19, perulangan WHILE akan berjalan sebanyak 19 kali.

Kondisi: while (i < 19)
Iterasi: Perulangan akan berjalan untuk i = 0, 1, 2, ..., hingga 18.
Terakhir: Saat i menjadi 19, kondisi (19 < 19) menjadi FALSE, dan perulangan berhenti.

4. Modifikasi Kode Program (Menambahkan Pesan Nilai A)
Modifikasi ini menambahkan struktur IF untuk memeriksa apakah nilai yang diinput berada dalam kategori Nilai A (nilai > 80 && nilai <= 100), dan mencetak pesan tambahan.

A. Kode Asli (Tidak Ada Pengecekan Nilai A)
Kode asli Anda di dalam blok for (sebelum modifikasi untuk No. 4) hanya memiliki logika pencarian tertinggi/terendah:
```java
// KODE ASLI DI DALAM PERULANGAN FOR
for (int i = 0; i < 10; i++) {
    // ... Input nilai ...
    if(nilai > tertinggi){
        tertinggi = nilai;
    }
    if(nilai < terendah){
        terendah = nilai;
    }
}
```

B. Kode Setelah Dimodifikasi/Ditambah
Berikut adalah baris kode baru yang ditambahkan untuk memenuhi permintaan. Kode ini menggunakan struktur IF sederhana di dalam perulangan untuk mengecek Nilai A.
```java
// KODE YANG DIMODIFIKASI (BAGIAN PENAMBAHAN)
for (int i = 0; i < 10; i++) {
    System.out.print("Masukkan nilai mahasiswa ke-"+ (i+1)+":");
    nilai = input.nextDouble();
    
    // --- PENAMBAHAN UNTUK NO. 4 ---
    // Logika Pemilihan (IF) untuk Nilai A
    if (nilai > 80 && nilai <= 100) { 
        System.out.println("Bagus, pertahankan nilainya!");
    }
    // -----------------------------
    
    // Logika pencarian Tertinggi/Terendah yang sudah ada
    if(nilai > tertinggi){
        tertinggi = nilai;
    }
    if(nilai < terendah){
        terendah = nilai;
    }
}
```
