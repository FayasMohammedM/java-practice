public class MethodMagic {
    public static void main(String[] args) {
        greetUser("Fayas...!");

        int total = calculateSum(20, 88);
        System.out.println("The Sum is:"+total);

        boolean checkEven = isEven(90);
        System.out.println("Is 90 an even number? "+checkEven);

        System.out.println("Is 7 an even number? "+isEven(7));
        
        
    }

    public static void greetUser(String name){
        System.out.println("Hello "+name+"! Welcome to Method Magic.");

    
    }
    public static int calculateSum(int num1 ,int num2){
        int sum = num1+num2;
        return sum;
    }
    public static boolean isEven(int number){
        return (number%2==0);
    }
}
