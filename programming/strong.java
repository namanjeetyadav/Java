class strong {

static int find_factorial(int a ){
    int fac = a;

    while(a>=0){
    
     fac = fac*(fac-1);
    
    }
    return fac;
} 

    public static void main(String[] args) {
        System.out.println(find_factorial(3));

    }
}