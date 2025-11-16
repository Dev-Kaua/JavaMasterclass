public class SecondAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
    }

    public static String getDurationString(int seconds){
        if(seconds < 0){
            return "Invalid value";
        }
        int hours = seconds / 3600;
        int remainingFromHours = seconds % 3600;
        int minutes = remainingFromHours / 60;
        int remainingSecondsFromMinutes = remainingFromHours % 60;

        return hours + "h " + minutes + "m " + remainingSecondsFromMinutes + "s";
    }
    public static String getDurationString(int minutes, int seconds){
        if(seconds < 0 || seconds > 59){
            return "Seconds must be between 0 and 59";
        } else if (minutes < 0) {
            return "Minutes must be bigger or equal to zero";
        }
        int hours = minutes / 60;
        int remainingMinutesFromHours = minutes % 60;
        return hours + "h " + remainingMinutesFromHours + "m " + seconds + "s ";
    }
}
