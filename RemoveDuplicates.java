
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list=Arrays.asList(1,2,3,4,5,1,2,3,4,5);
        Set<Integer> set=new HashSet<>(list);
        System.out.println(set);
        list.clear();
        list.addAll(set);

        System.out.println(list);
    }
}