# Laporan Tugas: Program Penjualan Tiket Bioskop Harian
Program Java untuk menghitung total penjualan tiket dan menerapkan diskon berdasarkan kuantitas pembelian dalam satu hari.

## 📄 Ringkasan Tugas
Seorang pengelola bioskop ingin membuat program untuk menghitung total penjualan tiket dalam satu hari. Program harus menghitung total tiket yang terjual dan total harga penjualan tiket selama satu hari dengan ketentuan sebagai berikut:

Harga tiket: Rp 50.000 per tiket.

Jika pelanggan membeli lebih dari 4 tiket, mendapatkan diskon 10%.

Jika pelanggan membeli lebih dari 10 tiket, mendapatkan diskon 15%.

Input jumlah tiket tidak valid (negatif atau nol) harus diabaikan dan meminta input ulang.

## 💻 Analisis Kode Program (tiketBioskop.java)
1. Struktur Kontrol yang Digunakan:
| Struktur | Implementasi dalam Kode | Fungsi | 
|:---|:---|:---|
| Perulangan Utama | for (int i = 0; i < 5; i++) | Mengulangi proses penjualan dan input tiket sebanyak 5 kali (asumsi 5 transaksi). |
| Perulangan Input | do { ... } while (totalTiket <= 0); | Memastikan pengguna selalu memasukkan jumlah tiket yang valid ($\ge 1$). Jika input $\le 0$, perulangan akan meminta input ulang. | 
| Logika Diskon | if (totalTiket > 10) { ... } else if (totalTiket > 4) { ... } else { ... } | Menggunakan struktur IF-ELSE IF untuk menerapkan diskon. Pengecekan dimulai dari diskon terbesar (15%) untuk memastikan logika berjalan benar. | 
| Penghitungan Akumulatif | jumlahTiketSehari += totalTiket; dan totalHargaTiketSehari += totalHargaAkhir; | Menggunakan Operator Assignment (+=) untuk mengakumulasi total tiket dan total omset dari setiap iterasi/transaksi. |

2.  Logika Diskon (IF-ELSE IF)
Logika pemilihan diskon diimplementasikan dengan benar, memastikan diskon 15% diutamakan:
1. if (totalTiket > 10): Jika Benar, diterapkan Diskon 15%.
2. else if (totalTiket > 4): Jika kondisi 1 Salah, diterapkan Diskon 10%.
3. else: Jika kedua kondisi di atas salah (tiket $\le 4$), tidak ada diskon.

**📊 Hasil dan Output Program**
Program mencetak rincian diskon dan harga yang harus dibayar untuk setiap transaksi, dan di akhir mencetak laporan penjualan total.

Output Utama:
Output akhir program mencetak total tiket terjual dan total harga (omset) penjualan harian, setelah semua diskon diterapkan:
```
Jumlah tiket yang terjual hari ini adalah : Rp.[jumlah_total_tiket]
Total omset dari penjualan tiket yang sudah terjual hari ini : Rp.[total_omset_harian]
```