import java.util.Scanner;
public class website {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the website url:");
        String weburl=sc.nextLine();

        if(weburl.endsWith(".com")){
            System.out.println("this is commercial website");
        }
        else if(weburl.endsWith(".in")){
            System.out.println("this is Indian website");
        } else if (weburl.endsWith(".org")){
            System.out.println("this is organisational website");
        }
        else {
            System.out.println("enter correct url");
        }
    }
}