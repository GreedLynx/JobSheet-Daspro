# jawaban untuk pertanyaan Jobsheet 5

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
