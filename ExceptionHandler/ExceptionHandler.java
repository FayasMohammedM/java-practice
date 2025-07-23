package ExceptionHandler;

public class ExceptionHandler {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 0;
        try {
            int result = num1/num2;
        } catch (Exception e) {
            System.out.println("Oops...! You can't divide the number with zero");
        }
        System.out.println("Program continues...");

        int []myArray={1,2,3};
        try {
            myArray[4]=10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        String myString ="abc";
        try {
            Integer.parseInt(myString);
        } catch (NumberFormatException e) {
             System.out.println(e.getMessage());
        }

        try{
             Integer.parseInt(myString);
              myArray[4]=10;
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
             System.out.println(e.getMessage());
        }

        finally{
            System.out.println("This block always excutes regardless of exception!");
        } 
    }
}
