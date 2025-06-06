public class QS_ex{
public static void main(String[] args){


//Approach 
//1. First decide how many variables are required 
//2. Create variable and initialize the variables
//3. build the expression based on the problem statement 
//4. assign expression result to another variable
//5. print all the necessay variables with proper message

// Q. A batsman has scored runs in 3 different innings. Write a program to find total score and a



// Scanner sc = new Scanner(System.in);

    // int score1 = 10;
    // int score2 = 20;
    // int score3 = 30;
    // int total_score;
    // float average_score;

    // total_score = score1 + score2 + score3;
    // average_score = total_score/3;

    // System.out.println(total_score);
    // System.out.println(average_score);


//Q. A customer had added 3 products in the cart. Each product size is different. 
//online shopping platform is giving discount of 15%. Write program to find total price before discount and 
// total price after discount.  

//     int product1_price =100;
//     int product2_price = 200;
//     int product3_price = 300;


//     int total_before_dis= product1_price + product2_price + product3_price;
//     float discount_amount = total_before_dis*15/100;
//     float total_after_dis=total_before_dis - discount_amount;

// System.out.println(total_before_dis);
// System.out.println(total_after_dis);


// Q. Write a program to calculate following
// 1. diameter of a circle
// 2. area of circle
// 3. circumference of a circle


// // 1. diameter of circle

// float radius = 10.2f;
// float diameter = radius *2;
// final float pi= 3.14f; 
// System.out.println(diameter);

// //2. 

// float area = pi * radius * radius;
// System.out.println(area);

// //3. 

// float circumference = 2 * pi * radius;
// System.out.println(circumference);


// 4. A customer has a account with balance of Rs10000.00, Customer has deposited Rs5000.00
// first and later customer has withdraw Rs. 3000.00. Write java program for the above operation 
//and print the account balance after each transaction

float total_balance = 10000.00f;
System.out.println("Current balance is " + total_balance);

float first_tran = 5000.00f;
total_balance = total_balance + first_tran;
System.out.println("After first transaction " + total_balance);
float second_tran = 3000.00f;
total_balance = total_balance - second_tran;
System.out.println("After second transaction " + total_balance);




}

}