public class voidfun {
   static void change(int a){
       a=98;
   }
   static void changearr(int[]arr){
       arr[0]=98;
   }
   public static void main(String[]args)
   {
       int x=25;
       change(x);
       System.out.println("the value of x after change is:"+x);
     int[]arr={10,20,30,40,50};
       changearr(arr);
       System.out.println("arr[0] after change is:"+arr[0]);
   }
}