public class kafe20modif1 {
    public static void main(String[] args) {
        
        Menu("Budi", true, "DISKON50");
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo){
        System.out.println("Selamat datang " + namaPelanggan+"!");

        if (isMember){
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian! ");
        }
        if (kodePromo.equalsIgnoreCase("DISKON50")){
            System.out.println("Anda mendapatkan diskon 50%");
        } else if(kodePromo.equalsIgnoreCase("DISKON30")){
            System.out.println("Anda mendapatkan diskon 30%");
        } else {
            System.out.println("Kode Anda Invalid");
        }

        System.out.println("===MENU RESTO KAFE===");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappucino - Rp 25.000");
        System.out.println("3. Roti - Rp 10.000");
        System.out.println("4. Teh Tarik - Rp 15.000");
        System.out.println("5. Nasi Goreng - Rp 15.000");
        System.out.println("6. Mie Ayam - Rp 15.000");
        System.out.println("Silahkan pilih menu Anda: ");
        System.out.println("==========================");
        
    }
}