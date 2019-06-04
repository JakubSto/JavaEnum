public class Main {

    public static void main(String[] args) {
        System.out.println((DayOfWeek.searchByPolishName("Poniedziałek").getPolishName()));
        System.out.println(DayOfWeek.weekendDays());
        System.out.println(DayOfWeek.workDays());

        for (DayOfWeek day: DayOfWeek.values())
            {
                System.out.println();
                System.out.println(day);
            }
    }
}
