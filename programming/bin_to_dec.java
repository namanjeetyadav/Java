class bin_to_dec{

 static void binary_to_decimal(int arg){
    
     int num =arg;
     int result = 0;

   
     int p = 0;
     int i = 1;
     int rem = 0;
    while(num>=0){
        rem =num%10;

       int pow=  (int)Math.pow(2, p) * rem;
        result += (10) + pow;
        num =num/10;
        p++;
    
    }
        System.out.println(result);



  }

    public static void main(String[] args) {
        int a = 10100;
        binary_to_decimal(a);
    }
}