import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegan = Integer.parseInt(scanner.nextLine());
        double sum = chicken * 10.35 + fish * 12.40 + vegan * 8.15;
        double dessert = sum * 0.2;
        System.out.print(sum + dessert + 2.50);
    }
}
