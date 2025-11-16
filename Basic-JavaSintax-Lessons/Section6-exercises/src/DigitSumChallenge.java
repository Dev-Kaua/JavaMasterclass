public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("The sum digits of 125 is "+ sumDigits(125));
        System.out.println("The sum digits of 985 is "+ sumDigits(985));
    }

    public static int sumDigits(int number){
        if (number < 0 ){
            System.out.println("The number needs to be positive.");
            return -1;
        }
        int numbersSum = 0;
        while (number >= 1){
            numbersSum += number % 10;
            number /= 10;
        }

        return numbersSum;
    }
}
