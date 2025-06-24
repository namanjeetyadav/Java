class Program3{
    public static void simpleInterest(double principle, double rate, double time ) {
        double Amount = (principle*rate*time)/100;
        System.out.println("The interest amount is " + Amount);
    }
    
    public static void main(String[] args) {
        simpleInterest(1000.00, 15, 5);
    }
}