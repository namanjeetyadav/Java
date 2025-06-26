
import com.sun.net.httpserver.Authenticator;
import java.lang.classfile.constantpool.DoubleEntry;

// class whole_square{
//     public static int square(int n){
//         return n*n;
//     }
//     public static void main(String[] agrs){
//        int result = square(5) + square(10) + 2*5*10;
//        System.out.println(result);
//     }
// }
// class whole_square {
//     public static int area_triangle(int base, int height) {
//         return  base * height * 1/2;
//     }
//     public static void main(String[] agrs) {
//         int  result = area_triangle(10, 20);
//         System.out.println(result);
//     }
// }
// class whole_square {
//     public static double  gstCalculation(double amount, double rate) {
//         return  amount * rate/100;
//     }
//      public static double  amountwithGST(double tax_amount, double amount ) {
//         return tax_amount + amount ;
//     }
//     public static void main(String[] agrs) {
//         double  tax_amount = gstCalculation(1000, 18);
//         System.out.println(tax_amount);
//         double final_amount = amountwithGST(tax_amount, 1000);
//         System.out.println(final_amount);
//     }
// }
// class whole_square {
//     public static double  diameter(double rad) {
//         return  rad*2;
//     }
//      public static double  area(double rad) {
//         return  rad*rad*2*3.14;
//     }
//      public static double  circumference(double rad) {
//         return  rad*2*3.14;
//     }
//     public static void main(String[] agrs) {
//         double  result1 = diameter(10);
//         System.out.println(result1);
//         double  result2 = area(10);
//         System.out.println(result2);
//          double  result3 = circumference(10);
//         System.out.println(result3);
//     }
// }


 class whole_square {

    public static boolean check_odd_even(int num) {
        if(num % 2 == 0) {
          
            return true;
        } 
        else {
            
            return false;
        }
    }

    public static void main(String[] agrs) {

        System.out.print(check_odd_even(10));
    }
}
