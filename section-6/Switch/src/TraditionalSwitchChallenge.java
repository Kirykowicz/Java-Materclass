public class TraditionalSwitchChallenge {
    public static void main(String[] args) {
        char letter = 'F';
        switch (letter){
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            default:
                System.out.println("I did not feel like going through " +
                        "the entire alphabet, I get the point");
        }
    }

}
