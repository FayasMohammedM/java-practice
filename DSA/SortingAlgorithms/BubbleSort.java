package DSA.SortingAlgorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int nums []={2,6,4,5,3,9};
        int temp =0;
        System.out.println("Before Sorting");
        for (int i : nums) {
            System.out.print(i+" ");
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                if(nums[j]>nums[j+1]){
                    temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
            System.out.println();
            for (int num : nums) {
                System.out.print(num);
            }
        }
         System.out.println(" \nElements after sorting ");
        for (int i : nums) {
            System.out.print(i+ " ");
        }
    }
}
