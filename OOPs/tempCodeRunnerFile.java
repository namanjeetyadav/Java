class nearprime{
    public static void main(String[] args){
 
int n =10;
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


public static boolean checkPrime(int n){
    if(n<=1){
        return false;
    }
    for (int i = n; i <n/2 ; i++) {
        if (n%1==0) {
         return false;   
        }
    }
        return true;
    }
}
