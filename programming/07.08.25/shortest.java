// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class shortest {
        public static void main(String[] args) {
       

       int shortest = 2;
       HashSet<Integer> hs = new HashSet<>();
       int[] arr = {10, 10,20,20,30,40,10,20,50};
       
       for(int i=0; i<=arr.length-1; i++){
           hs.add(arr[i]);
       }
       int[] arrUnique = new int[hs.size()];
        
        int index =0;
       for(int el:hs){
           arrUnique[index++]=el; 
    
}

Arrays.sort(arrUnique);
// Printing 2nd smallest number
System.out.println(arrUnique[shortest-1]);
// System.out.println(Arrays.toString(arrUnique)); 
       
       
       
    }
}