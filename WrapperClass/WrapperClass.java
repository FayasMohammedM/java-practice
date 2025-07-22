package WrapperClass;

public class WrapperClass {
    public static void main(String[] args) {
        System.out.println("---1)Integer Wrapper Class---");

        int primitiveInt = 10;
        System.out.println("Original primitive int :"+primitiveInt);

        Integer myWrappedInt = primitiveInt;
        System.out.println("Autoboxed object : " + myWrappedInt);
        System.out.println("Class of myWrappedInt :"+myWrappedInt.getClass().getName());

        Integer anotherWrappedInt =24;
        System.out.println("Another Integer Object :"+anotherWrappedInt);
        int unboxedValue = anotherWrappedInt;
        System.out.println("Primitive int : "+unboxedValue);

        String numString = "465";
        int parsedInt =Integer.parseInt(numString);
        System.out.println("String \""+numString+"\" parsed to int: " +parsedInt);

        String intToStr = Integer.toString(primitiveInt);
        System.out.println("Primitve Int"+primitiveInt+"to String :\""+intToStr+"\"");
    }
}


