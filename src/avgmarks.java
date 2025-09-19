import java.util.Scanner;
public class avgmarks {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of students:");
        int n= sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the marks of physics of each student:");
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        int sum=0;
        for(int x:arr)
        {
            sum=sum+x;

        }
        int avg=sum/n;
        System.out.println("the average is:"+avg);
    }
}