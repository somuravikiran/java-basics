class Conversion {
    public static void main(String args[]) {

        String num1="123";
        String num2="12";
        
        //conversion from String to integer.
        int a1=Integer.parseInt(num1);  //123
        int a2=Integer.parseInt(num2);  //12
  
        //sum of two integers.
        int a3=a1+a2;   //135
        System.out.println(a3);
        //conversion from string to integer.
        String sum=Integer.toString(a3);    //"135"

       System.out.println(sum); //135
    }
}