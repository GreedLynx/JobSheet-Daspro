import java.util.Scanner;

public class Bank20 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int jml_tabungan_awal, lama_menabung_dalam_tahun;
            double jml_tabungan_akhir, bunga, presentase_bunga=0.02;

            System.out.println("Masukan jumlah tabungan awal Anda = ");
            jml_tabungan_awal = sc.nextInt();

            System.out.println("Berapa lama Anda menabung = ");
            lama_menabung_dalam_tahun = sc.nextInt();

            bunga = lama_menabung_dalam_tahun*presentase_bunga*jml_tabungan_awal;
            jml_tabungan_akhir = bunga+jml_tabungan_awal;
            
            System.out.println("Bunga Anda adalah = " + bunga);
            System.out.println("Jumlah tabungan akhir Anda adalah = " + jml_tabungan_akhir);
        }
    }
}
