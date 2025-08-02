class mocktest{

    public static void main(String[] args) {    
        int n=7;
        int mid = (n+1)/2;
        for (int i = 1; i <=mid; i++) {
            for (int j = 1; j < i+1; j++) {
                
            System.out.print("*");
            }
            System.out.println();
        }
    }
}