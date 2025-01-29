//Write a program to find the largest and smallest elements in an array.

public class LargestAndSmallest {
    public static void main(String[] args) {
        
        int a[]={4,5,8,1,2,345,555,9};

        int lar=a[0];
        int sma=a[2];

        for(int i=0;i<a.length;i++){
            if(lar<a[i]){
                lar=a[i];
            }
            if(sma>a[i]){
                sma=a[i];
            }
        }

        System.out.println("laresst number in the array is "+lar);
        System.out.println("smallest number in the array is "+sma);

    }
}
