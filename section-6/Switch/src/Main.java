public class Main {
    public static void main(String[] args) {
        int switchValue = 4;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4, or 5");
        }
        System.out.println(getQuarter("April"));
        System.out.println(getQuarterAlternate("July"));
    }
    public static String getQuarter(String month){
        switch (month){
            case "January", "February", "March" -> {
                return "Q1";
            }
            case "April", "May", "June" -> {
                return "Q2";
            }
            case "July", "August", "September" -> {
                return "Q3";
            }
            case "October", "November", "December" -> {
                return "Q4";
            }
            default -> {
                return "Please enter a valid month";
            }
        }
    }

    public static String getQuarterAlternate(String month){
        return switch (month){
            case "January", "February", "March" -> "first Quarter";
            case "April", "May", "June" -> "second quarter";
            case "July", "August", "September" -> "third quarter";
            case "October", "November", "December" -> "fourth quarter";
            default -> "This is an alternate version";
        };
    }
}
