package Interface;


    public interface Printable {
        void print();
        default void prepareForPrinting(){
            System.out.println("Preparing document for printing...");
        }
    }
    
