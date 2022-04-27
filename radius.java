//this code is find to area of circles 
//homework code!
import java.util.Scanner;
public class radius{
    public static void main(String args[]){
        int radius;
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle :");
        radius = sc.nextInt();
        area = (radius*radius)*Math.PI;
        System.out.println("Area of circle is :" + area);
    }
}