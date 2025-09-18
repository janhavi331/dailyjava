import java.sql.SQLOutput;
import java.util.Scanner;
public class sample {
    public static void main(String[] args){
        int a=10;
        int b=20;
        int c=a+b;
        String abc= "janhavi";
        System.out.println(abc);
        System.out.println(c);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1:");
        int ac=sc.nextInt();
        System.out.println("enter second number:");
        int bc=sc.nextInt();
        int sum=ac+bc;
        System.out.println("sum is:"+sum);
        String ss= sc.next();
        System.out.println("Hello"+ss+" have a good day! ");
        int i=10;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        char ch='B';
        System.out.println(ch++);
    }
}