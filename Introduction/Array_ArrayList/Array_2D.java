package Introduction.Array_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Array_2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][2];//not madetatory to add collum
        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[r].length;c++){
                arr[r][c]=sc.nextInt();
            }
        }
        sc.close();
        System.out.println(Arrays.toString(arr));
    }
}
