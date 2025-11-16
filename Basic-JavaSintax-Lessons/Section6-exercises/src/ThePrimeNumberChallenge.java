public class ThePrimeNumberChallenge {
    public static void main(String[] args) {
        int primeNumberCounter = 0;
        System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number");
        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number");
        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number");
        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number");
        System.out.println("4 is " + (isPrime(4) ? "" : "NOT ") + "a prime number");

        for (int number = 400; number <= 1000; number += 3){
            System.out.println(number + " is " + (isPrime(number) ? "" : "NOT")
                    + " a prime number!");
            if (isPrime(number)){
                primeNumberCounter++;
                System.out.println("Since it's a prime number, the counter has grown up to: "
                        + primeNumberCounter);
            }
            if (primeNumberCounter == 3){
                break;
            }
        }
    }

    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <= 2){
            return (wholeNumber == 2);
        }

        for(int divisor = 2; divisor <= wholeNumber / 2; divisor++){
           if (wholeNumber % divisor == 0){
               return false;
           }
        }
        return true;
    }
}
