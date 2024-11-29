import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double vacation = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());
        double prize = puzzles * 2.60 + dolls * 3.0 + bears * 4.1 +
                minions * 8.2 + trucks * 2.0;
        int count = puzzles + dolls + bears + minions + trucks;

        if (count >= 50){
            prize -= prize * 0.25;
        }

        double bill = prize * 0.1;
        double money = prize - bill;

        if (money >= vacation){
            System.out.printf("Yes! %.2f lv left.", money - vacation);
        }
        else {
            System.out.printf("Not enough money! %.2f lv needed.", vacation - money);
        }
    }
}
