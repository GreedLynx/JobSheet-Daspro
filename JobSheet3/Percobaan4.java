import java.util.Scanner;

public class Percobaan4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int gaji_pokok, tunjangan_transport = 600000, tunjangan_makan = 400000;
            double total_gaji, bonus;
            System.out.println("Masukan gaji pokok Anda = ");
            gaji_pokok = input.nextInt();
            bonus = 0.05 * gaji_pokok;
            System.out.println("Bonus Anda adalah = " + bonus);
            total_gaji = gaji_pokok+tunjangan_makan+tunjangan_transport-0.1*gaji_pokok;
            System.out.println("Total gaji Anda sebesar = " + (int)total_gaji);
        }
    }
}
