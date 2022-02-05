public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int x = service.calculate(10_000, 20);
        System.out.println(x);


    }
}