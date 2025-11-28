import java.util.Scanner;

public class kafe20Coba3 {
    
    //Fungsi menampilkan menu
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo){
        System.out.println("Selamat datang " + namaPelanggan+"!");

        if (isMember){
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian! ");
        }
        //pengecekan kode promo
        if (kodePromo.equalsIgnoreCase("DISKON50")){
            System.out.println("Anda mendapatkan diskon 50%");
        } else if(kodePromo.equalsIgnoreCase("DISKON30")){
            System.out.println("Anda mendapatkan diskon 30%");
        } else {
            System.out.println("Kode Anda Invalid");
        }

        //output menu resto kafe tercinta
        System.out.println("=== MENU RESTO KAFE ===");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappucino - Rp 25.000");
        System.out.println("3. Roti - Rp 10.000");
        System.out.println("4. Teh Tarik - Rp 15.000");
        System.out.println("5. Nasi Goreng - Rp 15.000");
        System.out.println("6. Mie Ayam - Rp 15.000");
        System.out.println("0. Selesai dan bayar");
        System.out.println("Silahkan pilih menu Anda");
        System.out.println("==========================");
        
    }

    //Fungsi hitung total harga pesanan
    public static double hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo){
        double [] hargaItems = {15000, 25000, 10000, 15000, 15000, 15000};
        double potongan = 0;

        double hargaTotalSebelum = hargaItems[pilihanMenu-1] * banyakItem;
        double hargaTotalSetelah;

        //pengecekan kode promo meriah
        if (kodePromo.equalsIgnoreCase("DISKON50")){
            potongan = hargaTotalSebelum * 0.5;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")){
            potongan = hargaTotalSebelum * 0.3;
        } else {
            System.out.println("Kode Invalid, Kasihan gak dapat diskon haha");
        }
        hargaTotalSetelah = hargaTotalSebelum - potongan;
        return hargaTotalSetelah;
    }

    //fungsi main
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            double totalHarga = 0 ;
            String lanjut; 
            //step 2. masukan data dari user
            int pilihanMenu, banyakItem;

            do { 
                //step 1. manggil fungsi menu
                Menu("Budi", true, "DISKON50");

                System.out.print("Masukkan nomor menu (1-6, 0 untuk selesai): ");
                if (!input.hasNextInt()) {
                    System.out.println("Input tidak valid! Masukkan angka menu.");
                    input.nextLine();
                    lanjut = "y"; // Ulangi perulangan
                    continue; 
                }
                pilihanMenu = input.nextInt();
                if (pilihanMenu == 0){
                    lanjut = "n";
                    break; 
                }

                System.out.print("Masukan jumlah pesanan: ");
                banyakItem = input.nextInt();
                input.nextLine();

                //step 3. menyimpan data dari fungsi hitung total harga ke total harga
                double totalBiayaSaatIni = hitungTotalHarga(pilihanMenu, banyakItem, "DISKON50");
                totalHarga += totalBiayaSaatIni;

                System.out.println("Total biaya saat ini: Rp "+ totalBiayaSaatIni); //biar user bisa hitung hitung pengeluaran dulu

                System.out.print("Apakah Anda ingin pesan lagi(y/n)?"); //tanya ke user, pesen lagi gak? kalau gak ya udah selesai sudah programnya
                lanjut = input.nextLine();
            } while (lanjut.equalsIgnoreCase("y"));

            System.out.println("Total harga pesanan Anda: Rp "+ totalHarga);

        }
    }
}