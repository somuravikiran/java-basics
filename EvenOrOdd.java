public class EvenOrOdd {
    public static void main(String[] args) {
        
        //Create a integer
        int a=10;

        //Find even and odd nubers using if-else
        if(a%2==0){
            System.out.println(a+" is a even number.");
        }
        else{
            System.out.println(a +" is a odd number.");
        }

        //create an array of integer
        int b[]={10,25,15,45,12};

        //accesing the elements of the array using for loop
        for(int i=0;i<b.length;i++){
            if(b[i]%2==0){
                System.out.println(b[i]+" is a even number.");
            }
            else{
                System.out.println(b[i]+" is a odd number.");
            }
        }
    }
}
