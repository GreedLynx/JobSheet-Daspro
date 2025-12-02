import java.util.Scanner;

public class percobaan3 {
    //deklarasi secara global scanner
    private static final Scanner input = new Scanner(System.in);
    
    static double hitungLaba(double saldo, int tahun){
        if (tahun == 0){
            return saldo; // Basis: saldo awal
        } else {
            return (1.11 * hitungLaba(saldo, tahun-1)); // Rekurens: saldo_tahun = 1.11 * saldo_(tahun-1)
        }
    }
    public static void main(String[] args) {
        //input data dari user adalah raja
        System.out.print("Masukkan saldo awal: ");
        double saldo = input.nextDouble();
        System.out.print("Masukkan jangka waktu (dalam tahun): ");
        int tahun = input.nextInt();

        //menampilkan hasil pemanggilan fungsi rekursif hitungLaba(laba)
        System.out.printf("Saldo setelah %d tahun adalah: %.2f %n", tahun, hitungLaba(saldo, tahun));
    }
}
