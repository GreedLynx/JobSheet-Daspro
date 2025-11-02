package JobSheet_8;

import java.util.Scanner;

public class Triangle20 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Masukan nilai n = ");
            int n = input.nextInt();
            int i = 0;
            while (i <= n){
                int j = 0;
                while (j < i){
                    System.out.print("* ");
                    j++;
                }
                System.out.println();
                i++;
            }
    }
}
}
