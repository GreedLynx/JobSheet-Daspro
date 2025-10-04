import java.util.Scanner;

public class StudiKasusModifikasi2 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int panjang, lebar, diameter, panjang_sisi;
        double luas_tanah, luas2_lingkaran_kolam, luas_persegi_kolam, total_luas_kolam, luas_rumput;

        System.out.print("Masukan nama Anda = ");
        String nama = sc.nextLine();

        System.out.println("Masukan panjang tanah Anda = ");
        panjang = sc.nextInt();

        System.out.println("Masukan lebar tanah Anda = ");
        lebar = sc.nextInt();

        System.out.println("Masukan diameter lingkaran kolam anda Anda = ");
        diameter = sc.nextInt();

        System.out.println("Masukan panjang sisi kolam Anda = ");
        panjang_sisi = sc.nextInt();

        luas_tanah = panjang * lebar;
        System.out.println("Luas tanah %s adalah = " + luas_tanah);

        luas2_lingkaran_kolam = 2*3.14*diameter;
        System.out.println("Luas kolam %s lingkaran adalah = " + luas2_lingkaran_kolam); //menghitung luas 2 kolam lingkaran

        luas_persegi_kolam = panjang_sisi*panjang_sisi;
        System.out.println("Luas kolam %s persegi adalah = " + luas_persegi_kolam);

        total_luas_kolam = luas_persegi_kolam+luas2_lingkaran_kolam;
        System.out.println("Total luas kolam" +nama+ "adalah = " + total_luas_kolam);
        
        luas_rumput = luas_tanah-total_luas_kolam;
        System.out.println("Luas tanah yang ditanami rumput = " + luas_rumput);

        sc.close();
    }
}
