//Write a program to find the sum of all elements in an array.

public class SumOfEle {
    public static void main(String[] args) {
        
        int a[]={5,8,9,7,6,4};

        int sum=0;
        //using foreach
        for(int item:a){
            sum+=item;
        }

        System.out.println("Sum of numbers in the array is "+sum);

        sum=0;

        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println("Sum of number in the array using for loop is "+sum);

    }
}
