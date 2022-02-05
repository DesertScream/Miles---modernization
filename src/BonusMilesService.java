import java.util.Scanner;

public class BonusMilesService {
    public int calculate(int ticketPrice) {
        Scanner x = new Scanner(System.in);
        int price = x.nextInt();
        int miles = 20;
        int AccruedMiles = price / miles;
        return AccruedMiles;
    }
}

