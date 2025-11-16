import java.util.Scanner;

public class SwitchChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char variable = 'A';

        switch (variable){
            case 'A' -> {
                System.out.println("Able");
            }
            case 'B' -> {
                System.out.println("Bulldog");
            }
            case 'C' ->{
                System.out.println("Charlie");
            }
            case 'D' ->{
                System.out.println("Dog");
            }
            case 'E' ->{
                System.out.println("Easy");
            }
        }
    }
}
