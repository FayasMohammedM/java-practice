package Interface;

public class Circle extends Shape implements Printable,Scalable{
    private double radius;

    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }
    
    public double getRadius(){
        return radius;
    }
    @Override
    public void print() {
        System.out.println("Printing Circle: [Shape Name] with Area: [Calculated Area]");
    }

    @Override
    public void scale(double factor) {
        radius = radius*factor;

        System.out.println("New Radius :"+radius);
    }
}
