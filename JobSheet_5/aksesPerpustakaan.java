package JobSheet_5;

import java.util.Scanner;

public class aksesPerpustakaan {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            boolean ktm, regisOnline;

            System.out.print("Apakah Anda membawa kartu identitas Mahasiswa? (true/false) : ");
            ktm = input.nextBoolean();

            System.out.print("Apakah Anda registrasi secara online? (true/false) : ");
            regisOnline = input.nextBoolean();  

            if(ktm || regisOnline){
                System.out.println("Anda boleh masuk, Silahkan nikmati waktu Anda");
            }
            else{
                System.out.println("Anda tidak bisa masuk!");
            }

        }
    }
}
