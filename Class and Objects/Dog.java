package class_and_objects;
public class Dog {
    String name;
    int age;

public Dog(String name, int age){
this.name=name;
this.age=age;
}

public void bark(){
    System.out.println(this.name+" says Woof! Woof!");
}

public int getAgeInHumanYears(){
 return this.age*7;
}
}

