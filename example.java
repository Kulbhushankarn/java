import java.util.*;
public class example{
    public static void main(String args[]){
        Scanner se = new Scanner(System.in);
        int a = se.nextInt();
        int b = se.nextInt();

        if(a > b){
            System.out.println("A is greater");
        } else if(a == b){
            System.out.println("A equal to B");
        } else{
            System.out.println("Code is not valid");
        }
    }
}