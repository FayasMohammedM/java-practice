package Inheritance;
public class AnimalShelter {
    public static void main(String[] args) {
        System.out.println("\n---Generic Animal---");

        Animal genericAnimal = new Animal("Cat",2);

        System.out.println("Species "+genericAnimal.getSpecies());
        System.out.println("Age "+genericAnimal.getAge());
        genericAnimal.makeSound();

        System.out.println("\n---Our Dog---");
        Dog myDog = new Dog("Canine",4,"Golden Retriever");

        System.out.println("Species(inherited): "+myDog.getSpecies());
        System.out.println("Age(inherited): "+myDog.getAge());

        System.out.println("Breed(specific): "+myDog.getBreed());

        myDog.makeSound();
    }
}
