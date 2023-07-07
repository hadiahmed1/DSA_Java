package Introduction.Array_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> li=new ArrayList<>();
        //intiitalization
        for(int i=0;i<3;i++){
            li.add(new ArrayList<>());
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                li.get(i).add(sc.nextInt());
            }
        }
        System.out.println(li);
        sc.close();
    }
}
