public class StudiKasus2 {
    public static void main(String[] args) {
        int panjang = 100, lebar = 50, diameter = 2, panjang_sisi = 2;
        double luas_tanah, luas2_lingkaran_kolam, luas_persegi_kolam, total_luas_kolam, luas_rumput;

        luas_tanah = panjang * lebar;
        System.out.println("Luas tanah Pak Jaka adalah = " + luas_tanah);

        luas2_lingkaran_kolam = 2*3.14*diameter;
        System.out.println("Luas kolam lingkaran adalah = " + luas2_lingkaran_kolam); //menghitung luas 2 kolam lingkaran

        luas_persegi_kolam = panjang_sisi*panjang_sisi;
        System.out.println("Luas kolam persegi adalah = " + luas_persegi_kolam);

        total_luas_kolam = luas_persegi_kolam+luas2_lingkaran_kolam;
        System.out.println("Total luas kolam adalah = " + total_luas_kolam);
        
        luas_rumput = luas_tanah-total_luas_kolam;
        System.out.println("Luas tanah yang ditanami rumput = " + luas_rumput);

    }
}
