# Laporan Percobaan 2.3

## 📄Analisis Kode Program Awal
Program kafeDoWhile20.java menggunakan struktur perulangan DO-WHILE untuk memproses pesanan pelanggan secara terus-menerus hingga pengguna secara eksplisit memutuskan untuk keluar.

## ❓ Jawaban Pertanyaan 2.3
1. Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali adalah “batal”, maka berapa kali perulangan dilakukan?
* Perulangan akan dilakukan sebanyak satu kali.

* Alasan: Perulangan DO-WHILE menjamin blok kode di dalam do { ... } akan dieksekusi minimal satu kali sebelum kondisi diuji. Karena input "batal" dicek di dalam blok do dan memicu perintah break, perulangan akan berhenti di iterasi pertama tersebut.

2. Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut! 
* Kondisi berhenti perulangan ini bukanlah kondisi boolean pada sintaks while(true), melainkan perintah break yang bersarang di dalam struktur IF.

* Kondisi Berhenti: if(namaPelanggan.equalsIgnoreCase("batal")) { break; }

* Mekanisme: Perulangan dihentikan secara paksa (exit total) menggunakan pernyataan break ketika input namaPelanggan adalah "batal".

3. Apa fungsi dari penggunaan nilai true pada kondisi DO-WHILE? 
* Fungsi dari while(true) adalah untuk membuat perulangan tidak terbatas (infinite loop).

* Tujuan: Karena kondisi true akan selalu benar, perulangan ini dirancang untuk berjalan selamanya. Hal ini memaksa program untuk sepenuhnya bergantung pada pernyataan break (yang terletak di dalam blok if) sebagai satu-satunya mekanisme untuk menghentikan perulangan.

4. Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen inisialisasi dan update?
* Perulangan ini tetap berjalan karena perulangan DO-WHILE dalam kasus ini tidak bergantung pada counter (seperti i++) untuk menguji kondisi.

* Alasan: Perulangan ini adalah jenis Sentinel Loop (berhenti berdasarkan nilai input tertentu, yaitu "batal").

* Kondisinya adalah true, yang tidak pernah salah.

* Proses inisialisasi dan update (increment/decrement) hanya wajib ada pada perulangan yang berbasis counter (seperti FOR atau WHILE biasa).

* Karena perulangan ini hanya menunggu input spesifik untuk keluar (break), tidak ada variabel counter yang perlu diinisialisasi atau di-update.