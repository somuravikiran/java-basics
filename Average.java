
import java.util.LinkedList;
import java.util.List;

//Write a program to find the average of a list of numbers.
public class Average {

    public static void main(String[] args) {
        
        List<Integer> list=new LinkedList<>();

        list.add(4);
        list.add(425);
        list.add(114);
        list.add(41);
        list.add(14);
        list.add(8);

        int len=list.size();
        int sum=0;
        for(int item:list){
            sum=sum+item;
        }

        System.out.println("Sum of the list "+sum);

        double avg=sum/len;

        System.out.println("avg of the list "+avg);
    }
    
}
