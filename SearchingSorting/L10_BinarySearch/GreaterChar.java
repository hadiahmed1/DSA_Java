package SearchingSorting.L10_BinarySearch;

public class GreaterChar {
    public static void main(String[] args) {
        char[] arr={'d','g','k','n','o','r','w'};
        System.out.println(ceill(arr, 'j'));
    }
    static char ceill(char[] arr,char target){
        if(target>=arr[arr.length-1]) return arr[arr.length-1];
        int l=0,h=arr.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]>target) h=mid-1;
            else if(arr[mid]<target)l=mid+1;
            else return arr[mid+1];
        }
        return arr[l];
    }
}
