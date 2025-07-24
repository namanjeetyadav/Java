class mul_div implements swapNumber{
    
 @Override
    public void swap(int a, int b) {
        System.out.println("a is " + a + "b is" + b);
      a = a * b;
      a = a/b;
      b = b * a;
      b = b/b;
        System.out.println("After swaping a is " + a + "b is" + b);
    }

}