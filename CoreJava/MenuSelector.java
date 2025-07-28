public class MenuSelector {
    public static void main(String [] args){
    String menuChoice = "Pause";
    
    System.out.println("You selected: " + menuChoice);

    switch (menuChoice) {
        case "Start":
            System.out.println("Starting the Process");
            break;

    case "Stop":
    System.out.println("Stopping the process");
    break;

    case "Pause":
    System.out.println("Pausing the process");
    break;

    case "Exit":
    System.out.println("Exiting the application");
    break;

        default:
        System.out.println("Help");
            break;
    }
}
}
