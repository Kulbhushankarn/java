// import java.util.*;
import java.util.*;

public class demoloop6 {

    public static void main(String[] args) {
        //code for multiplication of numbers
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if(N>=2||N<=20){
            for(int i=1;i<=10;i++){
                
                System.out.println(N+" x "+i+" = "+N*i );
            }
        }
    }
}