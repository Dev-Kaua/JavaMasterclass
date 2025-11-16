//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double firstVariable = 20.0;
        double secondVariable = 80.0;
        double result = (firstVariable + secondVariable) * 100;
        System.out.println("my values total is: "+ result);
        double remainder = result % 40.0;
        System.out.println("The remainder is: "+ remainder);
        boolean isNoRemainder = (remainder == 0) ? true : false;
        System.out.println("is there no remainder? --> "+ isNoRemainder);
        if(!isNoRemainder){
            System.out.println("There is some remainder!");
        }
    }
}