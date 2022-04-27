import java.util.*;
//this is if else months show code
public class months{
    public static void main(String args[]){
        System.out.println("Type the number:");
        Scanner se = new Scanner(System.in);
        int button = se.nextInt();
        if(button == 1){
            System.out.println("January");
        } else if(button == 2){
            System.out.println("February");
        } else if(button == 3){
            System.out.println("March");
        } else if(button == 4){
            System.out.println("April");
        } else{
            System.out.println("Error");
        }
    }
}