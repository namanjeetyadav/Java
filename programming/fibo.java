// public class fibo {

//    static void fibo_method(int n){
//     int a = 0;
//   int b = 1;

//   System.out.print(a + " " );
//   while(b <=n){
//     int next = a + b;
//     System.out.print(b + " ");
//    a = b;
//    b = next;
//   }
//    } 
//   public static void main(String[] args){   
//        fibo_method(10);
//       }
// }

public class fibo {

static void fibo_method(int n){
  int a = 0;
  int b = 1;
 
  System.out.print(a + " ");
  while(b<=10){
    int next = a +b;
    System.out.print(b + " ") ;
    a = b;
    b  = next;
  }
}

static void fibo_til(int n){
  int a = 0;
  int b = 1;
 int count =2;
  System.out.print(a + " ");
  while(count<=n){
    int next = a +b;
    System.out.print(b + " ") ;
    count++;
    a = b;
    b  = next;
  }
}







  public static void main(String[] args){   
    //  fibo_method(10);
fibo_til(5);
      }
}


