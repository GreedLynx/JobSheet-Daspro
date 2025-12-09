import java.util.Scanner;

public class sistemMagang {

    //deklarasi scanner secara global
    private static final Scanner input = new Scanner(System.in);
    //deklarasi array 2D secara global untuk menyimpan data pendaftar 100 baris untuk jumlah mahasiswa dan 6 kolom untuk atribut data
    private static final String[][] dataPendaftar = new String[100][6];
    private static int jumlahPendaftar = 0; //variabel untuk menghitung jumlah pendaftar

    //deklarasi global Header untuk output tabel, pakai final biar gak bisa diubah-ubah
    private static final String[] header = {"No", "Nama", "NIM", "Prodi", "Perusahaan", "Sem", "Status"};

    //FUNGSI MENU
    //============================================
    //fungsi untuk menampilkan menu sistem magang
    static void menuSistemMagang (){
        System.out.println("==== SISTEM PENDAFTARAN MAGANG MAHASISWA ====");
        System.out.println("1. Tambah Data Magang");
        System.out.println("2. Tampilkan Semua Pendaftar Magang");
        System.out.println("3. Cari Pendaftar Berdasarkan Program Studi");
        System.out.println("4. Hitung Jumlah Pendaftar Untuk Setiap Status");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu(1-5): ");
    }

    // FUNGSI MENAMBAH DATA
    //============================================
    //fungsi untuk menambah data pendaftar magang
    public static void tambahData() {
        if (jumlahPendaftar >= dataPendaftar.length) {
            System.out.println("Kapasitas pendaftar sudah penuh. Tidak dapat menambah data lagi.");
            return;
        }

        System.out.println("==== TAMBAH DATA PENDAFTAR ====");

        // Input data pendaftar
        System.out.print("Nama: "); // menyimpan nama pada kolom 0
        dataPendaftar[jumlahPendaftar][0] = input.nextLine(); 
        System.out.print("NIM: "); // menyimpan NIM pada kolom 1
        dataPendaftar[jumlahPendaftar][1] = input.nextLine();
        System.out.print("Program Studi: "); // menyimpan program studi pada kolom 2
        dataPendaftar[jumlahPendaftar][2] = input.nextLine();
        System.out.print("Perusahaan Tujuan Magang: "); // menyimpan perusahaan tujuan magang pada kolom 3
        dataPendaftar[jumlahPendaftar][3] = input.nextLine();

        //Pengecekan Semester (Hanya Semester 6 dan 7 yang diperbolehkan)
        String semester;
        do {
            System.out.print("Semester pengambilan magang (6/7): ");
            semester = input.nextLine();
            // validasi input semester
        } while (!semester.equals("6") && !semester.equals("7"));
        dataPendaftar[jumlahPendaftar][4] = semester; // menyimpan semester pada kolom 4

        //Pengecekan Status Magang (Diterima, Menunggu, Ditolak)
        String status;
        do {
            System.out.print("Status magang (Diterima/Menunggu/Ditolak): ");
            status = input.nextLine();
            // validasi input status
        } while (!status.equalsIgnoreCase("Diterima") && !status.equalsIgnoreCase("Menunggu") && !status.equalsIgnoreCase("Ditolak"));
        dataPendaftar[jumlahPendaftar][5] = status; // menyimpan status pada kolom 5

        // Menambah jumlah pendaftar setelah data berhasil ditambahkan
        jumlahPendaftar++;
        System.out.println("Data pendaftar berhasil ditambahkan. Total pendaftar: "+ jumlahPendaftar);
    }

    //FUNGSI MENAMPILKAN SEMUA PENDAFTAR
    //====================================================
    //fungsi untuk menampilkan semua data pendaftar magang
    public static void tampilkanSemuaPendaftar() {
        if (jumlahPendaftar == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }

        System.out.println("==== SELURUH DATA PENDAFTAR MAGANG ====");
        // Header Tabel menggunakan printf untuk perataan
        System.out.printf("%-5s | %-20s | %-15s | %-30s | %-15s | %-5s | %-10s%n", header[0], header[1], header[2], header[3], header[4], header[5], header[6]);

        // Menampilkan data pendaftar menggunakan perulangan bersarang
        for (int i = 0; i < jumlahPendaftar; i++) {
            // Kolom 1 (Nomor Urut)
            System.out.printf("%-5d | ", i + 1);
            System.out.printf("%-20s | ", dataPendaftar[i][0]); // Nama (0)
            System.out.printf("%-15s | ", dataPendaftar[i][1]); // NIM (1)
            System.out.printf("%-30s | ", dataPendaftar[i][2]); // Prodi (2)
            System.out.printf("%-15s | ", dataPendaftar[i][3]); // Perusahaan (3)
            System.out.printf("%-5s | ", dataPendaftar[i][4]);  // Semester (4)
            System.out.printf("%-10s%n", dataPendaftar[i][5]);  // Status (5)
        }
    }

