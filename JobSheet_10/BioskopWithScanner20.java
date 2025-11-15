import java.util.Scanner;

public class BioskopWithScanner20 {
    public static void main(String[] args) {
        // Inisialisasi array penonton
        try(Scanner input = new Scanner(System.in)){
        String[][] penonton = new String[4][2];

        // Input penonton
        while(true){
            System.out.print("Masukkan nama: ");
            String nama = input.nextLine();

            System.out.print("Masukan baris: ");
            int baris = input.nextInt();

            System.out.print("Masukan kolom: ");
            int kolom = input.nextInt();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Apakah anda ingin menambah penonton lagi? (y/n)");
            input.nextLine(); // consume newline
            String lagi = input.nextLine(); 

            // Cek apakah user ingin menambah penonton lagi
            if(lagi.equalsIgnoreCase("n")){
                break;
            }
        }
        }
    }
}