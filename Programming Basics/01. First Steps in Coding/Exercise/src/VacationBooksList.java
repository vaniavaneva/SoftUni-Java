import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int books = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days =  Integer.parseInt(scanner.nextLine());
        int time = books / pagesPerHour;
        int hoursPerDay = time / days;
        System.out.print(hoursPerDay);
    }
}
