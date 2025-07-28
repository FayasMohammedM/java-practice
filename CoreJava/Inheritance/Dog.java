package Inheritance;
public class Dog extends Animal{
    private String breed;

    public Dog (String species,int age ,String breed ){
super(species,age);
this.breed=breed;
    }

    public String getBreed(){
        return this.breed;
    }

    @Override
    public void makeSound(){
        System.out.println("The "+this.breed+" bark: Woof! Woof!");
    }
}
