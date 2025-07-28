

 
public class EncapsulatedDogKennel {
    public static void main(String[] args) {
       EncapsulatedDog dog1 = new EncapsulatedDog("Buddy",3);
       EncapsulatedDog dog2 = new EncapsulatedDog("Lucy", 5);

       System.out.println("\n --- Encapsulated Dogs ---");
       System.out.println(dog1.getName());
       System.out.println(dog1.getAge());
       System.out.println(dog2.getName());
       System.out.println(dog2.getAge());

       System.out.println("\n ---Modifying Dog 1 ---");
       dog1.setName("Max");
       dog1.setAge(4);

       dog1.bark();

       System.out.println(dog1.getName()+"'s age in  human years :"+dog1.getAgeInHumanYears());

       dog2.bark();

       System.out.println(dog2.getName()+"'s age in Human years :"+dog2.getAgeInHumanYears());

    }
}
