# Laporan Percobaan: Analisis Pola Segitiga dengan Nested WHILE
Analisis program Triangle20.java yang bertujuan mencetak pola segitiga siku-siku.

## ❓ Jawaban Pertanyaan Analisis
1. Perhatikan, apakah output yang dihasilkan dengan nilai n=5 sesuai dengan tampilan berikut?
* Jawabannya: Tidak sesuai, tetapi polanya mirip. 
* Pola yang diminta memiliki 5 baris bintang (1 bintang hingga 5 bintang). Namun, kode diatas akan menghasilkan 6 baris bintang (0 bintang hingga 5 bintang).
* output yang dihasilkan dari modifikasi perulangan tersebut (yaitu, inisialisasi i=1 diubah menjadi i=0, dengan asumsi input $n=5$) adalah sebagai berikut:* * * * * *

2. Jika tidak sesuai, bagian mana saja yang harus diperbaiki/ditambahkan? Jelaskan setiap bagian yang perlu diperbaiki/ditambahkan.Untuk membuat output sesuai dengan pola 5 baris bintang (1 hingga 5 bintang) ketika N=5, diperlukan dua perbaikan pada komponen perulangan:

| Bagian | Kode Asli | Kode Diperbaiki | Penjelasan Perbaikan | 
| :---: | :---: | :---: | :---: | 
| Inisialisasi i | int i = 0;int i = 1; | Memulai dari 1. Inisialisasi harus dimulai dari 1 untuk menghindari Baris 1 (di mana i=0) yang mencetak 0 bintang (baris kosong). | 
| Kondisi i | while (i <= n) | while (i <= n) | Tetap Sama. Kondisi i <= n sudah benar untuk memastikan perulangan berjalan N kali (misalnya, i=1 hingga i=5). | 

4. Jelaskan peran masing-masing variabel i dan j dalam program ini. Mengapa j di-set ulang ke 0 di awal setiap iterasi outer loop? Apa yang akan terjadi jika j tidak di-reset?
**Peran Variabel dalam Perulangan Bersarang**
* Variabel i (Outer Loop): Variabel ini berperan sebagai counter utama yang mengontrol jumlah baris yang akan dicetak secara vertikal. Dalam pola ini, nilai $i$ juga menentukan jumlah bintang yang harus dicetak di baris tersebut (j < i).
* Variabel j (Inner Loop): Variabel ini berperan sebagai counter kedua yang mengontrol jumlah kolom yang dicetak secara horizontal. Tugasnya adalah mengulang pencetakan bintang (*) untuk satu baris penuh.
**Mengapa j di-reset ke 0 di awal setiap iterasi Outer Loop?**
Variabel j diatur ulang ke 0 (int j = 0;) di awal setiap iterasi perulangan luar (while (i <= n)) karena:
* Setiap baris baru memerlukan hitungan bintang dari awal (nol).
* Perulangan luar (i) hanya bertanggung jawab untuk pindah baris. Perulangan dalam (j) harus dimulai ulang untuk mencetak i bintang pada baris tersebut.
**Apa yang akan terjadi jika j tidak di-reset?**
Jika j tidak di-reset, program akan mengalami kesalahan logika dan infinite loop (perulangan tak terbatas) atau kegagalan pencetakan.
* Pada iterasi pertama (i=0), j akan menjadi i (misalnya j=5).
* Pada iterasi kedua, j akan dipertahankan dari nilai sebelumnya (misalnya $j=5$), tetapi kondisi perulangan dalam (while (j < i)) mungkin tidak pernah terpenuhi jika $i$ lebih kecil dari nilai j sebelumnya, atau sebaliknya, loop akan berhenti terlalu cepat, atau jika j terus meningkat tanpa henti, akan menjadi infinite loop.