import java.util.*;
//This code for check even or odd!
public class demo{
    public static void main(String args[]){
        
        System.out.println("Write the number:");
        
        Scanner se = new Scanner(System.in);
        int x = se.nextInt();

        if(x % 2 == 0){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }
    }
}