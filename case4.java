import java.util.*;
public class case4{
    public static void main(String args[]){
        Scanner se = new Scanner(System.in);
        System.out.println("Press the button:");
        int Button = se.nextInt();

        switch(Button){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Anukriti");
            break;
            case 3 : System.out.println("Mallik");
            break;
            default : System.out.println("Error");
        }
    }
}