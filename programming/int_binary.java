public class int_binary {

    static String dec_to_sting(int a){
   int dec = a;
   String str ="";
  while(dec>1){

   int res = dec%2;

   str =  res+ str;
   dec=dec/2;
  }
   return str;

    }
  public static void main(String[] args){
       String result = dec_to_sting(18);
       System.out.println(result);
       

      
      }
}

