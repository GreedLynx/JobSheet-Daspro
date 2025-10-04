import java.util.Scanner;

public class MenghitungLuasPersegiPanjangNo20 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in); 
        int panjang, lebar, luas;
        
        System.out.println("Masukan panjang lapangan = ");
        panjang = sc1.nextInt();

        System.out.println("Masukan lebar lapangan = ");
        lebar = sc1.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas lapangan adalah = " + luas);
        sc1.close();
    }
}
