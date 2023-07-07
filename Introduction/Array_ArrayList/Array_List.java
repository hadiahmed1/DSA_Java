package Introduction.Array_ArrayList;
import java.util.ArrayList;
public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> li=new ArrayList<>();
        li.add(5);
        li.add(9);
        li.add(72);
        li.add(3);
        li.add(4);
        li.add(13);
        li.add(8);
        li.add(67);
        li.add(35);
        li.add(3);
        System.out.println("li="+li);
        System.out.println("li.contains(7)="+li.contains(7));
        System.out.println("li.contains(7)="+li.contains(8));
        li.set(0, 2);
        System.out.println("li="+li);
        System.out.println("li.get(4)="+li.get(4));
    }   
}
