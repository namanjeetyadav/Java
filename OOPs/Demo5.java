class Demo5 {
        static int x = 100;
        static int y = 200;
    void test (){
        System.out.println("running non-static method test().....");
    }
}
class Demo6{
    public static void main(String arg[]){
        System.out.println("main method started");
        System.out.println(new Demo5().x);
        System.out.println(new Demo5().y);
        new Demo5().test();
        System.out.println("main method ended");
        
        
    }
}
