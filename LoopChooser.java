public class LoopChooser {
    public static void main(String[] args) {
        int secretNumber = 7;
        int guess = 0;
        System.out.println("----Guessing Game----");

        while (secretNumber != guess) {
           
                System.out.println("Current Guess:" + guess);
                guess++;
            
        }
        System.out.println("Correct the number was:" + secretNumber);

        // I am selecting while because I've guess untill find the correct one

        System.out.println("\n---Repeating Phrase---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Java is fun");
        }
        // I am selecting for loop because I am already knew how many times have to perform
         

        double accountBalance = 100.0d;
        double withdrawalAmount = 20.0d;
        System.out.println("\n---Account Withdrawal---");
        do {
            accountBalance -= withdrawalAmount;
            System.out.println("Withdrew $"+withdrawalAmount+"Remaining Balance:$"+accountBalance);
        } while (accountBalance>=withdrawalAmount);

        System.out.println("Insufficient funds.Final balance :$"+accountBalance+".");

        //I am selecting Do while because the atleast have to run once.
    }
}
