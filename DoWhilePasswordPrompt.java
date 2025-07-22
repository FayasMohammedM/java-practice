public class DoWhilePasswordPrompt {
    public static void main(String[] args) {
        String correctPassword = "java123";
        String enteredPassword = "";

        System.out.println("Welcome to secure system!");
        do {
            enteredPassword = "Wrong";
            System.out.println("Please enter your password:"+enteredPassword);
            
        } while (!enteredPassword.equals(correctPassword));
   
        System.out.println("Access Granted! \n Welcome");
    }
}
