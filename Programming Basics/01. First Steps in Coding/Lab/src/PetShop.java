import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dog = Integer.parseInt(scanner.nextLine());
        int cat = Integer.parseInt(scanner.nextLine());
        double catFood = cat * 4.0;
        double dogFood = dog * 2.5;
        System.out.print((dogFood + catFood) + " lv.");
    }
}
