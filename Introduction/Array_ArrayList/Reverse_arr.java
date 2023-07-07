package Introduction.Array_ArrayList;

import java.util.Arrays;

public class Reverse_arr {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            swap(arr,i,arr.length-i-1);
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
