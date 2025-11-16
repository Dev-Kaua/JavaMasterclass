import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        double sum = 0;
        boolean validNumber = false;
        do{
            System.out.println("Enter the " + counter + "° number: ");
            String nextNumber = scanner.nextLine();
            try{
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
                validNumber = true;
            }catch (NumberFormatException nfe){
                System.out.println("Insert a valid number!");
                validNumber = false;
            }
        }while(counter < 5 || !validNumber);

        System.out.println("The sum of the numbers is: " + sum);
    }


}
