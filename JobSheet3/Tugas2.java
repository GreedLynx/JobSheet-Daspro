import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String args []){
        try (Scanner input = new Scanner(System.in)) {
            int jarak_tempuh,biaya_bensin,jml_bensin;
            //input data jarak tempuh
            System.out.println("Masukan jarak tempuh Anda = ");
            jarak_tempuh = input.nextInt();
            //menampilkan jarak tempuh dalam KM
            System.out.println("Jarak tempuh Anda adalah = " + jarak_tempuh + " KM");
            //menghitung jumlah bensin yang diperlukan
            jml_bensin = jarak_tempuh/2;
            //format rupiah
            NumberFormat rupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
            //menghitung biaya bensin yang diperlukan
            biaya_bensin = jarak_tempuh/2*10000;
            System.out.println("Total bensin yang perlu Anda keluarkan adalah "+ jml_bensin+ " liter");
            System.out.println("Total biaya bensin: " + rupiah.format(biaya_bensin));
            //penutup syntax scanner
        }
    }
}
