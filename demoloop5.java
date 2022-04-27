import java.util.*;
public class demoloop5{
    //question of n natural number print
    
    public static void main(String args[]){
        Scanner se = new Scanner(System.in);
        int n = se.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}