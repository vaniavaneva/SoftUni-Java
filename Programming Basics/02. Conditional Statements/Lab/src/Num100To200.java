import java.util.Scanner;

public class Num100To200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if (num < 100) System.out.print("Less than 100");
        else if (num <= 200) System.out.print("Between 100 and 200");
        else System.out.print("Greater than 200");
    }
}
