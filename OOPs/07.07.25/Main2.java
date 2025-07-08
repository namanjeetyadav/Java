class Main2{
    public static void main(String[] args) {
        bank_ac c1 = new bank_ac();
        c1.setname("Naman");
        c1.set_ifsc("SBIN00");
        c1.set_account_type("Saving");
        c1.set_account_no(123456);
        bank_ac c2 = new bank_ac();
        c2.setname("Shivam");
        c2.set_ifsc("ICICI0");
        c2.set_account_type("Current");
        c2.set_account_no(456799);
    
      System.out.println(c1.getname());
      System.out.println(c1.get_ifsc());
      System.out.println(c1.get_account_no());
      System.out.println(c1.get_account_type());

      System.out.println(c2.getname());
      System.out.println(c2.get_ifsc());
      System.out.println(c2.get_account_no());
      System.out.println(c2.get_account_type());
    


    }

}