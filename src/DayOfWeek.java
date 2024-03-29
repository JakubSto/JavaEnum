import java.util.ArrayList;

public enum DayOfWeek {
    MONDAY("Poniedziałek", true),
    TUESDAY("Wtorek", true),
    WEDNESDAY("środa", true),
    THURSDAY("Czwartek", true),
    FRIDAY("Piątek", true),
    SATURDAY("Sobota", false),
    SUNDAY("Niedziela", false);

    private String polishName;
    private boolean workDay;

    DayOfWeek(String polishName, boolean workDay) {
        this.polishName = polishName;
        this.workDay = workDay;
    }

    public String getPolishName() {
        return polishName;
    }

    public boolean isWorkDay() {
        return workDay;
    }

    public static ArrayList workDays() {
        ArrayList<DayOfWeek> tempDaysList = new ArrayList<>();
        for (DayOfWeek day : DayOfWeek.values())
            if (day.workDay) {
                tempDaysList.add(day);
            }
        return tempDaysList;
    }

    public static ArrayList weekendDays() {
        ArrayList<DayOfWeek> tempDaysList = new ArrayList<>();
        for (DayOfWeek day : DayOfWeek.values()) {
            if (!day.workDay) {
                tempDaysList.add(day);
            }
        }
        return tempDaysList;
    }

    public static DayOfWeek searchByPolishName(String polishNameDay) {
        if (polishNameDay==null)
            throw new NullPointerException("Argument of method is Null");

        for (DayOfWeek day : DayOfWeek.values()) {
            if (day.polishName.equalsIgnoreCase(polishNameDay))
                return day;
        }
        throw new IllegalArgumentException("Day not found");
    }
}