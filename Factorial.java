public class Factorial{
    public static void main(String[] args) {
        
        //creeate an integer
        int num=10;

        //create a integer to store result
        int fac=1;

        //method for finding factorial of a given number
        for(int i=1;i<=num;i++){
            fac=fac*i;
        }

        System.out.println("factorial of the given number is: "+fac);
    }
}