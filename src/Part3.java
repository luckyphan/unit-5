import java.util.LinkedList;

public class Part3 {
    public static void main(String[] args) {
//        You will be given two linked lists in “reverse-digit” format.
//        For example, the number 123 would be represented in a linked list like this: 3 → 2 → 1
//        You should return the sum of these two numbers in the same “reverse-digit” format. For 123 + 456,
//        this should return 579, in the form of a linked list like this: 9 → 7 → 5.
//
//        What is the runtime of this function?
//        the sum is calculated with O(1) then convert to string then added to list O(n)
        int num = 123;
        int num2 = 456;
//        System.out.print(toReverse(num+num2));
        int[] arr = {12, 11, 13, 5, 6};

//        insertionSort(arr);
//        quickSort(arr,0, arr.length-1);
        String[] arrStr = {"tea","supper","cha","green","bee"};

            System.out.print(recurIndex(arrStr,"target",0));
//        for (int i :arr) {
//            System.out.print(i+" ");
//        }

    }
//    public static LinkedList<String> toReverse(int num){
//        LinkedList<String> list = new LinkedList<String>();
//        String nums = Integer.toString(num);
//        for (int i = nums.length()-1; i>=0;i--){
//            String cool = String.valueOf(nums.charAt(i));
//             list.add(cool) ;
//        }
//        return list;
//    }
//    Insertion Sort Quick Sort Merge Sort
//
//    What sorting algorithms have the best runtime efficiency?
//      best runtime for best case would be Insertion Sort with O(n) but on average quick and merge sort
//      has O(n log(n))
//    What are the scenarios for the best case, worst case, and average case runtime efficiency?
//    Insertion Sort:
//        Worst-case time complexity: O(n^2)
//        Best-case time complexity: O(n)
//        Average-case time complexity: O(n^2)
//
//    Quick Sort:
//        Worst-case time complexity: O(n^2)
//        Best-case time complexity: O(n log n)
//        Average-case time complexity: O(n log n)
//
//    Merge Sort:
//        Worst-case time complexity: O(n log n)
//        Best-case time complexity: O(n log n)
//        Average-case time complexity: O(n log n)

    //insertion sort

//    public static int[] insertionSort(int[] arr){
//        for(int i = 0; i < arr.length;i++){
//            for(int j = i+1; j < arr.length;j++){
//                //swap if num is smaller than num in prev index
//                if(arr[i]>arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        return arr;
//    }
//
//    //quick sort
//    static void quickSort(int[] arr, int low, int high) {
//        if (low < high) {
//
//            int pivot = partition(arr, low, high);
//            quickSort(arr, low, pivot - 1);
//            quickSort(arr, pivot + 1, high);
//        }
//    }
//
//    static void swap(int[] arr, int i, int j)
//    {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//
//    static int partition(int[] arr, int low, int high) {
//        int pivot = arr[high];
//        int i = low-1;
//        //swap when the int is < pivot
//            for (int j = low; j <= high; j++) {
//                if(arr[j]<pivot){
//                    i++;
//                    swap(arr,i,j);
//                }
//            }
//        swap(arr, i+1,high);
//        return (i+1);
//    }

//    Find the index of an item in a list using recursion.
//
//    Implement a function that takes in an item and an array of items, and returns the 0-based index
//    of a sought item: >>> recursive_search(“hey”, [“hey”, “there”, “you”]) 0
//
//    If the item isn’t in the list, return -1: >>> recursive_search(“porcupine”,
//    [“hey”, “there”, “you”]) -1
//
//    Important: Solve this problem only with recursion—you cannot use a for or while loop in your
//    solution!
//
//    What is the runtime of this function?
//    O(n)
    public static int recurIndex(String[] arr,String desired, int index){
        if(index<arr.length) {
            //base case (the string is found)
            if (arr[index].equals(desired)) {
                return index;
            } else {
                index+=1;
                return recurIndex(arr, desired, index);
            }
        }else{
            return -1;
        }
    }
}
