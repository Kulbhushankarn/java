import java.util.*;
//This code is if, else, and else if. example.
public class demo1{
    public static void main(String args[]){
        Scanner se = new Scanner(System.in);
        int a = se.nextInt();
        int b = se.nextInt();

        if(a == b){
            System.out.println("Equal");
        } else if(a > b) {
                System.out.println("a is grater");

            } else{
                System.out.println("a is lesser");
            }
    }
}