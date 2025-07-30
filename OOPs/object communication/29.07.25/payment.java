class payment{
    debitcard createObject(int card_number, String cardholder_name, double card_balance){
        System.out.println("Creating object");
        debitcard d1 =  new debitcard(card_number, cardholder_name,  card_balance);
        return d1;
    }
}