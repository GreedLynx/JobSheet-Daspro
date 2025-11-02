package JobSheet_8;

import java.util.Scanner;   

public class NilaiKelompok20 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            int i,j, nilai;
            float totalNilai = 0, rataNilai;

            for (i = 1; i <= 6; i++){
                System.out.println("kelompok " + i);
                for ( j = 1; j <= 5; j++) {
                    System.out.print("Nilai dari kelompok Penilai " + j + " : ");
                    nilai = input.nextInt();
                    totalNilai += nilai;
                }
                rataNilai = totalNilai / 5;
                System.out.println("Rata-rata nilai dari kelompok " + i + " : " + rataNilai);
            }
        }
    }   
}