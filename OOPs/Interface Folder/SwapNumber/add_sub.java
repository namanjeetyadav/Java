class add_sub implements swapNumber{
 @Override
    public void swap(int a, int b) {
        System.out.println("a is " + a + "b is" + b);
       a = a + b;
       a = a - a;
       b = b + a;
       b = b - a;
        System.out.println("After swaping a is " + a + "b is" + b);
    }
}