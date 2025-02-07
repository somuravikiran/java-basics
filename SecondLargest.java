
import java.util.Arrays;

class SecoundLargestNumber{
    public static void main(String[] args){

        int[] a={5,6,1,2,3,4};

        Arrays.sort(a);
        for(int num:a){
            System.out.println(num);
        }
        System.out.println(a[a.length-2]);
    }
}