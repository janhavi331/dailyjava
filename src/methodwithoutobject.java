import java.util.Scanner;
public class methodwithoutobject {
    static int operation(int x,int y){
        int z;
        if(x<y){
            z=x+y;
        }
        else {
            z=x-y;
        }
        return z;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the first number: ");
        int a= sc.nextInt();
        System.out.print("enter the Second number: ");
        int b= sc.nextInt();
        int c;
        c=operation(a,b);
        System.out.println("the result is:"+c);
    }

}