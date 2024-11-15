import java.util.Scanner;

public class InchToCm {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double inch = Double.parseDouble(scanner.nextLine());
        System.out.print(inch * 2.54);
    }
}
