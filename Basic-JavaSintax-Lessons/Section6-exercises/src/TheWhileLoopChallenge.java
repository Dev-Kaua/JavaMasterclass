public class TheWhileLoopChallenge {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int evenNumbersCounter = 0;
        int oddNumbersCounter = 0;
        while(number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                oddNumbersCounter++;
                continue;
            }
            System.out.println("The number " + number + " is a even number");
            evenNumbersCounter++;
            if (evenNumbersCounter >= 5){
                break;
            }
        }

        System.out.println("------ Quantity of ------\n"+ "Odd numbers: "+ oddNumbersCounter
                + "\nEven numbers: "+ evenNumbersCounter);
    }

    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }
}
