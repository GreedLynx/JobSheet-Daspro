import java.util.Scanner;

public class Tugas1 {
    public static void main(String args []){ 
        try (Scanner input = new Scanner(System.in)) {
            int harga, uang_muka, lama_cicilan;
            double bunga_perbulan, sisa_harga, cicilan_perbulan, total_bunga, total_cicilan;
            System.out.println("Masukan harga motor Rp ");
            harga = input.nextInt();
            System.out.println("Masukan jumlah uang muka Rp ");
            uang_muka = input.nextInt();
            System.out.println("Masukan lama cicilan = ");
            lama_cicilan = input.nextInt();
            sisa_harga = harga-uang_muka; //hitung sisa harga
            System.out.println("Sisa harga motor Rp " + sisa_harga);
            bunga_perbulan = 0.01*sisa_harga; //hitung bunga perbulan
            System.out.println("Bunga perbulan Anda adalah Rp " + bunga_perbulan);
            total_bunga = bunga_perbulan*lama_cicilan; //hitung total bunga
            System.out.println("total bunga Anda selama " + lama_cicilan + " bulan adalah = " + total_bunga);
            total_cicilan = sisa_harga+total_bunga; //total cicilan
            System.out.println("Total cicilan Anda adalah Rp "+total_cicilan);
            cicilan_perbulan = total_cicilan/lama_cicilan;
            System.out.println("Cicilan perbulan Rp "+ cicilan_perbulan);
        }
    }
}
