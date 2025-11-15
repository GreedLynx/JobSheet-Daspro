import java.util.Arrays; // Diperlukan untuk Arrays.toString()

public class Numbers20 {
    public static void main(String[] args) {
        // Inisialisasi array 2D dengan jumlah kolom yang berbeda-beda pada tiap baris
        int myNumbers [][] = new int [3][];
        myNumbers[0] = new int [5];
        myNumbers[1] = new int [3];
        myNumbers[2] = new int [1];

        // Menampilkan isi array 2D dan menggunakan Arrays.toString() agar keluarannya angka
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }

        // Menampilkan panjang tiap baris array 2D
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i+1) + " : " + myNumbers[i].length);
        }
    }
}
