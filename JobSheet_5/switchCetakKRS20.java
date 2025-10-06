package JobSheet_5;

import java.util.Scanner;

public class switchCetakKRS20 {
    public static void main(String[] args) {
        //make try pengganti sc.close
        try(Scanner input = new Scanner(System.in)){
            System.out.println("---Cetak KRS SIAKAD---");
            System.out.print("Masukan semester Anda saat ini : ");
            int semester = input.nextInt();

            switch (semester) {
                case 1:
                    System.out.println("KRS semester 1 ditampikan");
                    break;
                case 2:
                    System.out.println("KRS semester 2 ditampikan");
                    break;
                case 3:
                    System.out.println("KRS semester 3 ditampikan");
                    break;
                case 4:
                    System.out.println("KRS semester 4 ditampikan");
                    break;
                case 5:
                    System.out.println("KRS semester 5 ditampikan");
                    break;
                case 6:
                    System.out.println("KRS semester 6 ditampikan");
                    break;
                case 7:
                    System.out.println("KRS semester 7 ditampikan");
                    break;
                case 8:
                    System.out.println("KRS semester 8 ditampikan");
                    break;
                default:
                    System.out.println("Semester tidak Valid");
            }
        }
    }
}
