//1.Write a method to check if a number is even or odd.
//2.Write a method to reverse a string.
//3.Write a method to find the maximum of three numbers.
//4.Write a method to count vowels in a string.
//5.Write a method to calculate factorial of a number.

// Program1
// class Self_practice {
//     public static void main(String[] args) {
//         int num = 11;
//         if (num % 2 == 0) {
//             System.err.println("This is a even number");
//         } else {
//             System.err.println("This is a odd number");
//         }
//     }
// }
// Program 2
class Self_practice {
    public static void main(String[] args) {
       String name = "12345";
       int arlen = name.length();
       char[] arrayChar = new char[arlen];
       for (int i =arlen-1; i>=0; i--) {
           char character = name.charAt(i);
           arrayChar[arlen - 1- i] = character;
       }
           System.out.println(arrayChar);
    }
}
//Program3
// class Self_practice {

//     public static void main(String[] args) {
//         int a = 3;
//         int b = 1;
//         int c = 5;
//         if (a > b) {
//             if (a > c) {
//                 System.out.println(a);
//             }
//             else{
//                 System.out.println(c);
//             }
//         }
//         else if (b>a) {
//             if (b>c) {
//                 System.err.println(b);
//             }
//             else{
//                 System.out.println(c);
//             }
//         }

//     }
// }
