public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(1440);
    }
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }else if (minutes < (365 * 1440)){
            long remainingDays = minutes / 1440;
            System.out.println(minutes + " min = 0 y and " + remainingDays + " d");
        }else {
            long years = minutes / (365 * 1440);
            long remainingDays = (minutes % (365 * 1440)) / 1440;

            System.out.println(minutes + " min =" +years + "y and " + remainingDays + " d");
        }

    }
}
