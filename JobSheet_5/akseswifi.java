package JobSheet_5;

import java.util.Scanner;

public class akseswifi {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            int sks;

            System.out.print("Anda seorang dosen atau mahasiswa? ");
            String jenisPengguna = input.nextLine();

            if(jenisPengguna.equalsIgnoreCase("dosen")){
                System.out.println("Akses wifi diberikan (dosen)");
            }
            else if(jenisPengguna.equalsIgnoreCase("mahasiswa")){
                System.out.print("Masukan jumlah SKS Anda : ");
                sks = input.nextInt();
                if(sks >= 12){
                    System.out.println("Akses wifi diberikan (Mahasiswa aktif)");
                }
                else{
                    System.out.println("Akses ditolak, SKS kurang dari 12!");
                }
            }
            else {
                System.out.println("Akses ditolak!");
            }
        }
    }
}
