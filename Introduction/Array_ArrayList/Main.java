package Introduction.Array_ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("n=");
        int n=sc.nextInt();
        sc.close();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=i*2;
        }
        for(int element: arr){//for each element in arr
            System.out.print(element+",");
        }
        System.out.println("\n"+Arrays.toString(arr));
    }
}       
