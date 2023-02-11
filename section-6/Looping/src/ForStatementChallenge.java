public class ForStatementChallenge {

    public static void main(String[] args) {
        int checkPrime = 23;
        for(int i = 0; i <= checkPrime; i++){
            System.out.println(i + " is " + (isPrime(i) ? "" : "NOT ") + "a prime number.");
        }
        System.out.println(primeCounter(0, 23));
    }

    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <= 2){
            return (wholeNumber == 2);
        }

        for(int divisor = 2; divisor < wholeNumber; divisor++){
            if(wholeNumber % divisor == 0){
                return false;
            }
        }

        return true;
    }

    public static int primeCounter(int start, int finish){
        int count = 0;
        for(int i = start; i <= finish; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
}
