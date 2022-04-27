import java.util.*;
public class case2{
    public static void main(String args[]){
        Scanner se = new Scanner(System.in);
        int code = se.nextInt();

        switch(code){
            case 1 : System.out.println("This is code of under rule");
            break;
            case 2 : System.out.println("bonjure");
            break;
            case 3 : System.out.println("start");
            break;
            default : System.out.println("error");
        }
    }
}