

public class PrimeNumbers {
    public static void main(String[] args) {
        
        int num=56;
        int prime=0,notprime=0;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                notprime=notprime+1;
            }
            else
            {
                prime=prime+1;
            }
        }
        if(notprime==0){
            System.out.println("Given number is a prime number.");
        }
        else{
            System.out.println("Given number is not a prime number.");
        }
    }
}
