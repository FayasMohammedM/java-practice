


public class EncapsulatedDog{
    private String name;
    private int age;

    public EncapsulatedDog(String name,int age){
        this.name= name;
        this.age=age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age= age;
    }

    public void bark(){
        System.out.println(this.name+" says Woof !  Woof !");
    }

    public int getAgeInHumanYears(){
        return this.age*7;
    }

}