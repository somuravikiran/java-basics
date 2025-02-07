//Write a program to print the Fibonacci series up to n terms
public class Fibonacci {
    
    public static void main(String[] args) {
        
        int n=64;

        int a=0;
        int b=1;

        if(n>0){
            System.out.println("fibonacci numbers are ");
            for(int i=0;i<n;i++){
                int next=a+b;
                a=b;
                b=next;
                System.out.println(next);
            }
        }
        else{
            System.out.println("given number is not positive");
        }

    }

}