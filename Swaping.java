

public class Swaping {
    public static void main(String[] args) {
        
        //swaping two variables using third varable
        //creating three variables
        int a=10;
        int b=5;
        int c;

        //swaping method usinng third variable
        c=a;
        a=b;
        b=c;

        System.out.println("swapping two variables using third variable: a="+a+", b="+b);

        //swaping two variables without using third variable 
        //creating two variables
        int d=20;
        int e=15;
        //swaping method
        d=d+e;
        e=d-e;
        d=d-e;

        System.out.println("swapping two variables without using third variable: d="+d+", e="+e);
    }
}
