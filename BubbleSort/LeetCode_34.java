package BubbleSort;
class LeetCode_34 {
    public static int[] searchRange(int[] arr, int target) {
        int l=0,h=arr.length;
        int mid=h-(h-l)/2;
        while(l<=h){
            mid=h-(h-l)/2;
            if(target<arr[mid]){
                h=mid-1;
            }else if(target>arr[mid]){
                l=mid+1;
            }else{
                break;
            }
            
        }
        l=mid;
        h=mid;

        while(true){
            if(l==0) break;
            if(arr[l-1]==target) l--;
            else break;
        }

        while(true){
            if(h>=arr.length-1){
                break;
            }
            if(arr[h+1]==target){
                h++;
            }else{
                break;
            }
        }
            int[] r={l,h};
            return r;
    }
    public static void main(String[] args) {
        int arr[]={5,7,7,8,8,10};
        int ar[]=searchRange(arr,8);
        System.out.println(ar[0]+","+ar[1]);
        
    }
}