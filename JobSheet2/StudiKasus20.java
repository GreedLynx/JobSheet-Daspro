public class StudiKasus20 {
    public static void main(String[] args) {
        int gaji_pokok=3000000, tunjangan=150000*3;
        double potongan_dana_pensiun = 0.05, gaji_bersih, dana_pensiun, total_gaji;
        
        System.out.println("Gaji pokok Anda adalah = " + gaji_pokok);
        System.out.println("Tunjanga Anda adalah = " + tunjangan);

        dana_pensiun = gaji_pokok*potongan_dana_pensiun;
        System.out.println("Jumlah potongan untuk dana pensiun Anda adalah = " + dana_pensiun);

        total_gaji =  gaji_pokok-dana_pensiun;
        System.out.println("Total gaji pokok Anda setelah dipotong untuk dana pensiun  = " + total_gaji);

        gaji_bersih = total_gaji+tunjangan;
        System.out.println("Gaji bersih Anda adalah = " + gaji_bersih);
    }
}
