/**
 * BitManipulation
 */
import java.util.*;
public class BitManipulation {
    public static int decimalToBinary(int num){
        int bi=0;
        int mul=1;
        while(num>0){
            bi=bi+(num%2)*mul;
            num=num/2;
            mul=mul*10;
        }
        return bi;
    }
    public static int binaryToDecimal(int bi){
        int num=0;
        int mul=1;
        while(bi!=0){
            num=num+(bi%10)*mul;
            bi/=10;
            mul*=2;
        }
        return num;
    }
    public static int getBit(int num,int pos){
        int mask = 1<<pos;
        if((mask & num)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int setBit(int num,int pos){//setting bit to one
        int mask = 1<<pos;
        return num | mask;
    }
    public static int clearBit(int num,int pos){
        int mask=~(1<<pos);
        return num & mask;
    }
    public static int toggleBit(int num,int pos){
        int mask = 1<<pos;
        return num^mask;
    }
    public static void main(String[] args) {
        System.out.print("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Num after Left Shift="+ (num<<1));
        System.out.println("Num after Right Shift="+ (num>>1));
        System.out.println("Binary of Number is: "+decimalToBinary(num));
        System.out.println("GET BIT");
        // for(int i=0;i<8;i++){
        //     System.out.println("Bit at position "+i+" is: "+getBit(num,i));
        // }
        // System.out.println("SET BIT");
        // for(int i=0;i<8;i++){
        //     int set=setBit(num, i);
        //     System.out.println("Set="+set+", BI="+decimalToBinary(set));
        // }
        // System.out.println("CLEAR BIT");
        // for(int i=0;i<8;i++){
        //     int clear=clearBit(num, i);
        //     System.out.println("clear="+clear+", BI="+decimalToBinary(clear));
        // }
        System.out.println("TOGGLE BIT");
        for(int i=0;i<8;i++){
            int toggle=toggleBit(num, i);
            System.out.println("toggle="+toggle+", BI="+decimalToBinary(toggle));
        }
        sc.close();
    }
}