    // FUNGSI CARI BERDASARKAN PRODI
    //========================================================
    //fungsi untuk mencari pendaftar berdasarkan program studi
    public static void cariBerdasarkanProdi() {
        if (jumlahPendaftar == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }

        System.out.print("Masukkan Program Studi yang ingin dicari: ");
        String cariProdi = input.nextLine();

        // Flag untuk menandai apakah ada data yang ditemukan
        boolean ditemukan = false;

        System.out.printf("%-5s | %-20s | %-15s | %-30s | %-15s | %-5s | %-10s%n", header[0], header[1], header[2], header[3], header[4], header[5], header[6]);

        for (int i = 0; i < jumlahPendaftar; i++) {
            //periksa kolom prodi (kolom ke-2)
            if(dataPendaftar[i][2].equalsIgnoreCase(cariProdi)) {
                ditemukan = true;
                System.out.printf("%-5d | ", i + 1);
                System.out.printf("%-20s | ", dataPendaftar[i][0]); // Nama (0)
                System.out.printf("%-15s | ", dataPendaftar[i][1]); // NIM (1)
                System.out.printf("%-30s | ", dataPendaftar[i][2]); // Prodi (2)
                System.out.printf("%-15s | ", dataPendaftar[i][3]); // Perusahaan (3)
                System.out.printf("%-5s | ", dataPendaftar[i][4]);  // Semester (4)
                System.out.printf("%-10s%n", dataPendaftar[i][5]);  // Status (5)
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada pendaftar dengan Program Studi " + cariProdi);
        }
    }

    // FUNGSI HITUNG STATUS
    //==================================
    // fungsi untuk menghitung jumlah pendaftar berdasarkan status
    public static void hitungStatus (){
        if (jumlahPendaftar == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }

        // variabel untuk menyimpan jumlah status, set ke 0 agar dapat digunakan ketika pakai ++ atau yang lain
        int diterima = 0;
        int menunggu = 0;
        int ditolak = 0;

        // perulangan untuk menghitung status
        for (int i = 0; i < jumlahPendaftar; i++) {
            String status = dataPendaftar[i][5];
            // pengecekan status dan penambahan jumlah sesuai status
            if (status.equalsIgnoreCase("Diterima")) { 
                diterima++;
            } else if (status.equalsIgnoreCase("Menunggu")) {
                menunggu++;
            } else if (status.equalsIgnoreCase("Ditolak")) {
                ditolak++;
            }
        }

        // menampilkan hasil perhitungan
        System.out.println("\n--- JUMLAH PENDAFTAR BERDASARKAN STATUS ---");
        System.out.println("Diterima: " + diterima);
        System.out.println("Menunggu: " + menunggu);
        System.out.println("Ditolak: " + ditolak);
        System.out.println("Total pendaftar: " + jumlahPendaftar);
    }


    public static void main(String[] args) {
        int pilihan;
        do { 
            menuSistemMagang();
            if(input.hasNextInt()){ // Ambil input jika itu angka
                pilihan = input.nextInt();
                input.nextLine(); // Membersihkan newline setelah nextInt()
            } else {
                pilihan = 0; //default pilihan jika input bukan integer
                input.nextLine(); // Membersihkan input yang bukan integer
            }
            switch (pilihan) {
                case 1 -> tambahData();
                case 2 -> tampilkanSemuaPendaftar();
                case 3 -> cariBerdasarkanProdi();
                case 4 -> hitungStatus();
                case 5 -> System.out.println("Terima kasih, program dihentikan.");
                default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5); //program akan terus berjalan sampai user memilih opsi 5
    }
}
