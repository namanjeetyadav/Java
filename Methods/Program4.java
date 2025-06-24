class Program4{
    public static void gstCalculator(double billAmount, double gstRate) {
        double Amount = (billAmount*gstRate)/100;
        System.out.println("The interest gst amount is " + Amount);
    }
    
    public static void main(String[] args) {
        gstCalculator(100.00, 15);
    }
}