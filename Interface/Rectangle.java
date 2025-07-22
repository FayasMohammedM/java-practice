package Interface;

public class Rectangle extends Shape implements Printable,Scalable{
    private double length;
    private double breadth;

    public Rectangle(String name , double length , double breadth){
        super(name);
        this.length=length;
        this.breadth=breadth;
    }

    @Override
    public double calculateArea() {
        
        return length*breadth;
    }

    public double getLength(){
        return length;
    }

    public double getBreadth(){
        return breadth;
    }

    @Override
    public void print() {
        System.out.println("Printing Rectangle: [Shape Name] with Area: [Calculated Area]");
    }

    @Override
    public void scale(double factor) {
        length = length*factor;
        breadth = breadth *factor;

        System.out.println("New Length:"+length+"\n New Breadth:"+breadth);
    }
}
