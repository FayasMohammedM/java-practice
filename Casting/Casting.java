public class Casting {
    public static void main(String[] args) {
        Manager myManager = new Manager();

        Employee employeeMan = myManager;

        employeeMan.work();

        // employee.conductMeeting(); because conductMeeting doesn't defined in Employee
        Employee employeeDev = new Developer();
         if (employeeDev instanceof Developer) {
            Developer dev = (Developer) employeeDev;
            dev.work();
            dev.debugCode();
         }    

         Employee newManager = new Manager();
         Developer dev = (Developer) newManager;
    }
}
