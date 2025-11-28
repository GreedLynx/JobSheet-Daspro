import java.util.Scanner;

public class hitungBalok20{
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            int p, l, t, L, volume;

            System.out.print("Masukan panjang: ");
            p = input.nextInt();

            System.out.print("Masukan lebar: ");
            l = input.nextInt();
            
            System.out.print("Masukan tinggi: ");
            t = input.nextInt();

            L = p*l;
            System.out.println("Luas persegi panjang adalah: "+ L);

            volume = p*l*t;
            System.out.println("Volume balok adalah: "+ volume);
        }
    }
}