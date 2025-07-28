package StaticMembers;

public class StaticMembers {

    static int instanceCount = 0;
    String objectName;

    public StaticMembers(String name) {
        this.objectName = name;
        StaticMembers.instanceCount++;
        System.out.println("Object '" + this.objectName + "' created. Total instances: " + StaticMembers.instanceCount);
    }

    public static String getWelcomeMessage() {
        return "Welcome to the Static Members Demo!";
    }

    public static void displayInstanceCount() {
        System.out.println("Current total instances created (from static method): " + StaticMembers.instanceCount);
    }

    static {
        System.out.println("Static block executed: Class 'StaticMembersDemo' is being loaded!");
    }

    public static void main(String[] args) {

        System.out.println("\n--- Starting Main Method ---");

        System.out.println(StaticMembers.getWelcomeMessage());

        System.out.println("\n--- Creating Objects ---");
        StaticMembers obj1 = new StaticMembers("FirstObject");
        StaticMembers obj2 = new StaticMembers("SecondObject");
        StaticMembers obj3 = new StaticMembers("ThirdObject");

        System.out.println("\n--- Displaying Final Count ---");
        StaticMembers.displayInstanceCount();

        System.out.println("\n--- End of Main Method ---");
    }
}