package SearchingSorting.L9_LinearSearch;
import java.util.Arrays;
import java.util.Scanner;
public class Search_2D {
    public static void main(String[] args) {
        int[][] arr=new int[4][3];//not madetatory to add collum
        input_2D(arr);
        print_2D(arr);
        int[] ans=search_2D(arr, 7);
        System.err.println(Arrays.toString(ans));
    }
    public static int[] search_2D(int arr[][],int item){
        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[r].length;c++){
                if(arr[r][c]==item){
                    return new int[]{r,c};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void input_2D(int[][] arr){
        Scanner sc=new Scanner(System.in);
        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[r].length;c++){
                arr[r][c]=sc.nextInt();
            }
        }
        sc.close();
    }
    public static void print_2D(int[][] arr){
        System.out.println();
        for(int[] c:arr){
            for(int e: c){
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }
}
