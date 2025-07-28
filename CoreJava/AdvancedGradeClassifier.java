public class AdvancedGradeClassifier {
    public static void main (String args[]){
        double studentAverage=78.0d;
        System.out.println("Student's Average :"+studentAverage);

        if (studentAverage>=90.0) {
            System.out.println("Grade : A (Excellent!)");
        }
        else if(studentAverage>=80.0 ){
            System.out.println("Grade : B (Very Good)");

        }
        else if(studentAverage>=70.0 ){
            System.out.println("Grade : C (Good)");

        }
        else if(studentAverage>=60.0 ){
            System.out.println("Grade : D (Pass)");
        }
        else if (studentAverage<=60.0){
            System.out.println("Grade : F (Fail)");
        }
    }
}
