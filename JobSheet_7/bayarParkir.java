import java.util.Scanner;

public class bayarParkir {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            int jenis, durasi, total = 0;

            do { 
                System.out.println("jenis kendaraan 1. mobil 2. motor 0. keluar");
                System.out.print("Masukan jenis kendaraan : ");
                jenis = input.nextInt();

                if (jenis == 1 || jenis == 2){ // Logika validasi jenis kendaraan yang valid
                    System.out.print("Masukan durasi parkir Anda: ");
                    durasi = input.nextInt();
                    
                    if (durasi > 5){
                        total += 12500;
                    } else if (jenis == 1){
                        total += durasi * 3000;
                    }else {
                        total += durasi * 2000;
                    }
                    
                } else if (jenis != 0) { // MODIFIKASI: Menangani input selain 1, 2, atau 0
                    System.out.println("❌ Jenis kendaraan tidak valid. Mohon masukkan 1, 2, atau 0.");
                } 
                
                // Pesan Total Parkir Saat Ini (Dikeluarkan hanya jika tidak keluar)
                if (jenis != 0) {
                    System.out.println("Biaya parkir saat ini adalah : Rp."+ total);
                }

            } while (jenis != 0);
            
            System.out.println("✅ Program selesai. Total omset parkir: Rp."+ total);
        }
    }
}