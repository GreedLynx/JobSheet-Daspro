package JobSheet_5;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            int angka;
            System.out.print("Masukan Angka 1 = ");
            angka = input.nextInt();

            if(angka%2==0){
                System.out.println("Genap");
            }
            else{
                System.out.println("Ganjil");
            }
        }
    }
}
