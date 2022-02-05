import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int ticketPrice = x.nextInt();
        Scanner y = new Scanner(System.in);
        int amountOfRublesPerOneBonusMile = y.nextInt();
        int numberOfAccruedMiles = ticketPrice / amountOfRublesPerOneBonusMile;
        System.out.println(numberOfAccruedMiles);
    }
}