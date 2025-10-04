public class ContohVariabel20 {
    public static void main (String[] args) { 
        String hobiSayaAdalah = "bermain game"; 
        boolean isPandai = true; //nilai boolean hanya bisa true atau false
        char jenisKelamin = 'L';
        byte umur = 19;
        double ipk = 3.89, tinggi = 1.76;

        System.out.println("saya suka " + hobiSayaAdalah);
        System.out.println("Apakah saya pandai? " + isPandai);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Umur saya : " + umur);
        System.out.println(String.format("IPK saya adalah : %s\nDengan tinggi badan : %s", ipk, tinggi));
    }
}
