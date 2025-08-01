class watch{
    String model, color;
    double price;

    public watch(String model, String color, double price ) {
    this.model = model;
    this.color = color;
    this.price = price;
    }

    void details(){

        System.out.println(model + " " + color + " " + price);
       
    }

    
}