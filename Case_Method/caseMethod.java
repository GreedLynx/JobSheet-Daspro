import java.util.Scanner;

public class caseMethod {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            String nama, nilaiHurufAlgo, nilaiHurufStruktur, kualifikasi;
            double nilaiAkhirAlgo, nilaiSetara, nilaiAkhirStruktur;
            int NIM, nilaiUtsAlgo, nilaiUasAlgo, nilaiTugasAlgo, nilaiUtsStruktur, nilaiUasStruktur, nilaiTugasStruktur;

            //input data mahasiswa
            System.out.println("===== INPUT DATA MAHASISWA =====");
            System.out.print("Masukan nama Anda: ");
            nama = input.nextLine();

            System.out.print("Masukan NIM Anda: ");
            NIM = input.nextInt();

            //input data nilai Algoritma dan pemrograman
            System.out.println("--- Mata Kuliah 1 : Algoritma dan pemrograman ---");
            System.out.print("Masukan nilai UTS algoritma dan pemrograman Anda: ");
            nilaiUtsAlgo = input.nextInt();

            System.out.print("Masukan nilai UAS algoritma dan pemrograman Anda: ");
            nilaiUasAlgo = input.nextInt();

            System.out.print("Masukan nilai Tugas algoritma dan pemrograman Anda: ");
            nilaiTugasAlgo = input.nextInt();

            //input data nilai Struktur data
            System.out.println("--- Mata Kuliah 2 : Struktur data ---");
            System.out.print("Masukan nilai UTS Struktur data Anda: ");
            nilaiUtsStruktur = input.nextInt();

            System.out.print("Masukan nilai UAS Struktur data Anda: ");
            nilaiUasStruktur = input.nextInt();

            System.out.print("Masukan nilai Tugas Struktur data Anda: ");
            nilaiTugasStruktur = input.nextInt();

            nilaiAkhirAlgo = (nilaiUtsAlgo*0.3) + (nilaiUasAlgo*0.4) + (nilaiTugasAlgo*0.3);
            nilaiAkhirStruktur = (nilaiUtsStruktur*0.3) + (nilaiUasStruktur*0.4) + (nilaiTugasStruktur*0.3);
            double rataRataNilaiAkhir = (nilaiAkhirAlgo + nilaiAkhirStruktur) / 2.0;

            if(nilaiAkhirAlgo > 80 && nilaiAkhirAlgo <= 100){
                nilaiHurufAlgo = "A";
                nilaiSetara = 4.0;
                kualifikasi = "Sangat baik";
            } else if(nilaiAkhirAlgo > 73 && nilaiAkhirAlgo <= 80){
                nilaiHurufAlgo = "B+";
                nilaiSetara = 3.5;
                kualifikasi = "Lebih dari Baik";
            } else if(nilaiAkhirAlgo > 65 && nilaiAkhirAlgo <= 73){
                nilaiHurufAlgo = "B";
                nilaiSetara = 3.0;
                kualifikasi = "Baik";
            } else if (nilaiAkhirAlgo > 60 && nilaiAkhirAlgo <= 65){
                nilaiHurufAlgo = "C+";
                nilaiSetara = 2.5;
                kualifikasi = "Lebih dari Cukup";
            } else if (nilaiAkhirAlgo > 50 && nilaiAkhirAlgo <= 60){
                nilaiHurufAlgo = "C";
                nilaiSetara = 2.0;
                kualifikasi = "Cukup";
            } else if (nilaiAkhirAlgo > 39 && nilaiAkhirAlgo <= 50){
                nilaiHurufAlgo = "D";
                nilaiSetara = 1.0;
                kualifikasi = "Kurang";
            } else {
                nilaiHurufAlgo = "E";
                nilaiSetara = 0;
                kualifikasi = "Gagal";
            }
            
            //kondisi nilai 
            if(nilaiAkhirStruktur > 80 && nilaiAkhirStruktur <= 100){
                nilaiHurufStruktur = "A";
                nilaiSetara = 4.0;
                kualifikasi = "Sangat baik";
            } else if(nilaiAkhirStruktur > 73 && nilaiAkhirStruktur <= 80){
                nilaiHurufStruktur = "B+";
                nilaiSetara = 3.5;
                kualifikasi = "Lebih dari Baik";
            } else if(nilaiAkhirStruktur > 65 && nilaiAkhirStruktur <= 73){
                nilaiHurufStruktur = "B";
                nilaiSetara = 3.0;
                kualifikasi = "Baik";
            } else if (nilaiAkhirStruktur > 60 && nilaiAkhirStruktur <= 65){
                nilaiHurufStruktur = "C+";
                nilaiSetara = 2.5;
                kualifikasi = "Lebih dari Cukup";
            } else if (nilaiAkhirStruktur > 50 && nilaiAkhirStruktur <= 60){
                nilaiHurufStruktur = "C";
                nilaiSetara = 2.0;
                kualifikasi = "Cukup";
            } else if (nilaiAkhirStruktur > 39 && nilaiAkhirStruktur <= 50){
                nilaiHurufStruktur = "D";
                nilaiSetara = 1.0;
                kualifikasi = "Kurang";
            } else {
                nilaiHurufStruktur = "E";
                nilaiSetara = 0;
                kualifikasi = "Gagal";
            }

            String statusAlgo = (nilaiAkhirAlgo >= 60) ? "LULUS" : "TIDAK LULUS";
            String statusStruktur = (nilaiAkhirStruktur >= 60) ? "LULUS" : "TIDAK LULUS";
            
            // Tentukan Status Semester (Rata-rata >= 70)
            String statusSemester = (rataRataNilaiAkhir >= 70) 
                ? "LULUS" 
                : "TIDAK LULUS (Rata-rata < 70)";

            System.out.println("\n\n============ HASIL PENILAIAN AKADEMIK ============");
            System.out.println("Nama : " + nama);
            System.out.println("NIM  : " + NIM);
            System.out.println("--------------------------------------------------");
            
            // Header Tabel
            System.out.printf("%-20s %-5s %-5s %-5s %-10s %-10s %s\n", 
            "Mata Kuliah", "UTS", "UAS", "Tugas", "Nilai Akhir", "Nilai Huruf", "Status");
            System.out.println("--------------------------------------------------");
            
            // Data Matkul 1: Algoritma
            System.out.printf("%-20s %-5d %-5d %-5d %-10.2f %-10s %s\n", 
            "Algoritma Pemrograman", nilaiUtsAlgo, nilaiUasAlgo, nilaiTugasAlgo, nilaiAkhirAlgo, nilaiHurufAlgo, statusAlgo);

            // Data Matkul 2: Struktur Data
            System.out.printf("%-21s %-5d %-5d %-5d %-10.2f %-10s %s\n", 
            "Struktur Data", nilaiUtsStruktur, nilaiUasStruktur, nilaiTugasStruktur, nilaiAkhirStruktur, nilaiHurufStruktur, statusStruktur);

            System.out.println("--------------------------------------------------");

            // Hasil Akhir Semester
            System.out.printf("Rata-rata Nilai Akhir: %.2f\n", rataRataNilaiAkhir);
            System.out.println("Status Semester      : " + statusSemester);
        }
    }
}
