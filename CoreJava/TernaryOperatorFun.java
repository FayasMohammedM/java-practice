public class TernaryOperatorFun {
public static void main(String []args ) {
    int number = 7;
    String oddEvenStatus = (number%2==0)? "Even":"Odd";
    System.out.println("The Number "+number+" is "+oddEvenStatus);

    int age =17;
    int VOTING_AGE = 18; 
    String eligibilityMessage = (VOTING_AGE>=age)? "Eligible to vote":"Not yet eligible to vote";

    System.out.println("Your age is "+age+"\n You are Eligibilty:"+eligibilityMessage);


}
    
}
