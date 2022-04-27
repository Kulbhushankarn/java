import java.util.*;
public class loop4{
    public static void main(String args[]){
        //this code is print sum of first n natural numbers
        Scanner se = new Scanner(System.in);
        int n = se.nextInt();

        int sum = 0;
        for(int i=0; i<=n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
