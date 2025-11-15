import java.util.Scanner;

public class BioskopWithScanner20Modif {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            // Inisialisasi array penonton
        String[][] penonton = new String[4][2];

        // Menu utama
        System.out.println("Menu Utama: ");
        System.out.println("1. Input Penonton");
        System.out.println("2. Tampilkan Penonton");
        System.out.println("3. keluar");
        System.out.print("Pilih menu (1/2/3): ");
        int menu = input.nextInt();
        input.nextLine(); //buat spasi
        
        // Proses berdasarkan pilihan menu
            switch (menu) {
                case 1 -> {
                    while(true){
                        System.out.print("Masukkan nama: ");
                        String nama = input.nextLine();
                        
                        System.out.print("Masukan baris: ");
                        int baris = input.nextInt();
                        
                        System.out.print("Masukan kolom: ");
                        int kolom = input.nextInt();
                        
                        penonton[baris-1][kolom-1] = nama;
                        
                        System.out.print("Apakah anda ingin menambah penonton lagi? (y/n)");
                        input.nextLine(); // buat spasi
                        String lagi = input.nextLine();
                        
                        // Cek apakah user ingin menambah penonton lagi
                        if(lagi.equalsIgnoreCase("n")){
                            break;
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Daftar Penonton: ");
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.println("Penonton pada baris ke-" + (i+1) + " : " + String.join(", ", penonton[i]));
                    }
                }
                default -> System.out.println("Keluar dari program.");
            }
        }
    }
}