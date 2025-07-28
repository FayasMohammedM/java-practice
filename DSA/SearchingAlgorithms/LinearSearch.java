package DSA.SearchingAlgorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int num[] = { 5, 7, 9, 11, 13, 15 };
        int target = 13;
        int result = linearSearch(num, target);
        if (result != -1) {
            System.out.println("Element Found at Index " + result);

        } else {
            System.out.println("Element not found.");
        }

    }

    public static int linearSearch(int[] num, int target) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == target) {
                return i;
            }
        }

        return -1;

    }

}
