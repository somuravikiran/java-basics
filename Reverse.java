public class Reverse {
    public static void main(String[] args) {
        
        //create an integer
        int num=185;

        int rev=0;

        //method for reverse the integer using while method
        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }

        System.out.println("Reverse of the given number is: "+rev);
    }
}
