import java.util.Scanner;

public class Percobaan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int harga;
        double potongan, jml_bayar, diskon = 0.15;

        System.out.println("Masukan harga barang = ");
        harga = sc.nextInt();

        potongan = harga * diskon;
        System.out.println("Anda mendapatkan potongan sebesar = " + potongan);

        jml_bayar = harga - potongan;
        System.out.println("Anda harus membayar sebesar =  " + jml_bayar);
        sc.close();
    }
}
