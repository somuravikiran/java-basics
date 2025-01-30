
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

class RemoveDuplicate {
    public static void main(String[] args) {
        
        List<Integer> al=new ArrayList<>();

        al.add(4);
        al.add(4);
        al.add(14);
        al.add(41);
        al.add(41);
        al.add(14);
        
        HashSet<Integer> set=new HashSet<>();

        for(int item:al){
            set.add(item);
        }

        System.out.println(set);
    
    }
    
}
