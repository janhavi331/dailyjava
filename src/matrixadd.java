import java.util.Scanner;

public class matrixadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      /*  int rows = 2, cols = 3;
        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];
        int[][] sum = new int[rows][cols];

        System.out.println("Enter elements of first 2x3 matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second 2x3 matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        // print result
        System.out.println("Resultant Matrix (Addition):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }*/
      /*  int []arr={10,20,30,40,50};
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);         //reverse an array

        }*/


        //max element in array
        System.out.println("enter the size of array:");
        int n = sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("the maximium elemnet is:"+max);
    }
}
