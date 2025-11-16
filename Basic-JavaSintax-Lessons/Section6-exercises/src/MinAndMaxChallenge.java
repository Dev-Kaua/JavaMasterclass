import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maxNumber = 0;
        double minNumber = 0;
        int loopCount = 0;

        while(true){
            System.out.println("Enter a number or any character to exit: ");
            String input = scanner.nextLine();
            try {
                double validNum = Double.parseDouble(input);
                if (loopCount == 0 || validNum < minNumber){
                    minNumber = validNum;
                }
                if (loopCount == 0 || validNum > maxNumber){
                    maxNumber = validNum;
                }
                loopCount++;
            }catch (NumberFormatException nfe){
                break;
            }
        }

        if (loopCount > 0){
            System.out.println("min = "+ minNumber + ", max = "+ maxNumber);
        }else {
            System.out.println("No number entered...");
        }
    }
}
