package InnerClass;

public class InnerClass {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();

        inner.display();

        outer.outerMethod();
        outer.processRunnable();

        System.out.println("\n--------------");
    }
}
