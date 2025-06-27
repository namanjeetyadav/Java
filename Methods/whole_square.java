

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


//  class whole_square {

//     public static boolean check_odd_even(int num) {
//         if(num % 2 == 0) {
          
//             return true;
//         } 
//         else {
            
//             return false;
//         }
//     }

//     public static void main(String[] agrs) {

//         System.out.print(check_odd_even(10));
//     }
// }

// Q. Define a method by name sumOfElements(). The method should accept the int type array. 
// Method should calculate sum of all elements of the given array and return the sum to the caller method

 class whole_square {

    public static int sum_array(int[] arr) {
        int result = 0;
        for(int i=0; i<arr.length; i++){
            result = result + arr[i];
        }
            return result;

    }

    public static void main(String[] agrs) {
       int[] arr = {10, 12, 30};
        System.out.print(sum_array(arr));
    }
}