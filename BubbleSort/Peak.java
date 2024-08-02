package BubbleSort;

public class Peak {
    public static int next(int arr[], int index){
        for(int i=index+1;i<arr.length;i++){
            if(arr[i]!=arr[index]){
                return arr[i];
            }
        }
        return -1;
    }
    public static int prev(int arr[], int index){
        for(int i=index-1;i>=0;i--){
            if(arr[i]!=arr[index]){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,3,7,9,12,12,12,13,16,19,22,20,19,19,18,17,17,15,14,11,11,10,8,8,8,7,5,5,3,3,3,2};
        int l=0;
        int r=arr.length-1;
        int mid=r-(r-l)/2;
        while(!(arr[mid]>prev(arr, mid) && arr[mid]>next(arr, mid))){
            System.out.println("Mid="+arr[mid]+"    index="+arr[mid]);
            if(arr[mid]<prev(arr, mid)){
                r=mid;
            }else if(arr[mid]<next(arr, mid)){
                l=mid;
            }
            mid=r-(r-l)/2;
            
        }
        System.out.println(mid+""+ arr[mid]);
    }
}
