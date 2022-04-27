import java.util.*;
//This code is find to area of circle
public class news{
    public static void main(String args[]){
        int num;
        System.out.println("Type the radius:");
        Scanner se = new Scanner(System.in);
        num = se.nextInt();
        double pi = 3.142, area;
        area = pi * num * num;
        System.out.println("Area of circle is:" + area);
    }
}