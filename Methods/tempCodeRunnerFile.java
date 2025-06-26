ass Self_practice {
    public static void main(String[] args) {
       String name = "aman";
       int arlen = name.length();
       char[] arrayChar = new char[arlen];
       for (int i =arlen-1; i>=0; i--) {
           char character = name.charAt(i);
           arrayChar[arlen - 1- i] = character;
       }
           System.out.println(arrayChar);
    }
}