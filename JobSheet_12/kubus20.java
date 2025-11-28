public class kubus20 {

    public static double hitungVolume(double sisi){
        double volume;
        volume = sisi * sisi * sisi;
        return volume;
    }

    public static double hitungLuasPermukaan (double sisi) {
        double luasPermukaan;
        luasPermukaan = 6 * sisi * sisi;
        return luasPermukaan;
    }
    public static void main(String[] args) {
        hitungVolume(4);
        hitungLuasPermukaan(5);
    }
}
