//Write a program to calculate the power of a number (e.g., x^n)

public class PowerOfNumber {

    public static void main(String[] args) {
        int x=5;

        int n=4;

        double power=1;

        for (int i = 0; i < n; i++) {
            power=power*x;
        }
        System.out.println("The power of given number is "+power);

        //using inbuilt method
        double pow;

        pow=Math.pow(x, n);

        System.out.println("the power of given number using inbuilt method is "+pow);


    }
    
}
