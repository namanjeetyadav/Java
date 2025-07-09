class account{
int account_no;
String name;
double account_balance;

account(String name, double account_balance){
    this.account_no = (int)(Math.random()*100000);
    this.name = name;
    this.account_balance = account_balance; 
}



void details(){
System.out.println("Account number: " + this.account_no + " Name:" + this.name + " Account balance:" + account_balance);
}

}

class MainClass8{
    public static void main(String[] args) {
        account ac1 = new account("Naman", 45666);
        ac1.details();
    }
}