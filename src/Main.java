import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Wpisz dzień: ");
        Scanner scanner = new Scanner(System.in);
        String days = scanner.nextLine();

        System.out.println((DayOfWeek.searchByPolishName(days).getPolishName()));
        System.out.println(DayOfWeek.weekendDays());
        System.out.println(DayOfWeek.workDays());

        for (DayOfWeek day: DayOfWeek.values())
            {
                System.out.println();
                System.out.println(day);
            }
    }
}
