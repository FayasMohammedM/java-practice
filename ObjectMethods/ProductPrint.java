package ObjectMethods;

public class ProductPrint {
    public static void main(String[] args) {
        Product p1 = new Product("P001","Laptop");
        Product p2 = new Product("P002", "Mouse");
        Product p3 = new Product("P001", "Desktop");
        Product p4 = new Product("P003", "Keyboard");
        Product p5 = null;

        System.out.println("-----");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println("-----");

       System.out.println( p1.equals(p2));
       System.out.println( p1.equals(p3));
       System.out.println( p1.equals(p4));
       System.out.println( p1.equals(p5));
       System.out.println( p1.equals("a string object"));
System.out.println("-----");
       System.out.println(p1.hashCode());
       System.out.println(p2.hashCode());
       System.out.println(p3.hashCode());
       System.out.println(p4.hashCode());


    }
}
