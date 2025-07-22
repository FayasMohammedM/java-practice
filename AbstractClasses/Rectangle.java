package AbstractClasses;

public class Rectangle extends Shape{
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
}
