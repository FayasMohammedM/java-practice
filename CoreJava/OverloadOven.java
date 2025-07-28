public class OverloadOven {
    public static void main(String[] args) {
       printDetails("Greetings Fayas...!");
       System.out.println();
       printDetails("Fayas", 23);
       System.out.println();
       printDetails(25.0d);
       System.out.println();
       printDetails("Laptop", 300000, 3);
       
    }
    public static void printDetails(String message){
System.out.println("Message: "+message);
    }
    public static void printDetails(String name,int age){
        System.out.println("Name :"+name+", Age :"+age);
    }
    public static void printDetails(double value){
        System.out.println("Value :"+value);
    }
    public static void printDetails(String item,double price,int quantity){
        System.out.println("Item :"+item+", Price :$"+price+", Quantity :"+quantity);
    }
}
