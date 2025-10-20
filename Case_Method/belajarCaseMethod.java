import java.util.Scanner;

public class belajarCaseMethod {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            boolean lulusSkripsi, UKTLunas, bebanPerpus;

            System.out.print("Apakah anda sudah lulus Skripsi? (true/false): ");
            lulusSkripsi = input.nextBoolean();

            if(lulusSkripsi){ //pengecekan kondisi 1 lulus skripsi atau tidak
                System.out.print("Apakah Anda sudah melunasi UKT anda? (true/false): ");
                UKTLunas = input.nextBoolean();
                if(UKTLunas){ //pengecekan kondisi 2 sudah melunasi UKT atau tidak
                    System.out.print("Apakah anda masih memiliki tanggungan perpustakaan? (True/False): ");
                    bebanPerpus = input.nextBoolean();
                    if(bebanPerpus){ //pengecekan kondisi 3 ada beban di perpustakaan atau tidak
                        System.out.println("Selamat! Anda sudah lulus");
                    } else {
                        System.out.println("Mohon maaf, Anda masih memiliki tanggungan!");
                    }
                } else {
                    System.out.println("Mohon maaf, Anda harus melunasi UKT anda!");
                }
            }else {
                System.out.println("Maaf, Anda harus lulus Skripsi terlebih dahulu!");
            }
        }
    }
}
