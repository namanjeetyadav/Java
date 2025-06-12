class Program5{
    public static void main(String[] args) {
        System.out.println("program started");
        int num1 =2;
        int num2 =3;
        int num3 =1;
        if (num1> num2) {
            if(num1 > num3){
                System.out.println(num1 + " is greatest");
            }
        }
        else if(num2 > num3){
            System.out.println(num2 + " is greatest" );
        }
        
        else{
            System.out.println(num3 + " is greatest") ;
        }
        System.out.println("Program ended");
    }
}