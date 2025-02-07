public class NullCount {
    
    public static void main(String[] args) {
        
        String a[]={null,null,"ravi",null};
        int count=0;
        for(int i=0;i<a.length;i++){
            
            if(a[i]==null){
                count++;
            }

        }
        System.out.println(count);

    }

}

