public class Palindrome {

    public static void main(String[] args) {
        //create an integer
        int num=1001;
        int num1=num;
        int rev=0;

        //method for reverse the integer using while method
        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }

        //method to find given number is a palindrome
        if(rev==num1){
            System.out.println("given number is a palindrome");
        }
        else{
            System.out.println("given number is not a palindrome");
        }


    }
    
}
