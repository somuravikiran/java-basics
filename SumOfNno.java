//Write a program to find the sum of the first n natural numbers

public class SumOfNno {
    
    public static void main(String[] args) {
        
        int n=65;
        int sum=0;
        int i=1;

        //sum of n natural numbers using while loop
        while(i<=n){
            sum=sum+i;
            i++;
        }

        System.out.println("Sum of "+n+" natural number is "+sum);

        //sum of n natural numbers using for loop
        sum=0;
        for(int j=1;j<=65;j++){
            sum=sum+j;
        }
        System.out.println("Sum of "+n+" natural number is "+sum);
    }

}
