// A person 

class Person {
  String name;
    int age;
    String gender;

Person(String a, int b, String c){
 name = a;
    age = b;
    gender = c;

}
void disp(){
    System.out.println(name + " " + age +  " "+  gender);


}
}
class Student extends Person {
        int roll_no;
        double marks;
        String school_name;

        Student(int a, double b, String c) {
         super("Naman", 22, "Male");
            roll_no = a;
            marks = b;
            school_name = c;

        }
        void disp(){
            super.disp();
    System.out.println(roll_no + " " + marks  +  " "+  school_name);


}

    }
    class Employee extends Person {
        int id;
        int salary;
        String company_name;

  Employee(int a, int b, String c) {
        super("Naman", 22, "Male");
            id = a;
            salary = b;
            company_name = c;
            }
        
    
        void disp(){
            super.disp();
    System.out.println(id + " " + salary  +  " "+  company_name);


}
    
    }
    public class MainClass{

    public static void main(String[] agrs){

     Employee emp1 =  new Employee(1112, 100000, "TAXBRICK");
     Student std1 =  new Student(11, 100, "TAX");

     emp1.disp();
     std1.disp();
    }
    }

