package JobSheet_8;

import java.util.Scanner;

public class kuadratBilangan {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int totalKuadrat = 0;
            String deret = ""; // Digunakan untuk mencetak deret (1 + 4 + 9 + ...)
            System.out.print("Masukan nilai n = ");
            int n = input.nextInt();

            for (int i = 1; i <= n; i++) { 
                int kuadrat = i * i; // Menghitung kuadrat bilangan 'i' saat ini
                totalKuadrat += kuadrat; // Akumulasi total kuadrat
                if (i > 1) {
                    deret += " + "; // Menambahkan tanda '+' sebelum bilangan kuadrat berikutnya
                }
                deret += kuadrat; // Menambahkan bilangan kuadrat ke deret
                System.out.println("n = " + i + " → jumlah kuadrat = " + deret + " = " + totalKuadrat);
            }
        }
    }
}
