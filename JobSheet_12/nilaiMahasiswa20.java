import java.util.Scanner;

public class nilaiMahasiswa20 {

    //deklarasi global untuk input
    private static final Scanner input = new Scanner(System.in);
    //fungsi input nilai
    public static void inputNilai (int []data){
        System.out.println("Masukan nilai");
        for (int i = 0; i < data.length; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-"+(i+1)+": ");
            data[i] = input.nextInt();
            input.nextLine();
            }
        }

        //fungsi menampilkan array
    public static void tampilkan(int [] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println("Nilai mahasiswa ke-"+(i+1)+": "+data[i]);
        }
    }

    public static void hitungTotal(int []data){
        int totalNilaiMhs = 0;
        for (int i = 0; i < data.length; i++) {
            totalNilaiMhs += data[i];
        }
        System.out.println("total nilai keseluruhan: " + totalNilaiMhs);
    }
    public static void main(String[] args) {
            System.out.print("Masukan jumlah mahasiswa: ");
            int n = input.nextInt();

            int data [] = new int [n];
            inputNilai (data);
            tampilkan(data);
            hitungTotal(data);
    }
}
