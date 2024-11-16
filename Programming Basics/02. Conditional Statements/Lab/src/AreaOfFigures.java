import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        switch (figure) {
            case "square" -> {
                double side = Double.parseDouble(scanner.nextLine());
                System.out.print(side * side);
            }
            case "rectangle" -> {
                double a = Double.parseDouble(scanner.nextLine());
                double b = Double.parseDouble(scanner.nextLine());
                System.out.printf("%.3f", a * b);
            }
            case "circle" -> {
                double radius = Double.parseDouble(scanner.nextLine());
                System.out.printf("%.3f", Math.pow(radius, 2) * Math.PI);
            }
            case "triangle" -> {
                double sideA = Double.parseDouble(scanner.nextLine());
                double heightA = Double.parseDouble(scanner.nextLine());
                System.out.printf("%.3f", (sideA * heightA) / 2);
            }
        }
    }
}
