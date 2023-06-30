import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        practice l4 = new practice("Mcquire", null);
//        practice l3 = new practice("Tuyet", l4);
//        practice l2 = new practice("Nhat", l3);
//        practice l1 = new practice("Thanh", l2);
//
//        practice temp =l1;
//
//        practice l5 = new practice("Hat", null);
//
//        //traverse the linkedlist
//        while(temp != null){
//            if(temp.next == null){
//                temp.setNext(l5);
//                break;
//            }
//            temp = temp.next;
//        }
//
//        System.out.println("Insert Hat");
//        System.out.println(l1.toString());
//        l4.setNext(null);
//        System.out.println(l1.toString());
//
//
//        temp = l1;

        //insert at certain index (at 2)
//        while(temp != null){
//            if(temp.person.equals("Nhat")){
//                l5.setNext(temp.next);
//                temp.setNext(l5);
//            }
//            temp = temp.next;
//        }
//        System.out.println("Insert Hat at 2");
//
//        System.out.println(l1.toString());
//WHY DOES NEXT AND SETNEXT WORK THE SAME FOR ADD AT THE END OF THE LIST

//        HashMap<String, List<String>> foods= new HashMap<String, List<String>>();
//        List<String> C = new ArrayList<String>(){
//            {
//            add("Croissant");
//            add("Celery");
//            add("Cauliflower");
//
//            }
//        };
//        List<String> D = new ArrayList<String>(){
//            {
//                add("Donut");
//                add("Doritos");
//                add("Dairy");
//
//            }
//        };
//        List<String> E = new ArrayList<String>(){
//            {
//                add("Eggplant");
//                add("Elephant Ear");
//                add("Eggs");
//
//            }
//        };
//        foods.put("C",C);
//        foods.put("D",D);
//        foods.put("E",E);
//
//        for (String food: D) {
//            System.out.print(food);
//        }
//
//        System.out.print(foods.get("E"));

        //BST
    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }

        private Node addRecursive(Node current, int value) {
            if(current == null){
                return new Node(value);
            }

            if(value < current.value){
                current.left = addRecursive(current.left, value);
            }else if (value > current.value){
                current.right = addRecursive(current.right, value);
            }else{
                return current;
            }
            return current;
        }

        private boolean getContainsRecursive(Node current, int value) {
            if(current == null){
                return false;
            }
            if(value == current.value){
                return true;
            }
            return value < current.value ? getContainsRecursive(current.left, value) :getContainsRecursive(current.right, value);
        }
    }
    }
}
