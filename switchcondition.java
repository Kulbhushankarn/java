import java.util.*;
public class switchcondition{
    public static void main(String args[]){
        Scanner se = new Scanner(System.in);
        int button = se.nextInt();
        switch(button){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Nameste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid Button");
        }
    }
}