class pattern_02{
    



    public static void main(String[] args) {
        // int n = 5;
    // for (int i = 1; i <=n ; i++) {
    //     for (int j = 1; j <=n-i ; j++) {
    //         System.out.print("   ");
    //     }
    //     for (int j = 1; j <=2*i-1 ; j++) {
    //         System.out.print(" * ");
    //     }
    //     System.out.println();
    // }     
        //     *
        //    ***
        //   *****  
        //  ******* 

 int n = 5;
for (int i = 5; i < 5; i++) {
    for (int j = 1; j <n-i ; j++) {
      System.out.println(" " );  
    }
    for (int k = 1; k < 2*i-1; k++) {
        System.out.println("");
    } 
}        









    }
}

