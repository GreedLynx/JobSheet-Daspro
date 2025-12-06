# Laporan Percobaan: Analisis Perulangan Bersarang (Nested Loop)
Analisis program Square20.java yang menggunakan perulangan luar (Outer Loop) dan perulangan dalam (Inner Loop) untuk mengontrol pencetakan baris dan kolom.

## 📄 Analisis Kode Dasar

|Perulangan Luar (Outer) | for (int i = 1; i <= n; i++) | Mengontrol jumlah Baris yang akan dicetak (total N baris). | 
| :---: | :---: | :---: | 
| Perulangan Dalam (Inner) | for (int j = 1; j <= n; j++) | Mengontrol jumlah Kolom yang dicetak di setiap baris (total N bintang per baris). | 
| Pencetak Baris Baru | System.out.println() | Memastikan setiap iterasi luar selesai dengan pindah ke baris baru. |

## ❓ Jawaban Pertanyaan Analisis
1. Perhatikan perulangan luar. Jika pada sintaks for, inisialisasi iOuter=1 diubah menjadi iOuter=0, apa akibatnya? Mengapa bisa demikian?
* Akibatnya: Program akan mencetak satu baris tambahan bintang. Jika input N=5, output akan menjadi 6 baris bintang.
* Mengapa: Kode dasar menggunakan kondisi i <= n. Inisialisasi i=0 menyebabkan iterasi dimulai dari 0 dan berakhir pada N. Jumlah iterasi menjadi N + 1 (dari 0 sampai N), sehingga mencetak satu baris lebih banyak.

2. Kembalikan program semula... Kemudian perhatikan perulangan dalam. Jika pada sintaks for, inisialisasi i=1 diubah menjadi i=0, apa yang akibatnya? Mengapa bisa demikian?
* Akibatnya: Program akan mencetak satu bintang tambahan di setiap baris. Jika input N=5, setiap baris akan memiliki 6 bintang (bukan 5).
* Mengapa: Perulangan dalam (j) mengontrol jumlah bintang per baris. Mengubah inisialisasi dari j=1 menjadi j=0 membuat iterasi berjalan sebanyak N+1 kali (dari 0 sampai N). Karena iterasi dalam dicetak ke samping, setiap baris bertambah satu bintang.

3. Apakah perbedaan kegunaan antara perulangan luar dengan perulangan yang berada di dalamnya?

| Perulangan | Kegunaan Utama | 
| :---: | :---: |
| Luar (Outer Loop) | Mengontrol Iterasi Utama dan Struktur Vertikal (Baris). Perulangan ini berjalan sekali untuk setiap baris, menentukan kapan alur pindah ke level berikutnya. |
| Dalam (Inner Loop) | Mengontrol Detail Proses dan Struktur Horizontal (Kolom). Perulangan ini bertanggung jawab untuk mengeksekusi aksi berulang (seperti mencetak satu bintang) sebanyak $N$ kali untuk setiap satu iterasi perulangan luar. |

4. Mengapa perlu ditambahkan sintaks System.out.println(); di bawah perulangan dalam? Apa akibatnya jika sintaks tersebut dihilangkan?
* Mengapa Perlu: Perintah System.out.print("*") di perulangan dalam hanya mencetak karakter bintang secara horizontal tanpa ganti baris. Sintaks System.out.println() berfungsi sebagai pencetak baris baru atau penanda akhir baris.
* Akibat Jika Dihilangkan: Program akan mencetak semua bintang (semua iterasi luar dan dalam) dalam satu baris panjang tunggal, bukan dalam bentuk persegi N * N.



