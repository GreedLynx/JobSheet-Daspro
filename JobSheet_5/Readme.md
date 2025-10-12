# Jawaban untuk Latihan pemilihan

## Pertanyaan dan jawaban

- 1. Sistem perpustakaan kampus memberikan izin masuk dengan dua syarat:

  - Jika mahasiswa membawa kartu mahasiswa, atau sudah melakukan registrasi
    online, maka boleh masuk.
  - Jika tidak memenuhi salah satu dari dua syarat tersebut, maka ditolak masuk.
  - Buatlah flowchart dan pseudocode untuk menyelesaikan masalah tersebut!
  - Pseudocode:

  * **Program**
    Akses masuk perpustakaan kampus

  * **Deklarasi**
    ktm, regisOnline : Boolean

  * **Algoritma**
    Input ktm, regisOnline
    If (ktm == true | | regisOnline == true) then output <= “Nikmati waktu Anda”
    Else then output “Anda tidak bisa masuk”

  - Flowchart:

    ![Flowchart Akses Perpustakaan][images/Flowchart_Latihan1.png]

* 2. Di kampus tersedia layanan WiFi gratis yang hanya bisa diakses oleh civitas akademika. Sistem hotspot kampus akan melakukan pengecekan sebagai berikut:
     • Jika jenis pengguna adalah dosen, maka tampilkan “Akses WiFi diberikan (dosen)”.
     • Jika jenis pengguna adalah mahasiswa, maka sistem akan memeriksa jumlah SKS yang diambil:
     o Jika SKS ≥ 12, maka tampilkan “Akses WiFi diberikan (mahasiswa aktif)”.
     o Jika SKS < 12, maka tampilkan “Akses ditolak, SKS kurang dari 12”.
     • Jika bukan mahasiswa maupun dosen, maka tampilkan “Akses ditolak”.
     Buatlah flowchart dan pseudocode untuk menyelesaikan masalah tersebut!

* Pseudocode:

- **Program**
  Akses wifi

- **Deklarasi**
  jenisPengguna : String
  sks : sks

- **Algoritma**
  Input jenisPengguna

If (jenisPengguna == dosen) then output “Akses wifi diberikan (dosen)”

Else if (jenisPengguna == mahasiswa) then
Output “Masukan jumlah sks : ”
input sks

if (sks >= 12) then output “akses wifi diberikan(mahasiswa aktif)”
else then output “Akses ditolak, sks kurang dari 12”
else then output “Akses ditolak!”

- Flowchart:

  ![Flowchart Akses Perpustakaan][images/Flowchart_Latihan2.png]

# Jobsheet 5

## Pertanyaan dan jawaban Percobaan 1

- 1. Mengapa pengecekan pada struktur IF tersebut tidak melibatkan kondisi dengan operator relasional?

  - karena variabel uktLunas sudah merupakan nilai Boolean (True/False).

- 2. Saat program dijalankan, kemudian Anda mengisikan nilai false, bagaimana hasilnya?

  - tidak menghasilkan apa apa, karena tidak memenuhi kondisi apapun.

- 3. Sistem perlu memberikan informasi apabila pengguna memasukkan nilai false, maka terdapat keluar “Registrasi ditolak. Silakan lunasi UKT terlebih dahulu”. Modifikasi program tersebut dengan menambahkan struktur ELSE!

```java
if(uktLunas){ //Deklarasi pemenuhan kondisi
                System.out.println("Pembayaran UKT Terverifikasi");
                System.out.println("Silahkan cetak KRS dan minta tanda tangan ke DPA!");
            }
            else {
                System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu!");
            }
```

- 4. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi Percobaan 1”

## Pertanyaan dan jawaban Percobaan 2

- 1. Apa fungsi dari sintaks break?

  - agar ketika case terpenuhi program tidak lanjut eksekusi dan berhenti di case yang terpenuhi.

- 2. Apa peran dari sintaks default pada struktur pemilihan SWITCH-CASE?

  - kondisi ketika tidak memenuhi semua case yang ada.

- 3. Buat file baru dengan nama ifElseCetakKRSNoPresensi.java. File ini berisi program hasil transformasi dari program cetak KRS menggunakan struktur SWITCH-CASE yang telah dibuat ke dalam bentuk IF-ELSE IF-ELSE.

```java
try(Scanner input = new Scanner(System.in)){
            System.out.println("---Cetak KRS SIAKAD---");
            System.out.print("Masukan semester Anda saat ini : ");
            int semester = input.nextInt();

            if (semester == 1){
                System.out.println("KRS semester 1 ditampikan");
            }
            else if(semester == 2){
                System.out.println("KRS semester 2 ditampikan");
            }
            else if(semester == 3){
                System.out.println("KRS semester 3 ditampikan");
            }
            else if(semester == 4){
                System.out.println("KRS semester 4 ditampikan");
            }
            else if(semester == 5){
                System.out.println("KRS semester 5 ditampikan");
            }
            else if(semester == 6){
                System.out.println("KRS semester 6 ditampikan");
            }
            else if(semester == 7){
                System.out.println("KRS semester 7 ditampikan");
            }
            else if(semester == 8){
                System.out.println("KRS semester 8 ditampikan");
            }
            else{
                System.out.println("Semester tidak valid");
            }
        }
```

- 4. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi Percobaan 2”

## Pertanyaan dan jawaban Percobaan 3

- 1. Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen? Mengapa demikian?
  - tetap mengisi jumlah bimbingan yang sudah dilakukan, tapi tidak memenuhi kondisi yang di if sehingga akan muncul teks "Gagal! Mahasiswa masih memiliki tanggungan", ini menunjukkan bahwa mahasiswanya masih ada tanggungan dalam konteks jam kompen.
- 2. Jelaskan maksud dari potongan kode berikut!

```java
if (bimbinganP1 >= 8 && bimbinganP2 >= 4)
```

- Deklarasi kondisi pertama, untuk jumlah bimbinganP1 lebih besar atau sama dengan 8, lalu untuk bimbingan lebih besar atau sama dengan 4, kita harus memenuhi keduanya agar program dijalankan.

- 3. Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara runtut untuk semua kondisi!
  - Tahap 1: Pemeriksaan Syarat Utama (Bebas Kompen) Program pertama-tama menguji apakah mahasiswa telah bebas dari kewajiban kompen (mengambil input bebasKompen).
  - Tahap 2: Pemeriksaan Detail Log Bimbingan (Hanya jika Bebas Kompen = "ya") Jika Tahap 1 lulus, program mulai memeriksa kombinasi jumlah log bimbingan P1 (minimal 8) dan P2 (minimal 4) secara berurutan.
  - Tahap 3: Program memastikan setiap alur menetapkan nilai ke variabel pesan, yang kemudian akan dicetak di akhir program.

[images/Flowchart_Latihan1.png]: images/Flowchart_Latihan2.png
