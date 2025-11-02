# Laporan Jobsheet 8: Kode Star20.java

## 📄 Analisis Kode Program Awal
Program Star20.java menggunakan struktur perulangan FOR untuk mencetak bintang dalam satu baris. Kode ini menggunakan tiga komponen perulangan: Inisialisasi (i=0), Kondisi (i <= n), dan Step (i++).

## ❓ Jawaban Pertanyaan Modifikasi FOR
1. Jika pada perulangan for, inisialisasi i=1 diubah menjadi i=0, apa akibatnya? Mengapa bisa demikian?
* Perulangan akan dilakukan sebanyak satu kali lebih sedikit dari kode dasar (n kali). 
* Alasan: Perulangan akan dimulai dari i=1 bukan i=0. Karena kondisi berhenti tetap i <= n, iterasi i=0 yang seharusnya berjalan (dan terjadi satu kali) dihilangkan.

2. Jika pada perulangan for, kondisi i <= n diubah menjadi i < n, bagaimana bentuk outputnya jika input n=5? Mengapa hasilnya berbeda?
* Bentuk output jika n=5 adalah 5 bintang tercetak. 
* Alasan: Perulangan akan berjalan 5 kali. Kondisi i < n membuat iterasi berhenti pada i=4. Iterasi untuk i=5 (yang terjadi saat kondisi i <= n bernilai **TRUE**) diabaikan karena batas maksimum (n) tidak diikutsertakan dalam pengecekan.

3. Jika pada perulangan for, kondisi i <= n diubah menjadi i > n, apa akibatnya? Mengapa bisa demikian?
* Perulangan akan dilakukan sebanyak nol kali.
* Alasan: Pada saat inisialisasi (i=0), kondisi baru (i > n, yaitu 0 > 5) akan langsung bernilai **FALSE**. Perulangan FOR mengecek kondisi di awal sebelum menjalankan loop, sehingga program langsung melompat ke akhir perulangan.

4. Jika pada perulangan for, kondisi step i++ diubah menjadi i--, apa akibatnya? Mengapa bisa demikian?
* Perulangan akan menjadi tak terbatas (infinite loop) dan terus mencetak bintang.
* Alasan: Nilai i dimulai dari 0 dan terus berkurang (-1, -2, -3,...). Kondisi i <= n (misalnya i <= 5) akan selalu benar karena i tidak pernah mencapai 5, menyebabkan perulangan tidak memiliki titik berhenti yang valid.

5. Jika pada perulangan, step i++ diubah menjadi i += 2, bagaimana pola outputnya jika input $n=6$? Apa yang menyebabkan perubahan tersebut?
* Bentuk output jika n=6 adalah 4 bintang tercetak (pada i=0, 2, 4, 6).
* Alasan: Operator i += 2 (Operator Assignment) membuat nilai i bertambah 2 di setiap iterasi. Iterasi menjadi jarang (skipping), sehingga total jumlah perulangan berkurang drastis (hanya i = 0, 2, 4, 6).