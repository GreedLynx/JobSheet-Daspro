import java.util.Scanner;

public class StudiKasusModifikasi20 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int gaji_pokok, tunjangan, jml_anak;
            double potongan_dana_pensiun = 0.05, gaji_bersih, dana_pensiun, total_gaji;
            String nama;

            System.out.print("Masukan nama Anda = ");
            nama = sc.nextLine();

            System.out.println("Halo!" + nama);
            System.out.println("Masukan gaji pokok Anda = ");
            gaji_pokok = sc.nextInt();

            System.out.println("Masukan jumlah anak anda Anda adalah = ");
            jml_anak = sc.nextInt();

            tunjangan = 150000 * jml_anak;
            System.out.println("Jumlah tunjangan Anda adalah = " + tunjangan);

            dana_pensiun = gaji_pokok * potongan_dana_pensiun;
            System.out.println("Jumlah potongan untuk dana pensiun Anda adalah = " + dana_pensiun);

            total_gaji = gaji_pokok - dana_pensiun;
            System.out.println("Total gaji pokok Anda setelah dipotong untuk dana pensiun  = " + total_gaji);
            
            gaji_bersih = total_gaji + tunjangan;
            System.out.println("Gaji bersih Anda adalah = " + gaji_bersih);
        }
    }
}
