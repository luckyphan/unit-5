import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 3, 6, 5, 7, 10, 9};
        int maxNum = arr[0];
        for (int elem:arr) {
            if(elem>maxNum)
                maxNum = elem;
        }
        System.out.print(findNumber(arr,maxNum));
    }
    public static int findNumber(int[] nums, int maxNum) {
        Arrays.sort(nums);

        for (int i = 1; i < maxNum; i += 1) {
            if (i != nums[i - 1]) {
                return i;
            }
        }

        // If none is missing
        if (nums.length == maxNum && nums[maxNum - 1] == maxNum) {
            return 0;
        }

        return maxNum;
    }
//    public static int findNumber(int[] arr) {
//        int missingNumber = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (i != arr.length-1) {
//                if (arr[i + 1] != arr[i] + 1) {
//                    return arr[i] + 1;
//                }
//            }
//        }
//        return missingNumber;
//    }
//    public static int findNumber(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            if (i != arr.length-1) {
//                if (arr[i + 1] != arr[i] + 1) {
//                   return arr[i] + 1;
//                }
//            }
//        }
//        return 0;
//    }
//    What is the runtime complexity of your solutions for Step 1 and Step 2?
//      I added onto Step 1
//    What is the runtime complexity for each solution?
//
//    How do the solutions compare to yours? What improvements do you think you could have made to your solution?
//
//    How would the implementation of the Stack from Step 3 change if you were to implement a queue?

}