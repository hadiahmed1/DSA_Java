public class product {
    public static void main(String[] args) {
        int[] nums={5,2,7,4,3,9};
        int[] before=new int[nums.length];
        int[] after=new int[nums.length];
        before[0]=1;
        after[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
            before[i]=before[i-1]*nums[i-1];
            after[nums.length-i-1]=after[nums.length-i]*nums[nums.length-i];
        }
        int[] answer=new int[nums.length];
        for(int i=0;i<answer.length;i++){
            answer[i]=before[i]*after[i];
            System.out.println(answer[i]);
        }
    }
}
