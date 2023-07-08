package SearchingSorting.L9_LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={0,1,7,3,4,2,4,7,2,9,3,9,5,8,2,6,4,5,6,7,2,9,5,3,7};
        System.out.println(linearSearchInRange(arr, 7, 8, 12));
    }
    public static int linearSearchInRange(int[] arr,int item,int ri,int rj){
        if((arr.length<ri) && (ri<rj)){//blank array
            return -1;
        }
        for(int i=ri;i<=rj;i++){
            if(arr[i]==item){
                return i;
            }
        }//not found
        return -1;
    }

}
