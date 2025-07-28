package DSA.SearchingAlgorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int num[] = { 11, 13, 15, 16, 20, 22 };
        int target = 20;

        int result = binarySearch(num, target);
        System.out.println("The Index of the Element :"+result);
    }

    public static int binarySearch(int[] num, int target) {
        int left = 0;
        int right = num.length - 1;

        while (left <= right) {
            int mid = (right + left) / 2;

            if (num[mid] == target) {
                return mid;
            } else if (num[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
