package JobSheet_9;

public class arrayBilangan20 {
    public static void main(String[] args) {
        int[] bilangan = new int[4];

        bilangan[0] = 10;
        bilangan[1] = 20;
        bilangan[2] = -30;
        bilangan[3] = 40;

        for (int i = 0; i < bilangan.length; i++) {
            System.out.println("Bilangan pada indeks ke-" + i + " adalah: " + bilangan[i]);
        }
    }
}
