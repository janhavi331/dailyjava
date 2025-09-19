public class methodwithobj {
    int sum(int x,int y){
        int sum;
        sum=x+y;
        return sum;
    }
    public static void main(String[]args){
        methodwithobj obj1=new methodwithobj();
        int z= obj1.sum(5,6);
        System.out.println("the sum is:"+z);
    }
}