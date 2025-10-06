# jawaban untuk pertanyaan Jobsheet 5

## Pertanyaan dan jawaban

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
