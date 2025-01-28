public class Largest {
    public static void main(String[] args) {

        //create three variables 
        int a=10;
        int b=20;
        int c=15;

        //finding the largest number using conditionnal statement
        //Excecute the statement if a is greater than b
        if(a>b){
            if(a>c){
                System.out.println(a+" is the largest number.");
            }
        }

        //Excecute the statement if b is greater than a
        else if(b>a){
            if(b>c){
                System.out.println(b+" is the largest number.");
            }
        }

        //Excecute if both statement are false
        else {
            System.out.println(c+" is the largest number.");
        }
    }    
}
