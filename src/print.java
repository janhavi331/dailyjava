import java.awt.*;
import java.util.Scanner;

public class print {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n= sc.nextInt();
       // do {
          //  System.out.println("i: " + i);
          //  i = i + 1;//print 1 to n
        //}while(i<=n);
       /* for(int i=1;i<n;i++)
        {
            if(i%2 !=0){
                System.out.println(+i);//odd number
            }
        }*/
     /*   for (int i = 5; i >= 1; i--) {         // rows
            for (int j = 1; j <= i; j++) {     // print i stars
                System.out.print("* ");
            }
            System.out.println();
        }*/
        //int i=1;
      // int sum=1;
      /*  while (i<=n)
        {
            sum=sum+i;//sum of first n number
            i++;
        }
        System.out.println("the sum of first "+n +" number is:"+sum);*/
      /*  while (i<=10)
        {
            sum=n*i;
            i++;
            System.out.println(+sum);// multiplication table
        }
      //  System.out.println(+sum);*/
    /*    for(int i=10;i!=0;i--)
        {
            sum=n*i;

            System.out.println(+sum); //table in reverse order
        }*/
      /*  long fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial is:"+fact);*/
      /*  int mul=1;
        int i=1;
        int sum=0;
        while(i<=10)
        {
            mul=n*i;
            sum=sum+mul;    //to print sum of mul table
            i++;
        }
        System.out.println("sum is :"+sum);*/
     /*   for(int i=1;i<10;i++)
        {
            System.out.println(5);//print 5 using for loop
        }*/
        int []arr={10,20,30,40,50};
        int num= arr.length;
        System.out.print("{");
        for (int i =num-1;i>=0; i--)
        {
            System.out.print(arr[i]);
            if(i!=0)
            {
                System.out.print(",");
            }
        }
        System.out.print("}");

    }
}
