public class ArrayExplorer {
    public static void main(String[] args) {
        String[] studentNames=new String[4];
        studentNames[0]="ALice";
        studentNames[1]="Bob";
        studentNames[2]="Charlie";
        studentNames[3]="Diana";

        System.out.println(studentNames[2]);

        System.out.println(studentNames.length);

        int studentScores[] = {85,92,78,65};
         
        System.out.println("---Student Scores---");
       
        for (int i = 0; i < studentScores.length; i++) {
            System.out.println("Score at "+i+" : "+studentScores[i]);
            
        }

        studentScores[1]=95;

        System.out.println("\n---Scores After Update---");

        for (int i = 0; i < studentScores.length; i++) {
            System.out.println("Score at"+i+":"+studentScores[i]);
            
        }
    }
}
