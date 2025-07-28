package DSA.SearchingAlgorithms;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int nums[] = { 11, 22, 33, 44, 55, 66, 77, 88 };

        int target = 44;

        int left = 0;
        int right = nums.length - 1;
        int result = binarySearchRecursive(nums, target, left, right);
        if (result != -1) {
            System.out.println("The Element found at " + result);
        } else {
            System.out.println("The Element not found");
        }

    }

    public static int binarySearchRecursive(int[] nums, int target, int left, int right) {
        if (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return binarySearchRecursive(nums, target, mid + 1, right);
            } else {
                return binarySearchRecursive(nums, target, left, mid - 1);
            }
        }

        return -1;
    }
}
