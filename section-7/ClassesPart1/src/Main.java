
public class Main {

    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++){
            LPAStudent s = new LPAStudent("S9230" + i,
                    switch (i){
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1995",
                    "Java Masterclass");
            System.out.println(s);
        }

    }
}
