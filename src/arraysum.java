import java.util.Scanner;
public class arraysum{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        float[] arr = new float[n];
        System.out.println("enter" + n + "float values");
        for (int i = 0; i < n; i++)
        {
            arr[i]=sc.nextFloat();
        }

        float sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("sum is :"+sum);



    }
}