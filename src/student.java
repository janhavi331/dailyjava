import java.util.Scanner;
public class student {
    public static void main(String[] args)
    {
        System.out.println("take input of student marks");
        Scanner sc =new Scanner(System.in);
        int marathi = sc.nextInt();
        int  hindi =sc.nextInt();
        int english=sc.nextInt();
        int history=sc.nextInt();
        int science=sc.nextInt();
        int total=marathi+hindi+history+english+science;
        Float p= (total/500F)*100;
        System.out.println("the percentage of student is :"+p);
    }
}