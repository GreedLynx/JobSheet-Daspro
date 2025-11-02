package JobSheet_8;

public class persegiAngka {
    public static void main(String[] args) {
        int n = 3; // Misalkan kita ingin mencetak persegi dengan ukuran 5x5

        for (int i = 1; i <= n; i++) { // Loop untuk baris
            for (int j = 1; j <= n; j++) { // Loop untuk kolom
                if( i == 1||i == n|| j == 1|| j == n) {
                    System.out.print(n +""); 
                } else {
                    System.out.print(" "); 
                }
            }
            System.out.println(); // Pindah ke baris berikutnya setelah mencetak satu baris
        }
    }
}
