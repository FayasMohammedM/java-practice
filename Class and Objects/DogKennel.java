package class_and_objects;



public class DogKennel {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", 3);
        Dog dog2 = new Dog("Lucy", 5);

        System.out.println("\n---Our dogs---");

        System.out.println("Name : "+dog1.name);
        System.out.println("Age : "+dog1.age);

        dog1.bark();
        int result =dog1.getAgeInHumanYears();
        

        System.out.println("Buddy's age in human years:"+result);

        System.out.println(dog2.name);
        System.out.println(dog2.age);
        dog2.bark();
        result = dog2.getAgeInHumanYears();

        System.out.println("Lucy's age in human years:"+dog2.getAgeInHumanYears());
    }
}
