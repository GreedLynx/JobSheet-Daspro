package JobSheet_8;

import java.util.Scanner;

public class Star20 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Masukan nilai n = ");
            int n = input.nextInt();

            for (int i = 0; i <= n; i++) {
                System.out.print("* ");
            }
        }
    }
}
