public class Challenge {
    public static void main(String[] args) {
        double step1 = 20.00;
        double step2 = 80.00;
        double step3 = (step1 + step2) * 100.00;
        double step4 = step3 % 40.00;
        boolean step5 = (step4 == 0.00) ? true : false;
        System.out.println("Answer to step 5: " + step5);
        if(!step5){
            System.out.println("got some remainder");
        }
    }
}
