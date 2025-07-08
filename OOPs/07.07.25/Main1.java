class Main1{
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setempId(919);
        emp1.setname("Ramesh");
        emp1.setdepartment("IT");
        Employee emp2 = new Employee();
        emp2.setempId(918);
        emp2.setname("Naman");
        emp2.setdepartment("Bank");
        System.out.println(emp1.getname());
        System.out.println(emp1.getempid());
        System.out.println(emp1.getdepartment());
        System.out.println(emp2.getempid());
        System.out.println(emp2.getdepartment());
        System.out.println(emp2.getname());
    
    }

}