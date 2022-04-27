import java.util.*;

public class Condition1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        // if(a == b) {
        //     System.out.println("Equal");
        // } else if(a > b) {
        //     System.out.println("a is greater");
        // }
        // else {
        //     System.out.println("b is greater");
        // }
        switch(button) {
            case 1 : System.out.println("hello");
            break;
            case 2 : System.out.println("nameste");
            break;
            case 3 : System.out.println("bonjure");
            break;
            default : System.out.println("Indvidual button");

        }
    }
}
