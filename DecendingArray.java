import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DecendingArray {
    
    public static void main(String[] args) {
        
        List<Integer> al=new ArrayList<>();

        al.add(5);
        al.add(56);
        al.add(45);
        al.add(15);
        al.add(55);
        al.add(25);

        List<Integer> al1=al.stream()
                            .sorted(Comparator.reverseOrder())
                            .collect(Collectors.toList());

        System.out.println(al1);


    }

}
