
class bank_ac {

    String name;
    int account_no;
    String account_type;
    String ifsc;

     void setname(String arg) {
        name = arg;
    }

    void set_account_no(int arg) {
       account_no = arg;
    }

    void set_account_type(String arg) {
        account_type = arg;
    }
     void set_ifsc(String arg) {
        ifsc = arg;
    }

     String getname() {
        return name;
    }

    int get_account_no() {
       return account_no;
    }

    String get_account_type() {
        return account_type;
    }
     String get_ifsc() {
        return ifsc;
    }

    

}