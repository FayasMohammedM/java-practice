package FinalKeyword;

public class FinalKeyWord {
    public static void main(String[] args) {
        
        System.out.println(Constants.MAX_VALUE);

        ParentClass parent = new ParentClass();
        parent.displayMessage();

        ImmutableClass immutable = new ImmutableClass();
        immutable.getInfo();
    }
}
