//Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
//
//The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.



public class DecimalComparator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3.1234, 3.1235);
    }
    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        a *= 1000;
        int aFloored = (int) a;
        b *= 1000;
        int bFloored = (int) b;
        if(aFloored == bFloored){
            System.out.println("True, a: " + aFloored + " b: " + bFloored);
            return true;
        }
        System.out.println("False, a: " + aFloored + " b: " + bFloored);
        return false;
    }
}
