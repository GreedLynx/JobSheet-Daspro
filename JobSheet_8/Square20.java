package JobSheet_8;

import java.util.Scanner;

public class Square20 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Masukan nilai n = ");
            int n = input.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
