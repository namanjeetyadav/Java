class debitcard{
    int card_number;
    String cardholder_name;
    double card_balance;

    debitcard(int card_number, String cardholder_name, double card_balance ){
        
        this.card_number = card_number;
        this.cardholder_name = cardholder_name;
        this.card_balance = card_balance;
    }
void display(){
        System.out.println(card_number);
        System.out.println(cardholder_name);
        System.out.println(card_balance);
    }
}