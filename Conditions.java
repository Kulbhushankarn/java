import java.util.*;
public class Conditions{
    public static void main(String args[]){
        Scanner se = new Scanner(System.in);
        int age = se.nextInt();

        if(age > 18){
            System.out.println("Adult");
        } else{
            System.out.println("Not Adult");
        }
    }
}