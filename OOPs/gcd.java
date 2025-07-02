class gcd {

    public static void main(String[] args) {
        int n = 2;
        int m = 5;
        
   System.out.println(gcd(n, m));
    }

    public static int gcd(int n, int m) {
        int gcd = 0;
        
        if (m == n*2) { 
           
            return n;
        } 
        else if (n==m*2) { 
          
            return m;

        } 
        else {
            for (int i = 1; i <= n && i <= m; i++) {
                if(n%i==0 && m%i==0){
               gcd = i;
                }
            }
        }

        return gcd;
    }
}
