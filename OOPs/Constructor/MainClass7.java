class Employee{
    static int counter = 1000;
    final int id;
    
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.id = counter++;
        this.name = name;
        this.salary = salary;
    }

    void details(){
        System.out.println("Id id " + this.id + " name is " + this.name + " salary is " + this.salary);
    }


}

class MainClass7{
    public static void main(String[] args) {
     Employee em1 = new Employee("Naman", 45000 );
     em1.details();
     Employee em2 = new Employee("Naman", 45000 );
     em2.details();
        
    }
}