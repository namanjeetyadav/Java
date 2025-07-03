class Demo7{
int x = 100;
int y = 200;

void test(){
    System.out.println("running test() method");
}


}



class oops2{
    

    public static void main(String[] args) {
        System.out.println("main method start");
       Demo7 d1,d2, d3;
       d1 = new Demo7();

       d2 = d1;
       d3 = d2;
        System.out.println("d1----> "+d1);

     
        System.out.println("d2----> "+d2);
        System.out.println("d3----> "+d3);
        
        d1.x =1000;
        d1.y =2000;
        System.out.println(d1.x);
        System.out.println(d2.y);

        
        System.out.println("main method end");
        
    }
}