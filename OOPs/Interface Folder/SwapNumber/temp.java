class temp implements swapNumber{

    @Override
    public void swap(int a, int b) {
        System.out.println("a is " + a + "b is" + b);
        int temp = a;
        a = b;
        b = a;
        System.out.println("After swaping a is " + a + "b is" + b);
    }
  
}