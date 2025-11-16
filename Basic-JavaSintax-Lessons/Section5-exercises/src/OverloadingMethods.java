public class OverloadingMethods {

    public static double convertToCentimeters(int heightInInches){
        return heightInInches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int remainingHeightInInches){
        int feetToInches = heightInFeet * 12;
        int totalInches = feetToInches + remainingHeightInInches;
        return convertToCentimeters(totalInches);
    }
}
