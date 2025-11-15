# Laporan Jobsheet: Analisis Array 2D Tidak Beraturan (Ragged Array)

## 📄 Analisis Kode Program Awal (Numbers20.java)
Program ini menggunakan Array 2D yang dideklarasikan sebagai Ragged Array (tidak beraturan), di mana setiap baris memiliki jumlah kolom yang berbeda.

## ❓ Jawaban Pertanyaan Analisis dan Modifikasi
1. Tambahkan kode program sebagai berikut... 
```java
for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }
```

2. Apa fungsi dari Arrays.toString()?
* Fungsi Arrays.toString(): Fungsi ini digunakan untuk mengubah elemen-elemen di dalam sebuah array (satu dimensi) menjadi representasi String yang mudah dibaca. Ini sangat penting untuk debugging, karena mencetak array secara langsung akan menghasilkan alamat memori.

3. Apa nilai default untuk elemen pada array dengan tipe data int?
* Nilai Default: Nilai default untuk semua elemen pada array yang bertipe data int adalah nol (0).

4. Tambahkan kode program berikut... 
```java
for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i+1) + " : " + myNumbers[i].length);
        }
```

* Output yang Dihasilkan:
```
Panjang baris ke-1 : 5
Panjang baris ke-2 : 3
Panjang baris ke-3 : 1
```
* Fungsi: Perulangan ini secara spesifik mendemonstrasikan bahwa dalam Ragged Array, nilai myNumbers[i].length (panjang kolom) berbeda untuk setiap nilai i (baris).

5. Array myNumbers memiliki length berbeda untuk setiap barisnya. Apakah panjang array dapat dimodifikasi setelah diinstansiasi?
* Jawabannya: Tidak bisa (Secara Langsung).

* Alasan: Setelah array (myNumbers atau array barisnya) diinisialisasi dengan operator new (misalnya new int[5]), ukurannya akan tetap (fixed size) dan tidak dapat diubah lagi.

* Konteks Ragged Array: Meskipun array utama (myNumbers) tidak bisa dimodifikasi ukurannya (tetap 3 baris), Ragged Array memungkinkan kita untuk menetapkan panjang array yang berbeda untuk setiap baris, karena setiap baris adalah array 1D yang independen. Namun, setelah kita menetapkan myNumbers[0] = new int[5], baris 0 tidak dapat diubah menjadi panjang 6.