# Laporan JobSheet Percobaan 2  

## ❓Jawaban Pertanyaan 
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, 
pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() 
secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan 
dijalankan! 

Proses pemanggilan fungsi hitungPangkat() secara berulang akan berhenti ketika kasus dasar (Base Case) tercapai.

2. Tambahkan kode program untuk mencetak deret perhitungan pangkatnya. Contoh: 
hitungPangkat(2,5) dicetak 2x2x2x2x2x1 = 32
```java
//fungsi cetak deret rekursif
    static String cetakDeretRekursif (int x, int y){
        if (y == 0){
            return "1";
        } else {
            return x + " x " + cetakDeretRekursif(x, y - 1);
        }
    }
```