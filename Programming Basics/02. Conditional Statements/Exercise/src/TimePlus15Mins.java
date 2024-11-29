import java.util.Scanner;

public class TimePlus15Mins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int total = minutes + (hours * 60) + 15;
        hours = total / 60;
        if (hours > 23){
            hours -= 24;
        }
        minutes = total % 60;
        System.out.printf("%d:%02d", hours, minutes);
    }
}
