import java.util.Scanner;   

public class nilaiMhs20 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            // Deklarasi variabel
            double rataRata, nilaiTertinggi, nilaiTerendah, totalNilai = 0;
            int jumlahMhs;
            
            // Input jumlah mahasiswa
            System.out.print("Masukkan jumlah mahasiswa: ");
            jumlahMhs = input.nextInt();    
            double[] arrNilai = new double[jumlahMhs];

            // Input nilai mahasiswa
            for (int i = 0; i < jumlahMhs; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
                arrNilai[i] = input.nextDouble();
                totalNilai += arrNilai[i];
            }

            // Mencari nilai tertinggi dan terendah
            nilaiTertinggi = arrNilai[0];
            for (int i = 1; i < jumlahMhs; i++) {
                if (arrNilai[i] > nilaiTertinggi) {
                    nilaiTertinggi = arrNilai[i];
                }
            }
            nilaiTerendah = arrNilai[0];
            for (int i = 1; i < jumlahMhs; i++) {
                if (arrNilai[i] < nilaiTerendah) {
                    nilaiTerendah = arrNilai[i];
                }
            }
            rataRata = totalNilai / jumlahMhs;

            // Menampilkan hasil
            System.out.println("==================================");
            System.out.printf("Rata-rata nilai akhir dari %d mahasiswa adalah: %.2f%n", jumlahMhs, rataRata);
            System.out.printf("Nilai tertinggi: %.2f%n", nilaiTertinggi);
            System.out.printf("Nilai terendah: %.2f%n", nilaiTerendah);
        }
    }
}
