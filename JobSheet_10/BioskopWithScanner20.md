# Laporan Jobsheet: Sistem Tiket Bioskop (Array 2D & Kontrol Menu)

# 📄 Analisis Kode Program Awal (BioskopWithScanner20.java)
Program ini menggunakan Array 2D statis berukuran 4×2 (String[4][2]) untuk menyimpan nama penonton. Program dijalankan dalam infinite loop (while(true)) dan menggunakan perintah break untuk keluar.

## ❓ Jawaban Pertanyaan dan Modifikasi
1. Apakah pengisian elemen array dari scanner harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!
* Jawabannya: Tidak harus.
* Alasan: Array adalah struktur akses acak (random access). Selama Anda mengetahui indeks yang benar (dalam kasus ini: baris-1 dan kolom-1), Anda dapat langsung mengisi elemen array di mana pun (misalnya, mengisi penonton[3][1] terlebih dahulu), tanpa perlu mengisi secara berurutan mulai dari indeks [0][0].

2. Modifikasi kode program untuk memberikan opsi menu sebagai berikut (Menu 1: Input, Menu 2: Tampilkan, Menu 3: Exit).
Modifikasi ini melibatkan perubahan dari loop input langsung menjadi loop berbasis SWITCH-CASE untuk navigasi menu.

🛠️ Kode Modifikasi (Struktur Menu)
```java
// ... (Deklarasi Array di luar loop) ...
while (true) {
    System.out.println("\n--- MENU UTAMA ---");
    System.out.println("1. Input data penonton");
    System.out.println("2. Tampilkan daftar penonton");
    System.out.println("3. Exit");
    System.out.print("Pilih menu (1/2/3): ");
    
    // Perbaikan: Mencegah konflik buffer
    if (!input.hasNextInt()) {
        input.nextLine(); 
        System.out.println("Input tidak valid!");
        continue;
    }
    int menu = input.nextInt();
    input.nextLine(); // Consume newline setelah nextInt

    switch (menu) { // Struktur pemilihan SWITCH-CASE
        case 1:
            // Logika input (Soal 4 & 5)
            break;
        case 2:
            // Logika tampilkan (Soal 5)
            break;
        case 3:
            System.out.println("Terima kasih, program selesai.");
            return; // Mengakhiri method main dan program
        default:
            System.out.println("Pilihan tidak ditemukan.");
    }
}
```

3. dan 4 Modifikasi program untuk handle nomor kursi yang tidak tersedia dan memberikan warning jika kursi sudah terisi.
Modifikasi ini menggabungkan validasi batas array dan validasi konten kursi ke dalam perulangan DO-WHILE untuk memastikan input selalu diulang sampai valid.
🛠️ Kode Modifikasi (Implementasi Menu 1)
```java
case 1: // Logika Input Data Penonton
    String namaPenonton;
    int baris, kolom;
    
    while(true) { // Loop untuk validasi input baris/kolom
        System.out.print("Masukkan nama penonton: ");
        namaPenonton = input.nextLine();
        System.out.print("Masukkan baris (1-4): ");
        baris = input.nextInt();
        System.out.print("Masukkan kolom (1-2): ");
        kolom = input.nextInt();
        input.nextLine(); // Consume newline

        // --- VALIDASI BATAS ARRAY (SOAL 3) ---
        if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
            System.out.println("❌ ERROR: Nomor baris/kolom tidak valid (di luar batas array). Ulangi.");
            continue; // Ulangi loop validasi
        }
        
        // --- VALIDASI KURSI TERISI (SOAL 4) ---
        // Pengecekan pada indeks array [baris-1][kolom-1]
        if (penonton[baris - 1][kolom - 1] != null) { 
            System.out.println("⚠️ WARNING: Kursi sudah terisi oleh penonton lain. Masukkan baris dan kolom kembali.");
            continue; // Ulangi loop validasi
        }
        
        // Jika validasi lolos, masukkan data
        penonton[baris - 1][kolom - 1] = namaPenonton;
        System.out.println("✅ Penonton berhasil ditambahkan.");
        break; // Keluar dari loop validasi (while(true))
    }
    break;
```
