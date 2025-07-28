public class MiniGradeCalculator {
    public static void main (String args[]){
        int mathScore = 75;
        int scienceScore =80;
        int englishScore =65;

        double passingThreshold = 60.0d;


        int totalScore=mathScore+scienceScore+englishScore;
        double averageScore = totalScore/3.0d;
        int remainder = totalScore%3;

        if(averageScore>=passingThreshold)
        System.out.println("Congratulations ! \n Average Score:"+averageScore+"Status:Passed..!");
        else
        System.out.println("Keep Practicing! \n Average Score:"+averageScore+"Status:Failed..!");
System.out.println("Your total score:"+totalScore);
System.out.println("Remainder:"+remainder);

    }
    
}
