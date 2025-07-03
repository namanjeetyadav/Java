class Demo7{
int x = 100;
int y = 200;

void test(){
    System.out.println("running test() method");
}


}



class oops{
    

    public static void main(String[] args) {
        System.out.println("main method start");
        //Declare reference variable
        Demo7 d1;
        //Initilize the reference variable 
        d1 = new Demo7(); //copy ot the class, containing non-static members
        //assigning the address of object
        System.out.println("d1----> "+d1);

         Demo7 d2;
        d2 = new Demo7(); 
        System.out.println("d2----> "+d2);


        
        System.out.println("main method end");
        
    }
}