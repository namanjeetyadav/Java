class nearprime{
    public static void main(String[] args){
 
int n =100;
int n1 = n;
int n2 = n;

int counter =0;

while (true) { 
    if(checkPrime(n1)){
    break;
    }
    counter++;
    n1++;
}
while (true) { 
    if(checkPrime(n2)){
    break;
    }
    n2--;
    
    counter++;
}

if((n-n2)<=(n1-n)){
    System.out.println("Nearest prime is " + n2);
    }
    else{
        System.out.println("Nearest prime is " + n1);
    }



}
public static boolean checkPrime(int n){
    if(n<=1){
        return false;
    }
    for (int i = 2; i <=n/2 ; i++) {
        if (n%i==0) {
         return false;   
        }
    }
        return true;
    }



}