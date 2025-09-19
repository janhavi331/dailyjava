public class vararray {
    public static int sum(int ...arr)
    {
        int sum=0;
        for(int a:arr){
            sum+=a;
        }
        return sum;
    }
    public static void main(String[]args)
    {
        System.out.println("the sum of 5 and 6 is:"+sum(5,6));
        System.out.println("the sum of 5 and 6 and 7 is:"+sum(5,6,7));
        System.out.println("the sum of 5 and 6 and 7 and 8 is :"+sum(5,6,7,8));
    }
}