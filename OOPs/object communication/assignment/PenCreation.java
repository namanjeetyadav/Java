class PenCreation{
    Pen createObject(String brand_name, String color, double price){
        System.out.println("Creating object");
        Pen p1 =  new Pen(brand_name, color,  price);
        return p1;
    }
}