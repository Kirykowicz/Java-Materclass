public class SwitchExpressionChallenge {
    public static void main(String[] args) {

        System.out.println(printDayOfWeek(3));
    }

    public static String printDayOfWeek(int day){
        String dayOfWeek =  switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid entry, please choose 1-7";
        };
        return day + " Stands for the day of the week " + dayOfWeek;
    }
}
