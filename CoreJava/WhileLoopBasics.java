public class WhileLoopBasics {
    public static void main (String [] args){
        int countdown = 5;
        System.out.println("Starting Countdown");
        while (countdown >0) {
            System.out.println(countdown);
            countdown--;
            
        }
        System.out.println("Blast off!");

        int sum = 0;
        int numberToAdd=1;  
        System.out.println("Summing numbers 1 to 5:");
        while (numberToAdd<=5) {
            sum +=numberToAdd;
            numberToAdd++;
        }
        System.out.println("Final Sum:"+sum);
    }
}
