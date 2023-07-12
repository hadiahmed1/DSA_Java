package SearchingSorting.L10_BinarySearch;

public class L11_CeilFloor {
    public static void main(String[] args) {
        int[] arr={0,2,5,7,9,13,17,19,21,25,28,32,35,37,39,43,48,49,53,57,64,69,74,85,89,93,96};
        //        {0 1 2 3 4 5  6  7  8  9  10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26}
        System.out.println(ceill(arr, 18));
        System.out.println(floor(arr, 86));
    }
    static int ceill(int[] arr,int target){
        if(target>arr[arr.length-1]) return -1;
        int l=0,h=arr.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]>target) h=mid-1;
            else if(arr[mid]<target)l=mid+1;
            else return mid;
        }
        return l;
    }
    static int floor(int arr[],int target){
        if(target<arr[0]) return -1;
        int c=ceill(arr, target);
        if(arr[c]==target) return c;
        return c-1;
    }
}
