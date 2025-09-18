import java.util.Scanner;
public class STR{

    public static void main (String[] args)
    {
        Scanner sc =new Scanner(System.in);
        String ab=sc.nextLine();
        System.out.println(ab);
        //String  pq="janhavi";

        int abc  =ab.length();
        System.out.println(abc);
        System.out.println(ab.toUpperCase());
        System.out.println(ab.replace(' ' ,'_'));
    }
}