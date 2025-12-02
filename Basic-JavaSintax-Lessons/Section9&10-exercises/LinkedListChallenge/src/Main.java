import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance){
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class Main {
    public static void main(String[] args) {

        LinkedList<Place> placesToVisit = new LinkedList<>();


        var iterator = placesToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;


        printMenu();

        while(!quitLoop){
            if (!iterator.hasPrevious()){ //we are at the start of the list
                System.out.println("Originating: " + iterator.next());
                forward = true;
            }
            if (!iterator.hasNext()){ //we are at the end of the list
                System.out.println("Originating: " + iterator.previous());
                forward = false;
            }

            System.out.println("Enter value: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);

            switch (menuItem){
                case "F":
                    System.out.println("User wants to go forward");
                    if (!forward){
                        forward = true;
                        if (iterator.hasNext()){
                            iterator.next(); //adjusting position to next
                        }
                    }
                    if (iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;
                case "B":
                    System.out.println("User wants to go backwards");
                    if (forward){
                        forward = false;
                        if (iterator.hasPrevious()){
                            iterator.previous(); //adjusting position to previous
                        }
                    }
                    if (iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
                case "M":
                    printMenu();
                    break;
                case "L":
                    System.out.println(placesToVisit);
                    break;
                case "Q":
                    quitLoop = true;
                    break;
                default:
                    System.out.println("Please, select a valid option");
                    break;
            }
        }
    }

    public static void addPlace(LinkedList<Place> yourList, Place placeAdded){
        if (yourList.contains(placeAdded)){
            System.out.println("The place " + placeAdded + " already exists in the list " + yourList);
            return;
        }

        for (Place p : yourList){
            if (p.name().equalsIgnoreCase(placeAdded.name())){
                System.out.println("The place " + placeAdded + " already exists in the list " + yourList);
                return;
            }
        }

        int matchedIndex = 0;
        for (var listPlace : yourList){
            if (placeAdded.distance() < listPlace.distance()){
                yourList.add(matchedIndex, placeAdded);
                return;
            }
            matchedIndex++;
        }

        yourList.add(placeAdded);
    }

    public static void printMenu(){
        System.out.println("""
                Avaliable actions (select word or letter):
                (F)orward
                (B)ackwards
                (L)ist places
                (M)enu
                (Q)uit
                """);
    }

}