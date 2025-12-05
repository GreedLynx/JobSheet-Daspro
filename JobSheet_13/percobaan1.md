# Laporan JobSheet 12 Percobaan 1

## 📄 Analisis Kode Program (percobaan1.java)
Program ini menghitung nilai faktorial dari sebuah bilangan (int angka = 5) menggunakan dua metode berbeda: Rekursif (faktorialRekursif) dan Iteratif (faktorialIteratif).

| Fungsi | Struktur Kontrol | Konsep Kunci |
| :---: | :---: | :---: |
| faktorialRekursif |	IF-ELSE	| Mengulang dengan memanggil dirinya sendiri. |
| faktorialIteratif	| FOR Loop	| Mengulang dengan struktur repetisi/pengulangan. |

## ❓ Jawaban Pertanyaan
1. Apa yang dimaksud dengan fungsi rekursif?
Fungsi rekursif adalah sebuah fungsi yang di dalamnya terdapat perintah untuk memanggil fungsi itu sendiri. Dengan demikian, proses pemanggilan fungsi akan terjadi secara berulang-ulang.

2. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan fungsi rekursif dan fungsi iteratif!

**A. Kesamaan Hasil**
Ya, hasilnya sama. Kedua fungsi dirancang untuk menghitung hasil matematika yang sama (5! = 120). Perbedaannya terletak pada cara mereka mencapai hasil tersebut.

**B. Perbedaan Alur Jalan Program**
| Fitur	| Fungsi Rekursif (faktorialRekursif) | Fungsi Iteratif (faktorialIteratif) |
| :---: | :---: | :---: |
| Mekanisme Pengulangan	| Menggunakan struktur seleksi (IF-ELSE) dan memanggil dirinya sendiri. | Menggunakan struktur repetisi/pengulangan (FOR atau WHILE). |
| Fase Eksekusi	| Melalui dua fase: Ekspansi (pemanggilan bertingkat hingga Base Case) dan Substitusi (perhitungan mundur dari Base Case ke hasil akhir). | Hanya satu fase: Perintah dieksekusi secara berurutan dalam satu fungsi hingga kondisi loop salah. |
| Kondisi Berhenti	| Berhenti saat Base Case (n == 0) terpenuhi. | Berhenti saat kondisi perulangan (i >= 1) bernilai FALSE. |
| Penggunaan Memori	| Membutuhkan lebih banyak memori karena memanggil banyak fungsi yang menumpuk di stack. | Membutuhkan memori lebih kecil karena pengulangan berada dalam satu fungsi saja. |