public class Sum3And5Challenge {
    public static void main(String[] args) {
        int totalSum = 0;
        int numberCounter = 0;
        for (int i = 1; i <= 1000; i++){
            if(i % 3 == 0 && i % 5 == 0){
                totalSum += i;
                numberCounter ++;
                System.out.println("The number: "+ i + " has met the divisable conditions!");
            }
            if (numberCounter == 5){
                break;
            }
        }

        System.out.println("The total sum of the numbers above is: "+ totalSum);
    }
}
