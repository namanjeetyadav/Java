class Employee{
    String name, company;
    double salary;

    public Employee(String name, String company, double salary ) {
    this.name = name;
    this.company = company;
    this.salary = salary;
    }

    void details(){

        System.out.println(name + " " + company + " " + salary);
       
    }

    
}