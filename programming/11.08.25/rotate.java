import java.util.Arrays;

class rotate{

  


    public static void main(String[] args) {

   int a[] = {10,20, 30, 40};
   int size = a.length;

int k =2;

for(int j =1; j<=k; k++){


   int first = a[0];
      for (int i = 1; i <=size-1; i++) { 
      a[i-1] = a[i];
   }
    a[size -1] = first;
   

}

System.out.println(Arrays.toString(a));





    }
}