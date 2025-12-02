import java.util.Scanner;

public class TugasBesar {
    //deklarasi secara global scanner
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukan jumlah angka yang mau dihitung: ");
        int n = input.nextInt();

        int [] angkaDeret = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukan angka ke-" + (i + 1) + ": ");
            angkaDeret[i] = input.nextInt();
        }

        System.out.printf("total dari %d yang dimasukan adalah(dengan cara rekurtif): %d\n", n, deretRekurtif(n, angkaDeret));
        System.out.printf("total dari %d yang dimasukan adalah(dengan cara ineratif): %d", n, deretIteratif(n, angkaDeret));

    }

    static int deretRekurtif(int n, int[] deret) {
        if (n == 0) {
            return 0; // Basis: jika n = 0, array deret index 0 adalah 0
        } else {
            return deret[n-1] + deretRekurtif(n - 1, deret); // Rekurens: total = deret[n-1] + total dari deret[0] sampai deret[n-2]
        }
    }

    static int deretIteratif(int n, int [] deret) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += deret[i]; // Menambahkan nilai dari array deret[i] ke total
        }
        return total;
    }
}
