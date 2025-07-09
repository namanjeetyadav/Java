import java.util.Scanner;
class user{

String username;
String email;
int phone_number;
String password;

user(String username, String email, int phone_number, String password){

this.username = username;
this.email = email;
this.phone_number = phone_number;
this.password = password;
}
void details(){
    System.out.println("Username is " + this.username);
    System.out.println("Email is " +  this.email);
    System.out.println("Phone number is " +  this.phone_number);
    System.out.println("User password is xxxxxxx");
}

}

class appRegistration{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    System.out.println("Enter the username");
    String username_ = scan.next();
    System.out.println("Enter the email");
     String useremail_ = scan.next();
    System.out.println("Enter the phone number");
     int userphonenumber_ = scan.nextInt();
    System.out.println("Enter the password");
     String userpassword_ = scan.next();

     user u1 = new user(username_, useremail_, userphonenumber_, userpassword_);
     u1.details();   

    }
}