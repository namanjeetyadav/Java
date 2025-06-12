class Program7{
    public static void main(String[] args) {
        System.out.println("program started");
        // int num =9;
        // if (num==9 || num==12 || num==18)
        //  {
        //     System.out.println("FIZZ");
        // }
        
        // else if(num==10 || num==20 ){
        //     System.out.println("BUZZ");
        // }
        //  else if(num==15 || num==30){
        //     System.out.println("Number is not divisble by 2 and 5");
        // }
        

        int num = 9;
        if (num%3==0 && num%5 ==0) {
            System.out.println("FIZBUZZ");
        }
        else if (num%3==0) {
            System.out.println("FIZZ");
        }
        if (num%5==0) {
            System.out.println("BUZZ");
            
        }





        System.out.println("Program ended");
    }
}