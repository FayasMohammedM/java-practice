package AbstractClasses;

public class AbstractShape {
    public static void main(String[] args) {
        // Shape myAbstractShape = new Shape("Generic");
        System.out.println("\n---Demonstrating Concrete Shape Objects---");
        Circle myCircle = new Circle("My Circle", 5.0);
        Rectangle myRectangle = new Rectangle("My Rectangle", 4.0, 6.0);
        System.out.println();
        myCircle.displayInfo();
        System.out.println("Area :"+myCircle.calculateArea());
        System.out.println("Radius :"+myCircle.getRadius());
        System.out.println();
        myRectangle.displayInfo();
        System.out.println("Area :"+myRectangle.calculateArea());
        System.out.println("Length :"+myRectangle.getLength()+"\nBreadth :"+myRectangle.getBreadth());

        System.out.println("\n---Demonstrating Polymorphic Shape References---");

        Shape polymorphicCircle = new Circle("Poly Circle",7.0);
        Shape polymorphicRectangle = new Rectangle("Poly Rectangle",5.0,4.0);

        polymorphicCircle.displayInfo();
        System.out.println("Area :"+polymorphicCircle.calculateArea());
        

        polymorphicRectangle.displayInfo();
        System.out.println("Area :"+polymorphicRectangle.calculateArea());

        System.out.println("\n---Abstract Classes Demo Concluded---");
        

    }
}
