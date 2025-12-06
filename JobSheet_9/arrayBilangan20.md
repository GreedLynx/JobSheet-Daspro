# Laporan Jobsheet: Analisis Array dan Perulangan

## 📄 Analisis Kode Program Awal (arrayBilangan20.java)
Program ini mendeklarasikan dan menginisialisasi sebuah array satu dimensi (bilangan) dengan tipe data int (bilangan bulat) dan ukuran 4. Program kemudian mengisi setiap elemen array secara terpisah dan mencetak isinya.

| Baris Kode | Konsep | Keterangan |
| :---: | :---: | :---: |
| int[] bilangan = new int[4]; | Deklarasi Array | Membuat array bernama bilangan yang dapat menampung 4 nilai int. | 
| bilangan[0] = 10; | Akses/Inisialisasi Elemen	| Mengisi elemen pada indeks ke-0 dengan nilai 10. |

## ❓ Jawaban Pertanyaan Analisis dan Modifikasi
1. Jika masing-masing elemen array diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?
* Jawabannya: Program akan mengalami kesalahan kompilasi (compile error) karena adanya ketidaksesuaian tipe data (type mismatch).

* Alasan: Array bilangan dideklarasikan sebagai tipe int (bilangan bulat). Nilai 5.0 dan 7.5 adalah bilangan riil (tipe double atau float). Java tidak mengizinkan penetapan nilai double ke array int secara otomatis.

2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus pada saat deklarasi array.
Modifikasi dilakukan dengan menghilangkan deklarasi ukuran new int[4] dan menggantinya dengan nilai di dalam kurung kurawal ({}).
```java
public class arrayBilangan20Modif {
    public static void main(String[] args) {
        // MODIFIKASI: Inisialisasi Langsung saat Deklarasi
        int[] bilangan = {10, 20, -30, 40};
        
        // ... (lanjutan kode) ...
    }
}
```
3. Ubah statement pada langkah No 4 menjadi perulangan FOR. Apa keluaran dari program? Jelaskan maksud dari statement tersebut.
* Output akan menjadi:
    * 10
    * 20
    * -30
    * 40
* Keluaran Program: Program mencetak semua nilai array secara berurutan.
* Maksud Statement: Perintah for loop ini digunakan untuk mengakses elemen array secara berulang dari indeks pertama (i=0) hingga indeks terakhir (i < 4, yaitu $i=3$). Pernyataan System.out.println(bil[i]); mencetak nilai yang tersimpan pada indeks i saat ini.

4. Jika kondisi pada statement for-loop di atas diubah menjadi i <= 4, apa keluaran dari program? Mengapa demikian?
* Keluaran Program: Program akan mencetak empat nilai pertama (10, 20, -30, 40) dan kemudian berhenti dengan error ArrayIndexOutOfBoundsException.
* Mengapa Demikian: Array bilangan memiliki ukuran 4, yang berarti indeks validnya hanya $0, 1, 2,$ dan $3$. Kondisi i <= 4 membuat loop mencoba mengakses indeks ke-4. Karena indeks 4 tidak ada, Java Runtime Environment (JRE) menghentikan program karena batas array telah dilampaui.