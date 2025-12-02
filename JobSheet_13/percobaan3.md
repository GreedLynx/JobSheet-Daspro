# Laporan JobSheet Percobaan 3

## 📄 Analisis Kode Program (percobaan3.java)
Program ini menggunakan Fungsi Rekursif (hitungLaba) untuk menghitung total nilai investasi (saldo akhir) setelah $N$ tahun, dengan tingkat keuntungan tetap sebesar $11.7\%$ per tahun (diwakili oleh $1.11$ dalam perhitungan).

## ❓ Jawaban Pertanyaan
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!
Fungsi rekursif hitungLaba memiliki dua komponen penting untuk mengontrol pengulangan:
| Komponen Rekursif | Blok Kode Program | Fungsi | 
| Base Case (Kasus Dasar) | if (tahun == 0) { return saldo; } | Menghentikan rekursi saat jangka waktu investasi (tahun) mencapai nol. Nilai yang dikembalikan adalah saldo di tahun tersebut (saldo awal). | 
| Recursion Call (Panggilan Rekursi) | return (1.11 * hitungLaba(saldo, tahun-1)); | Mengulangi fungsi dengan parameter tahun yang dikurangi satu. Ini adalah reduction step yang membuat pemanggilan mendekati Base Case.| 

2. Jabarkan trace fase ekspansi dan fase substitusi algoritma perhitungan laba di atas jika diberikan nilai hitungLaba(100000, 3)
Berikut adalah tracing (penelusuran) eksekusi fungsi hitungLaba dengan Saldo Awal = 100.000 dan Tahun = 3.
**A. Fase Ekspansi (Menuju Base Case)**
Fase ini adalah proses pemanggilan fungsi secara berulang dan menumpuk operasi perkalian yang tertunda. Berhenti saat tahun mencapai 0.
| Pemanggilan Fungsi | Parameter (saldo, tahun) | Operasi yang Ditunda| 
|:---:|:---:|:---:|
| 1. hitungLaba(100000, 3) | (100000, 3) | 1.11 * hitungLaba(100000, 2) |
| 2. hitungLaba(100000, 2) | (100000, 2) | 1.11 * hitungLaba(100000, 1) | 
| 3. hitungLaba(100000, 1) | (100000, 1) | 1.11 * hitungLaba(100000, 0) | 
| 4. hitungLaba(100000, 0) | (100000, 0) | BASE CASE return  100000| 

**B. Fase Substitusi (Menghitung Mundur)**
Solusi dihitung secara terbalik mulai dari nilai Base Case (100000).
| Langkah | Perhitungan | Hasil | 
| Sub 1 | 1.11 * 100000 (dari panggilan 3) | 111000.0 | 
| Sub 2 | 1.11 * 111000.0 (dari panggilan 2) | 123210.0 | 
| Sub 3 | 1.11 * 123210.0 (dari panggilan 1) | 136763.1 | 
Nilai Akhir: Saldo setelah 3 tahun adalah 136763.10 (setelah pembulatan dua desimal).