
import java.util.Scanner;

class Student{

    int id;
    String name;
    double marks;
    
    Student(int id, String name, double marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    void details(){
        System.out.println("Student id is "+ id + " name is " + name + " marks is " + marks );
    }
}
class MainClass6{

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the student id");
    int student_id = scan.nextInt();
    System.out.println("Enter the student name");
    String student_name = scan.next();
    System.out.println("Enter the student marks");
    double student_marks = scan.nextDouble();
    Student st1 = new Student(student_id, student_name, student_marks);
    st1.details();
}


}