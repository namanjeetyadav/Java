
public class dec_to_hexa {

    static String dec_to_sting(int a) {
        int dec = a;
        String str = "";
        while (dec > 0) {

            int res = dec % 16;
            char h;
          
        if(dec<10){
         res =dec + res;
        }
        else{

        }
 

 



            str = res + str;
            dec = dec / 8;
        }
        return str;

    }

    public static void main(String[] args) {
        String result = dec_to_sting(75);
        System.out.println(result);

    }
}
