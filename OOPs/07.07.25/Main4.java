class Main4{
    public static void main(String[] args) {
        product p1 = new product();
        p1.set_product_name("Table");
        p1.set_color("blue");
        p1.set_price(13000);
        System.out.println(p1.get_color());
        System.out.println(p1.get_product_name());
        System.out.println(p1.get_price());
        

        product p2 = new product();
        p2.set_product_name("Chair");
        p2.set_color("red");
        p2.set_price(16000);
        System.out.println(p2.get_color());
        System.out.println(p2.get_product_name());
        System.out.println(p2.get_price());
    


    }

}