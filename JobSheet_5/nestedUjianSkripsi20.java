package JobSheet_5;

import java.util.Scanner;

public class nestedUjianSkripsi20{
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            String pesan = ""; 

            System.out.print("Apakah Mahasiswa sudah bebas kompen? (ya/tidak) : ");
            String bebasKompen = input.nextLine().trim(); //fungsi trim() digunakan untuk menghapus spasi sebelum dan setelah String

            System.out.print("Masukan jumlah log bimbingan pembimbing 1 = ");
            int bimbinganP1 = input.nextInt();
            System.out.print("Masukan jumlah log bimbingan pembimbing 2 = ");
            int bimbinganP2 = input.nextInt();

            if(bebasKompen.equalsIgnoreCase("ya")){
                if (bimbinganP1 >= 8 && bimbinganP2 >= 4){
                    pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
                } else if (bimbinganP1 < 8 && bimbinganP2 < 4){
                    pesan = "Gagal! log bimbingan P1 kurang dari 8 kali dan bimbingan P2 kurang dari 4 kali      ";
                } else if (bimbinganP1 < 8){
                    pesan = "Gagal! log bimbingan P1 kurang dari 8 kali";
                }else if (bimbinganP2 < 4){
                    pesan = "Gagal! log bimbingan P2 kurang dari 4 kali";
                }
            }
            else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan";
            }
            System.out.println(pesan);
        }
    }
}