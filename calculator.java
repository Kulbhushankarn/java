import java.util.*;
public class calculator{
    public static void main(String args[]){
        Scanner se = new Scanner(System.in);
        int a = se.nextInt();
        int b = se.nextInt();
        int operator = se.nextInt();
        switch(operator){
            case 1 : System.out.println(a+b);
            break;
            case 2 : System.out.println(a-b);
            break;
            case 3 : System.out.println(a*b);
            break;
            case 4 : System.out.println(a%b);
            break;
        }
    }
}