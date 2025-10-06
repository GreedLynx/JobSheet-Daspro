package JobSheet_5;

import java.util.Scanner;

public class ifElseCetakKRS20i {
    public static void main(String[] args) {
        //make try pengganti sc.close
        try(Scanner input = new Scanner(System.in)){
            System.out.println("---Cetak KRS SIAKAD---");
            System.out.print("Masukan semester Anda saat ini : ");
            int semester = input.nextInt();

            if (semester == 1){
                System.out.println("KRS semester 1 ditampikan");
            }
            else if(semester == 2){
                System.out.println("KRS semester 2 ditampikan");
            }
            else if(semester == 3){
                System.out.println("KRS semester 3 ditampikan");
            }
            else if(semester == 4){
                System.out.println("KRS semester 4 ditampikan");
            }
            else if(semester == 5){
                System.out.println("KRS semester 5 ditampikan");
            }
            else if(semester == 6){
                System.out.println("KRS semester 6 ditampikan");
            }
            else if(semester == 7){
                System.out.println("KRS semester 7 ditampikan");
            }
            else if(semester == 8){
                System.out.println("KRS semester 8 ditampikan");
            }
            else{
                System.out.println("Semester tidak valid");
            }
        }
    }
}
