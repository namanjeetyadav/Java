// ClassWork on Object Communication:
// Write Java program to implement the above use case

// Online platform is offering wide varity of products. On online platform, payment
// method is responsible to recieve the Debit card and bill amount to make the payment.
// If the card has sufficient balance, payment method will process the payment otherwise
// payment will not process the pay.

// Write Java program to implement the above use case


class OnlinePlatform{
    public static void main(String[] args) {
        
 
        payment pay1  =  new payment();
        debitcard d1 = pay1.createObject(123456789, "Naman", 1000000.00);
        d1.display();
            }



    }

