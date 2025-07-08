class Main3{
    public static void main(String[] args) {
        mobile m1 = new mobile();
        m1.set_model("Redmi 12");
        m1.set_color("blue");
        m1.set_price(13000);
        System.out.println(m1.get_color());
        System.out.println(m1.get_model());
        System.out.println(m1.get_price());
        

        mobile m2 = new mobile();
        m2.set_model("Redmi 13");
        m2.set_color("red");
        m2.set_price(16000);
        System.out.println(m2.get_color());
        System.out.println(m2.get_model());
        System.out.println(m2.get_price());
    


    }

}