class Program2 {
    
    public static void sumAry(){
     
     int[] arr1 = {1,2,3,4,5};
         int result =0;
     for (int i = 0; i < 5; i++) {
       result = result +arr1[i];
     }
       System.out.println("Sum of all the number is " + result);
       System.out.println("The average of all the numbers is " + result/5);

    }
    
    
    
    public static void main(String[] agrs){
     sumAry();
    } 
     }