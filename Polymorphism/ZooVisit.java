    package Polymorphism;
    import Inheritance.Animal;
    import Inheritance.Dog;

    public class ZooVisit {
        public static void main(String[] args) {
            Animal animalRef;
            System.out.println("---Visiting Animals at Zoo---");

            System.out.println("---Visiting a Lion(As Animal)---");
            animalRef = new Animal("Lion",5);
            System.out.println("Species :"+ animalRef.getSpecies());
            System.out.println("Age :"+animalRef.getAge()+" years");
            animalRef.makeSound();
        
            System.out.println("---Visiting a Pug(As Animal)");
            animalRef = new Dog("Canine",3,"Pug");
            System.out.println("Species :"+animalRef.getSpecies());
            System.out.println("Age :"+animalRef.getAge()+" years");
            animalRef.makeSound();

            System.out.println("\n ---Visiting the entire Zoo(Polymorphic Array)---");
             Animal[] zooResidents = new Animal[3];
             zooResidents[0]= new Animal("Elephant", 3);
             zooResidents[1]=new Dog("Canine",6,"Labrador");
             zooResidents[2]=new Animal("Zebra",7);

             for (Animal animal : zooResidents) {
                System.out.println("\nEncountering a:"+animal.getSpecies()+"\nAge :"+animal.getAge() +" years");
                animal.makeSound();
             }
             System.out.println("\n---Zoo Visit Concluded---");

            
        }
    }
