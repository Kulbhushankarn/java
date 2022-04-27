import java.util.*;
public class case1{
    public static void main(String args[]){
        Scanner se = new Scanner(System.in);
        int button = se.nextInt();

        switch(button){

            case 1 : System.out.println("This is the program of switch and case");
            break;
            case 2 : System.out.println("This is the java program of switch case");
            break;
            default : System.out.println("Error");
        }
    }
}
