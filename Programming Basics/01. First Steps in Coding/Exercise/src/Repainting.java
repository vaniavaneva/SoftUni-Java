import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double sum = (nylon  + 2)* 1.5 + (paint + paint * 0.1) * 14.5 + thinner * 5.0 + 0.4;
        double worked = hours * sum * 0.3;
        System.out.print(sum + worked);
    }
}
