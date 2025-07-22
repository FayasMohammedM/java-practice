package Interface;

import java.util.ArrayList;
import java.util.List;

public class Interface {
    public static void main(String [] args){
        // Printable p = new Printable() {
            // We have to implement those two abstract methods
        // };
        Circle myCircle = new Circle(null, 0);
        Rectangle myRectangle = new Rectangle(null, 0, 0);

        Printable myPrint = myCircle;
        myPrint.print();
        myPrint.prepareForPrinting();

        myPrint = myRectangle;
        myPrint.print();
        myPrint.prepareForPrinting();

        Scalable myScale = myCircle;
        myScale.scale(2.0);

        myScale = myRectangle;
        myScale.scale(0.5);

        List<Printable>printableShapes = new ArrayList<>();
        printableShapes.add(myCircle);
        printableShapes.add(myRectangle);

        for (Printable shape : printableShapes) {
            shape.print();
            shape.prepareForPrinting();
        }
    }
}
