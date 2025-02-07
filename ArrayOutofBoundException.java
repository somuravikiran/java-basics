//What is an ArrayIndexOutOfBoundsException and how can you prevent it?
class ArrayOutOfBoundsException{

    public static void main(String[] args) {
        try{
            int arr[]=new int[5];
            for(int i=0;i<10;i++){
                arr[i]=i+1;
            }
            for(int i=0;i<10;i++){
                System.out.println(arr[i]);
            }
            
        }
        catch(ArrayIndexOutOfBoundsException ae){
            
        }
    }

}