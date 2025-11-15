import java.util.Scanner;

public class survei20 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            int data [][] = new int [10][6]; //10 jumlah responden dan 6 untuk jumlah pertanyaan
            double totalNilaiSemua = 0;

            // Menghitung rata-rata nilai per responden berdasarkan input user
            for (int i = 0; i < data.length; i++) {
                double totalPerResponden = 0; //reset tiap responden
                System.out.println("Masukan data responden ke-"+ (i+1)+": ");
                for (int j = 0; j < data[i].length; j++) {
                    System.out.print("Masukan nilai untuk pertanyaan ke-"+(j+1)+": ");
                    data[i][j] = input.nextInt();
                    totalPerResponden += data[i][j];
                }
                System.out.println("Rata nilai responden ke-"+(i+1)+": " + totalPerResponden/data[i].length);
                totalNilaiSemua += totalPerResponden; //akumulasi total semua nilai responden
            }

            System.out.println("===============================");
            System.out.println("Nilai rata rata tiap pertanyaan");

            for (int i = 0; i < data.length; i++) {
                double totalPerPertanyaan = 0; //reset tiap pertanyaan
                for (int j = 0; j < data[i].length; j++) {
                    totalPerPertanyaan += data[i][j];
                }
                System.out.println("Pertanyaan ke-"+(i+1)+": " + totalPerPertanyaan/data[i].length);    
            }

            System.out.println("==================================");
            System.out.println("Nilai rata rata secara keseluruhan");

            int totalElemen = data.length * data[0].length;
            // Output Rata-rata Keseluruhan
            System.out.println("Total Rata-rata: " + (totalNilaiSemua / totalElemen));
            System.out.println("==================================");
        }
    }
}
