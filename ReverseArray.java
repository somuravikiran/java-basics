//Write a program to reverse an array.

public class ReverseArray {
    public static void main(String[] args) {
        
    
        int a[]={4,2,8,1,5,6};
        int b[]=new int[a.length];
        int k=0;
        for(int i=a.length-1;i>=0;i--){
            b[k]=a[i];
            k++;
        }
        for(int j=0;j<b.length;j++){
            System.out.println(b[j]);
        }
    }   
}
