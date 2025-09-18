import java.util.Scanner;
public  class studentd{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter 1subject mark");
         float a=sc.nextInt();
        System.out.println(" enter 1subject mark");
       float b= sc.nextInt();

        System.out.println(" enter 1subject mark");
         float c=sc.nextInt();
    float total= a+b+c;
    float p=(total/300)*100;
        System.out.println(p);
    if(p>40)
    {
        System.out.println("pass");
    }
    else {
        System.out.println("fail");
    }
    }
}