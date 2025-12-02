public class percobaan1 {
    public static void main(String[] args) {
        int angka = 5;
        System.out.println("Faktorial dari " + angka + " adalah: " + faktorialRekursif(angka));
        System.out.println("Faktorial dari " + angka + " (iteratif) adalah: " + faktorialIteratif(angka));
    }

    static int faktorialRekursif(int n) {
        if (n == 0) {
            return 1; // Basis: faktorial dari 0 adalah 1
        } else {
            return (n * faktorialRekursif(n-1)); // Rekurens: n! = n * (n-1)!
        }
    }

    static int faktorialIteratif(int n) {
        int faktor = 1;
        for (int i = n; i >= 1; i--) {
            faktor *= i; // Mengalikan hasil dengan i
        }
        return faktor;
    }
}