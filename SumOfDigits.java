//Write a program to find the sum of digits of a number.

public class SumOfDigits {
    
    public static void main(String[] args) {
        
        int num=54321;

        int sum=0;

        while(num!=0){
            int digit=num%10;
            sum=sum+digit;
            num/=10;
        }

        System.out.println("Suum of all digits in given number="+sum);

    }

}
