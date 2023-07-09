package SearchingSorting.L10_BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int arrA[]={0,2,5,7,8,9,14,17,19,25,27,32,38,41,46};
        System.out.println(binarySearchAscending(arrA, 7));
        int arrD[]={29,27,24,21,18,16,13,9,7,5,3,1,0};
        System.out.println(binarySearchDecending(arrD, 29));
    }
    static int orderAgnosticBinarySearch(int[] arr,int target){
        if(arr[0]<arr[arr.length-1]) return binarySearchAscending(arr, target);
        else return binarySearchDecending(arr, target);
    }
    static int binarySearchAscending(int[] arr,int target){
        int l=0,h=arr.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]>target) h=mid-1;
            else if(arr[mid]<target)l=mid+1;
            else return mid;
        }
        return -1;
    }
    static int binarySearchDecending(int[] arr,int target){
        int l=0,h=arr.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]<target) h=mid-1;
            else if(arr[mid]>target)l=mid+1;
            else return mid;
        }
        return -1;
    }
}
