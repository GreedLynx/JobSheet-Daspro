//package JobSheet_9;

import java.util.Scanner;

public class searchNilai20Modif {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            
            // MODIFIKASI 1: Input Ukuran Array Dinamis
            System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
            int jml = input.nextInt(); 
            int[] arrNilai = new int[jml]; // Array dengan ukuran N
            
            // Variabel untuk melacak status penemuan (Sentinel)
            int indeksDitemukan = -1; // Inisialisasi -1 menunjukkan "tidak ditemukan"
            
            // --- LOOP INPUT (Mengisi Array) ---
            for (int i = 0; i < arrNilai.length; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
                arrNilai[i] = input.nextInt();
            }
            
            // --- INPUT KEY ---
            System.out.print("Masukkan nilai yang ingin dicari: ");
            int key = input.nextInt();
            
            // --- LOOP PENCARIAN LINIER ---
            for (int i = 0; i < arrNilai.length; i++) {
                if (arrNilai[i] == key) {
                    indeksDitemukan = i; // Catat indeks saat ditemukan
                    break; // Hentikan perulangan (sesuai fungsi break)
                }
            }
            
            // --- OUTPUT AKHIR (Menggabungkan Pertanyaan 2 & 3) ---
            System.out.println();
            
            // Logika Pemilihan (IF-ELSE) untuk menampilkan hasil
            if (indeksDitemukan != -1) {
                // Output sesuai contoh no. 2
                // (Nilai i+1 karena output untuk pengguna dimulai dari 1)
                System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (indeksDitemukan + 1));
            } else {
                // Output sesuai contoh no. 3
                System.out.println("Nilai yang dicari tidak ditemukan");
            }
        }
    }
}