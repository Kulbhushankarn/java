import java.util.*;
public class Demo10{
    public static void main(String args[]){
        Scanner se = new Scanner(System.in);
        int n = se.nextInt();

        if(n % 2 != 0){
            System.out.println("Weird");
        } else if(n >= 2 && n <= 5){
            System.out.println("Not Weired");
        } else if(n >= 6 && n <= 20){
            System.out.println("Weired");
        }
    }
}