public class bioskop20modif2 {
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

        // Menampilkan penonton pada baris ke-3
        System.out.println("penonton pada baris ke-3 : ");

        for (int i = 0; i < penonton[2].length; i++) {
            System.out.println(penonton[2][i]);
        }

        System.out.println(penonton.length);

        for(String[] barispenonton : penonton){
            System.out.print("Panjang baris ke-" + barispenonton.length );
        }
    }
}