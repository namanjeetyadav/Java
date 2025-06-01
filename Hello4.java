public class Hello4 {
  public static void main(String[] args){
       String day = "mon";
       String result = "";
       result = switch(day) {
    case "sat", "sun" -> "6am";
    case "mon" -> "8am";
    default -> "7am";
};
      System.out.println("Hello");
       System.out.println(result);
      }
}