import java.util.*;

//This is multiplication code!
//homework code!

public class table
{
    public static void main(String args[]){
        System.out.println("Type Multiplication Number : ");

        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        


        for(int i = 1; i <= 10; ++i)
           System.out.println(n + " * " + i + " = " + n * i);
    }
}