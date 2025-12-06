# Laporan Jobsheet: Analisis Variabel Akumulator dan Perulangan Bersarang

## 📄 Analisis Kode Program Awal
Program ini menggunakan Perulangan Bersarang (Nested Loop) untuk mengumpulkan 5 nilai penilai (Inner Loop) untuk 6 kelompok (Outer Loop).

## ❓ Jawaban Pertanyaan dan Modifikasi
1. Jelaskan apa yang terjadi pada variabel totalNilai di setiap iterasi outer loop dan mengapa inisialisasinya (total = 0) harus berada di dalam outer loop, bukan di luar.
* Yang Terjadi pada Setiap Iterasi Outer Loop: Variabel totalNilai akan terus bertambah secara akumulatif (menumpuk). Ketika Outer Loop berpindah dari Kelompok 1 ke Kelompok 2, totalNilai Kelompok 1 tidak dihilangkan, sehingga rata-rata yang dicetak adalah rata-rata gabungan dari semua kelompok sebelumnya.
* Mengapa Harus di Dalam Outer Loop: Inisialisasi (totalNilai = 0) harus diletakkan di dalam Outer Loop (sebelum Inner Loop dimulai) karena setiap kelompok (Outer Loop) adalah entitas perhitungan yang mandiri. Peletakan di dalam Outer Loop memastikan totalNilai diatur ulang menjadi nol pada setiap kelompok baru, sehingga akumulasi hanya menghitung nilai untuk kelompok tersebut saja.

2. Modifikasi program di atas, sehingga dapat mencari kelompok dengan rata-rata nilai tertinggi dan tampilkan nomor kelompok tersebut.
**Modifikasi dilakukan dengan tiga langkah:**

* Memindahkan inisialisasi totalNilai ke dalam Outer Loop (perbaikan bug akumulasi).

* Menambahkan variabel rataTertinggi dan kelompokTertinggi untuk melacak rekor.

* Menambahkan struktur IF sederhana di akhir Outer Loop untuk membandingkan rataNilai saat ini dengan rataTertinggi yang tercatat.

**🛠️ Perbandingan Kode Modifikasi (Fokus Perubahan)**

| Kode SEBELUM Modifikasi (Asli) | Kode SETELAH Modifikasi (Penambahan Logika) |
| :---: | :---: | 
| java float totalNilai = 0, rataNilai;	| java float totalNilai, rataNilai; |
| java for (i = 1; i <= 6; i++){ | java float rataTertinggi = 0; |
| (totalNilai di luar)	| java int kelompokTertinggi = 0; |
|                        | java for (i = 1; i <= 6; i++){ |
|                        | java totalNilai = 0; // PERBAIKAN: Reset di sini |
| java totalNilai += nilai; | java totalNilai += nilai; |
| java rataNilai = totalNilai / 5; | java rataNilai = totalNilai / 5; |
| (Tidak ada pengecekan rekor) | java if (rataNilai > rataTertinggi) { |
|                            | java rataTertinggi = rataNilai; // Catat rekor baru |
|                            | java kelompokTertinggi = i; // Catat nomor kelompok |
|                            | java } |
| (Output di dalam loop) | java // OUTPUT AKHIR DILUAR LOOP UNTUK HASIL TERTINGGI | 
| (Output di dalam loop) | java System.out.println("Nomor kelompok dengan rata-rata tertinggi adalah: Kelompok " + kelompokTertinggi); | 