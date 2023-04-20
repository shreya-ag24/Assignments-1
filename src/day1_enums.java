enum WeekDays{
    SUDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}
public class day1_enums {
    public static void main(String[] args) {
        for(WeekDays wd :WeekDays.values()){
            System.out.println(wd);
        }
    }
}
