import java.util.Scanner;

public class pesan {
    
    // Variabel Scanner global (dideklarasikan di level kelas)
    // Dibuat static agar bisa digunakan oleh method static
    private static Scanner scanner = new Scanner(System.in); 
    
    // Fungsi dengan parameter (String pesan) dan nilai kembalian (int)
    public static int getInputInt(String pesan) { 
        System.out.print(pesan); // Tampilkan pesan yang diterima sebagai parameter
        int nilai = scanner.nextInt(); // Baca nilai int
        scanner.nextLine(); // Membersihkan buffer (wajib setelah nextInt/Double)
        return nilai; // Mengembalikan nilai integer ke pemanggil fungsi [cite: 3306]
    }
    
    // Fungsi dengan parameter (String pesan) dan nilai kembalian (String)
    public static String getInputString(String pesan) { 
        System.out.print(pesan);
        return scanner.nextLine(); 
    }

    public static void main(String[] args) {
        // Pemanggilan Fungsi di Method Main [cite: 3178]
        // Hasil dari fungsi disimpan dalam variabel lokal
        
        System.out.println("--- DEMO FUNGSI INPUT ---");

        // Contoh: Menggunakan fungsi untuk mendapatkan umur
        int umur = getInputInt("Masukkan Umur Anda: "); 

        // Contoh: Menggunakan fungsi untuk mendapatkan nama
        String nama = getInputString("Masukkan Nama Anda: "); 

        System.out.println("Halo, " + nama + "! Umur Anda adalah " + umur + " tahun.");
    }
}