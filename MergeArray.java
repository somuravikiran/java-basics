
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MergeArray {
    public static void main(String[] args) {
        
        List<Integer> al=new ArrayList<>();

        al.add(5);
        al.add(53);
        al.add(25);
        al.add(52);
        al.add(15);
        al.add(51);

        List<Integer> a2=new ArrayList<>();

        a2.add(5);
        a2.add(35);
        a2.add(225);
        a2.add(512);
        a2.add(153);
        a2.add(511);

        System.out.println("first array: "+al);
        System.out.println("secound array: "+a2);
        
        for(int item:al){
            a2.add(item);
        }

        System.out.println("Merged array: "+a2);

        
    }
}
