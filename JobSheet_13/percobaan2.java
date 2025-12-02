import java.util.Scanner;

public class percobaan2 {
    //deklarasi secara global scanner
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //input data dari user
        System.out.print("Masukkan basis (x): ");
        int bilangan = input.nextInt();
        System.out.print("Masukkan pangkat (y): ");
        int pangkat = input.nextInt();

        //menampilkan hasil pemanggilan fungsi rekursif
        System.out.println(bilangan + " pangkat " + pangkat + " adalah: " + hitungPangkat(bilangan, pangkat));
        System.out.println("Hitung pangkat("+bilangan+", "+pangkat+") dicetak: "+cetakDeretRekursif(bilangan, pangkat));
    }

    //fungsi rekursif untuk menghitung pangkat
    static int hitungPangkat(int x, int y){
        if (y == 0){
            return 1; // Basis: x^0 = 1
        } else {
            return x * hitungPangkat(x, y - 1); // Rekurens: x^y = x * x^(y-1)
        }
    }


    //fungsi cetak deret rekursif
    static String cetakDeretRekursif (int x, int y){
        if (y == 0){
            return "1";
        } else {
            return x + " x " + cetakDeretRekursif(x, y - 1);
        }
    }
}
