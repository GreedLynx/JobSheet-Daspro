package Jobsheet7;

import java.util.Scanner;

public class siakadFor20 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            double nilai, tertinggi= 0, terendah = 100;

            for (int i = 0; i < 10; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-"+ (i+1)+":");
                nilai = input.nextDouble();
                if(nilai > tertinggi){
                    tertinggi = nilai;
                }
                if(nilai < terendah){
                    terendah = nilai;
                }
            }
            System.out.println("Nilai tertinggi adalah = "+ tertinggi);
            System.out.println("Nilai terendah adalah = "+ terendah);
        }
    }
}
