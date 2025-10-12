import java.util.Scanner;

public class segitiga20 {
    public static void main(String args [] ){
        try (Scanner sc1 = new Scanner(System.in)) {
            int alas, tinggi;
            float luas;

            System.out.println("Masukan Alas = ");
            alas = sc1.nextInt();
            
            System.out.println("Masukan Tinggi = ");
            tinggi = sc1.nextInt();

            luas = alas * tinggi /2;
            System.out.println("Luas Segitiga adalah = " + luas);
        }
    } 
}
