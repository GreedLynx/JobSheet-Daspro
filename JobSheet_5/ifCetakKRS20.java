package JobSheet_5;

import java.util.Scanner; //deklarasi agar java bisa nerima input

public class ifCetakKRS20 {
    public static void main(String[] args) {
        String statusKRS; 
        try(Scanner input = new Scanner(System.in)){ //makai try pengganti sc.close
            System.out.println("---Cetak KRS SIAKAD---");
            System.out.print("Apakah UKT sudah lunas? (True/False) : ");
            boolean uktLunas = input.nextBoolean();

            // if(uktLunas){ //Deklarasi pemenuhan kondisi
            //     System.out.println("Pembayaran UKT Terverifikasi");
            //     System.out.println("Silahkan cetak KRS dan minta tanda tangan ke DPA!");
            // }
            // else {
            //     System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu!");

            statusKRS = uktLunas
                ? "Pembayaran UKT Terverifikasi Pembayaran UKT Terverifikasi. \nSilahkan cetak KRS dan minta tanda tangan ke DPA!"
                : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu!";

                System.out.println(statusKRS);
            }
        }
    }

