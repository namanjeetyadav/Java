
class patterns {

    public static void main(String[] args) {
        //     int count =1;
        //    for (int i = 1; i <= 5; i++) {
        //        for (int j = 1; j <= 5; j++) {
        //           System.out.printf(count%2 + " "); 
        //           count++;
        //        }
        //        System.out.println();
        //    } 
             /*1 0 1 0 1 
             0 1 0 1 0 
             1 0 1 0 1 
             0 1 0 1 0 
             1 0 1 0 1
         */
    //          int count = 1;
    //   for (int i = 1; i <= 5; i++) {
    //            for (int j = 1; j <= 5; j++) {
    //               System.out.printf("%3d", count ); 
    //               count = count+2;
    //            }
    //            System.out.println();
    //        } 
            /*  1  3  5  7  9
            11 13 15 17 19
            21 23 25 27 29
            31 33 35 37 39
            41 43 45 47 49*/

    //   for (int i = 1; i <= 5; i++) {
    //            for (int j = 1; j <= i; j++) {
    //               System.out.printf("*" ); 
    //            }
    //            System.out.println();
    //        } 
                /*
                 *
                 **
                 ***
                 ****
                 ***** 
                 */
        //    for (int i = 1; i <= 5; i++) {
        //        for (int j = 1; j <= i; j++) {
        //           System.out.printf("%3d",i); 
        //        }
        //        System.out.println();
        //    } 
          /*
               1
               2  2
               3  3  3
               4  4  4  4
               5  5  5  5  5
           */

    //   for (int i = 1; i <= 5; i++) {
    //            for (int j = 1; j <= i; j++) {
    //               System.out.printf("%3d",j); 
    //               if(j==4) break;
    //            }
    //            System.out.println();
    //        } 
              /* 1
                 1  2
                 1  2  3
                 1  2  3  4
                 1  2  3  4   */

        //  char cc = 'a';
        //  for (int i = 1; i <= 5; i++) {
        //        for (int j = 1; j <= i; j++) {
        //           System.out.print(cc + " "); 
        //        }
        //        cc++;
        //        System.out.println();
        //    } 

                 /*a 
                   b b
                   c c c
                   d d d d
                   e e e e e */

        //  for (int i = 1; i <= 5; i++) {
        //      char cc = 'A';
        //        for (int j = 1; j <= i; j++) {
        //           System.out.print(cc + " "); 
             
        //        cc++;
        //        }
        //        System.out.println();
        //    }
                /*A 
                A B
                A B C
                A B C D
                A B C D E
                */
        //    int count =1;
        //     for (int i = 1; i <= 5; i++) {
        //        for (int j = 1; j <= i; j++) {
        //           System.out.print(count + " "); 
             
        //        count++;
        //        }
        //        System.out.println();
        //    }
               /* 1 
                  2 3
                  4 5 6
                  7 8 9 10
                  11 12 13 14 15
                  */

 
            for (int i = 1; i <= 5; i++) {
               for (int j = i; j >= 1; j--) {
                  System.out.print(j + " "); 
                 
               }

               System.out.println();
           }


    }
}
