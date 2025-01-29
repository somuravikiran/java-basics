//Write a program to check whether a number is an Armstrong number.

public class Armstrong{

    public static void main(String[] args) {
    
        int num=153;

        int orginal_num=num;

        int digit=String.valueOf(num).length();
        int sum=0;
        
        while(num!=0){
            int dig=num%10;
            sum+=Math.pow(dig,digit);
            num/=10;
        }
        System.out.println(sum);
        if(orginal_num==sum){
            System.out.println("Given number is a Armstrong number");
        }
        else{
            System.out.println("Given number is not a Armstrong number");
        }

    }

}