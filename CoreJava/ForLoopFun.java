public class ForLoopFun {
    public static void main(String[] args) {
        System.out.println("Counting up to 10");
       
        for( int i=1;i<=10;i++){
            System.out.println(i);

        }

        System.out.println("\nCounting down from 5 ");
        for(int i=5;i>=1;i--){
            System.out.println(i);
        }

        System.out.println("Sum of even numbers from 2 to 10");
        int evenSum =0;
        for (int i=2;i<=10;i+=2) {
            evenSum +=i;
        }
        System.out.println("Sum of even num:"+evenSum);
    }
}
