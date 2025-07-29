class Pen{
    String brand_name;
    String color;
    double price;

    Pen(String brand_name, String color, double price){
        this.brand_name = brand_name;
        this.color = color;
        this.price = price;
    }

    void display(){
        System.out.println(brand_name);
        System.out.println(color);
        System.out.println(price);
    }

}