import java.util.Scanner;

public class arrayRataNilai20Modif {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            
            // MODIFIKASI 1: Menerima ukuran array secara dinamis
            System.out.print("Masukkan jumlah mahasiswa : ");
            int jmlMhs = input.nextInt(); // Ukuran N dari pengguna
            int[] nilaiMhs = new int[jmlMhs]; // Array dibuat dengan ukuran dinamis
            
            // MODIFIKASI 2: Variabel akumulator berganda
            double totalLulus = 0;
            double totalTidakLulus = 0;
            int countLulus = 0;
            int countTidakLulus = 0;

            // --- PERULANGAN INPUT ---
            for (int i = 0; i < nilaiMhs.length; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
                nilaiMhs[i] = input.nextInt();
            }
            
            // --- PERULANGAN AKUMULASI BERSYARAT ---
            for (int i = 0; i < nilaiMhs.length; i++) {
                // Kriteria Kelulusan: Nilai > 70
                if (nilaiMhs[i] > 70) {
                    totalLulus += nilaiMhs[i];
                    countLulus++;
                } else {
                    // Blok ELSE: Untuk yang Tidak Lulus (Nilai <= 70)
                    totalTidakLulus += nilaiMhs[i];
                    countTidakLulus++;
                }
            }

            // --- PERHITUNGAN RATA-RATA AKHIR ---
            double rataRataLulus = (countLulus > 0) ? (totalLulus / countLulus) : 0.0;
            double rataRataTidakLulus = (countTidakLulus > 0) ? (totalTidakLulus / countTidakLulus) : 0.0;

            // --- OUTPUT (Sesuai Ilustrasi) ---
            System.out.println("\n---------------- OUTPUT ------------------");
            System.out.printf("Rata-rata nilai lulus = %.1f\n", rataRataLulus);
            System.out.printf("Rata-rata nilai tidak lulus = %.1f\n", rataRataTidakLulus);
            System.out.println("------------------------------------------");
        }
    }
}