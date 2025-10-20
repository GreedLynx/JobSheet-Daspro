import java.util.Scanner;

public class HargaTiketBioskopVIP {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.println("==== HARGA TIKET BIOSKOP VIP ====");
            int tiketVIP = 75000, hari, jamTayang;
            String member;
            System.out.print("Pada hari apa anda membeli? (senin = 1, dst): ");
            hari = input.nextInt();

            if(hari <= 4){
                System.out.print("Pada jam berapa anda menonton? pukul : ");
                jamTayang = input.nextInt();
                input.nextLine();
                if(jamTayang < 17){
                    tiketVIP -= 5000;
                    System.out.print("Apakah anda punya member? (iya/tidak): ");
                    member = input.nextLine();
                    if(member.equalsIgnoreCase("iya")){
                        if(tiketVIP > 70000){
                            double tiketVIPDiskon, potongan = tiketVIP * 0.05;
                            tiketVIPDiskon = tiketVIP - potongan;
                            System.out.println("Harga tiket VIP bioskop anda sebesar RP." + tiketVIPDiskon);
                        } else {
                            System.out.println("Harga tiket VIP bioskop anda sebesar RP." + tiketVIP);
                        }
                    } else {
                        System.out.println("Harga tiket VIP bioskop anda sebesar RP." + tiketVIP);
                    }
                } else {
                    System.out.print("Apakah anda punya member? (iya/tidak): ");
                    member = input.nextLine();
                    if(member.equalsIgnoreCase("iya")){
                        if(tiketVIP > 70000){
                            double tiketVIPDiskon, potongan = tiketVIP * 0.05;
                            tiketVIPDiskon = tiketVIP - potongan;
                            System.out.println("Harga tiket VIP bioskop anda sebesar RP." + tiketVIPDiskon);
                        } else {
                            System.out.println("Harga tiket VIP bioskop anda sebesar RP." + tiketVIP);
                        }
                    } else {
                        System.out.println("Harga tiket VIP bioskop anda sebesar RP." + tiketVIP);
                    }
                }
            }else {
                tiketVIP += 10000;
                System.out.println("harga tiket VIP bioskop anda sebesar RP."+ tiketVIP);
            }
        }
    }
}
