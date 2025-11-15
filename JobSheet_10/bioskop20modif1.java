public class bioskop20modif1 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];

        // Mengisi data penonton
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";    
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";

        // Menampilkan panjang array penonton
        System.out.println(penonton.length);

        // Menampilkan panjang setiap baris dalam array penonton
        for(int i = 0; i < penonton.length; i++) {
            System.out.println("Panjang baris ke-" + (i+1) + " : " + penonton[i].length);
        }
    }
}
