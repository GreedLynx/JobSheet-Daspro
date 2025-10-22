# Laporan Implementasi Flowchart: Sistem Pembayaran Parkir

## 📄Analisis Kode Program Awal
Program bayarParkir.java mengimplementasikan logika pembayaran parkir yang diberikan dalam flowchart, menggunakan perulangan DO-WHILE dan struktur IF-ELSE IF bertingkat.

1. Analisis Struktur Program
A. Perulangan Utama (DO-WHILE)
| Kode | Keterangan | Kesimpulan | 
| :--- | :--- | :--- |
| do { ... } while (jenis != 0); | Program menggunakan DO-WHILE untuk memastikan input minimal terjadi satu kali. Perulangan akan terus meminta input jenis kendaraan selama jenis yang dimasukkan bukan 0. | Sesuai Flowchart. Flowchart menggunakan WHILE (jenis != 0) di bagian bawah, yang secara fungsi sama dengan DO-WHILE (jenis != 0). |   

B. Logika Validasi Jenis Kendaraan
| Kode | Keterangan |
| :--- | :--- |
| **`if (jenis == 1 ) | 
| else if (jenis != 0) | Menangkap semua angka yang bukan 1, 2, dan bukan 0. |
| Pesan Error | Jika ini dieksekusi, program mencetak: "❌ Jenis kendaraan tidak valid. Mohon masukkan 1, 2, atau 0. |

C. Logika Perhitungan Tarif (Nested If-Else If)
Logika tarif di dalam if (jenis == 1 || jenis == 2) menggunakan struktur bertingkat (bersarang) untuk menentukan tarif.
| Kode | Logika | Tarif yang Diterapkan |
| :--- | :--- | :--- |
| if (durasi > 5)Kondisi 1 (Tarif Tetap): Jika durasi parkir lebih dari 5 jam. | Rp 12.500 (total += 12500). | 
| else if (jenis == 1) | Kondisi 2 (Mobil): Jika durasi <= 5 DAN jenisnya Mobil. | Rp 3.000/jam (total += durasi * 3000). | 
| else | Kondisi 3 (Motor): Jika kondisi 1 dan 2 salah, maka durasi <= 5 DAN jenisnya pasti Motor. | Rp 2.000/jam (total += durasi * 2000). |

2. Implementasi dan Perbandingan dengan Flowchart
Program Anda berhasil mengimplementasikan flowchart dengan baik:

* Inisialisasi: Variabel total diinisialisasi 0 di awal.

* Perulangan: DO-WHILE digunakan untuk mengulang input jenis kendaraan sampai jenis == 0.

* Percabangan: Struktur IF-ELSE IF yang bersarang sudah sesuai dengan alur keputusan pada flowchart, yaitu menguji durasi dulu, baru menguji jenis kendaraan.

* Operator: Penggunaan || (OR) di awal alur adalah implementasi yang tepat untuk menggabungkan kondisi jenis == 1 dan jenis == 2.

Program ini adalah contoh yang sangat baik dalam menggabungkan perulangan dan percabangan bersarang untuk menyelesaikan studi kasus akulumasi transaksi.

3. Catatan Tambahan (Observasi Kode)
* Akumulasi Total: Perhitungan tarif menggunakan total += ... yang berarti biaya ditambahkan ke total harga transaksi sebelumnya. Ini mengasumsikan program mencatat total omset dari beberapa transaksi, bukan hanya menghitung biaya satu kendaraan.

* Output Per Iterasi: System.out.println("Biaya parkir kendaraan Anda adalah : Rp."+ total); dicetak di akhir setiap perulangan, menunjukkan total omset saat ini setelah transaksi barusan.