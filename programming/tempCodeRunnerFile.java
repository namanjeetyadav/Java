public class fibo {

   static void fibo_method(int n){
    int a = 0;
  int b = 1;

  System.out.print(a + " " + b);
  for(int i = 2; i<n; i++){
    int next = a + b;
    System.out.print(next + " ");
   a = b;
   b = next;



  }

   } 



  public static void main(String[] args){
      
       fibo_method(10);

      
      }
}

