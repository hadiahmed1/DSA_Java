package BubbleSort;
class Ceilling{
    public static void BinarySearch(int[] arr,int item){
        int l=0;
        int r=arr.length-1;
        int mid=0;
        while(l<=r){
            mid=(r+l)/2;
            if(item<arr[mid]){
                r=mid-1;
            }else if(item>arr[mid]){
                l=mid+1;
            }else{
                break;
            }
        }
        System.out.println("Target="+item+"  Mid="+mid+"  l="+l+"  r="+r);
    }
    public static void main(String[] args) {
                //{0,1,2,3,4,5, 6, 7, 8, 9}
        int[] arr={1,3,5,6,8,9,13,25,18,20};
        for(int i=1;i<=20;i++){
            BinarySearch(arr, i);
        }

    }
}