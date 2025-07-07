class Animal{
    int a = 10;
    int b = 20;
  static int c = 13;
    void sound(){

    }
}




class object1{
    public static void main(String[] args) {
        
Animal obj1 = new Animal();
 System.out.println(obj1.a);
 System.out.println(obj1.b);
// Change the value of in obj1
obj1.a = 1000;
obj1.b = 2000;
 Animal obj2 = obj1;
  System.out.println(obj2.a);
 System.out.println(obj2.b);

obj1 = new Animal();
System.out.println(obj1.a);
System.out.println(obj1.b);

System.out.println(Animal.c);
Animal.c = 26;
System.out.println(Animal.c);

    }
}