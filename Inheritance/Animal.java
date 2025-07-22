package Inheritance;


public class Animal {
    private String species;
    private int age;

    public Animal(String species,int age){
        this.species=species;
        this.age=age;
    }
        public String getSpecies(){
            return this.species;
        }

        public int getAge(){
            return this.age;
        }

        public void makeSound(){
            System.out.println("The "+this.species+" makes generic sound.");
        }
    
}
