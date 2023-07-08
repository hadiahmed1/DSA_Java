package SearchingSorting.L9_LinearSearch;

public class Main {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8,9};
        System.out.println(linearSearch(arr,5));
    }
    static int linearSearch(int[] arr,int item){
        if(arr.length==0){//blank array
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                return i;
            }
        }//not found
        return -1;
    }
}
