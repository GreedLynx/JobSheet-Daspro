import java.util.Scanner;

public class arrayNilai20 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int [] nilaiAkhir = new int[10];
            for (int i = 0; i < nilaiAkhir.length; i++) {
                System.out.print("Masukkan nilai akhir mahasiswa ke-" + (i + 1) + ": ");
                nilaiAkhir[i] = input.nextInt();
            }

            for (int i = 0; i < nilaiAkhir.length; i++) {
                System.out.println("Nilai akhir mahasiswa ke-" + (i + 1) + " adalah: " + nilaiAkhir[i]);
            }

        }
    }
}
