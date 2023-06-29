import java.util.*;

public class Part2 {
    public static void main(String[] args) {
//        Write a function that takes in a string and returns true or false depending on whether that string has balanced
//        parentheses. A string has balanced parantheses if every opening paranthesis “(“ has a matching closing paranthesis “)”
//     that closes the corresponding opening paranthesis.
//
//    For the purposes of this problem, you only need to worry about parentheses “(“and “)”, not other opening-and-closing
//    marks, like curly brackets, square brackets, or angle brackets.

//        String parenth = "(())((e";
//        Stack<String> stack = new Stack<String>();
//        String[] c = parenth.split("");
//        for (String cc: c) {
//            if(cc.equals("(")) {
//                stack.push(cc);
//            }
//            else if(cc.equals(")")){
//                if(stack.peek().equals("(")){
//                    stack.pop();
//                }else{
//                    //the stack doesnt have the corresponding open parenth
//                    System.out.println("isnt balanced");
//                    System.exit(0);
//                }
//            }else{
//                System.out.println("not valid");
//                System.exit(0);
//            }
//        }
//        for (String cc: stack) {
//            System.out.println(cc);
//
//        }
//        if(stack.isEmpty()){
//            System.out.println("is balanced");
//        }else{
//            System.out.println("isnt balanced due to no enufff close");
//        }

        String parenth = "(())((<<>>))<<";
        Stack<String> stack = new Stack<String>();
        String[] c = parenth.split("");
        for (String cc: c) {
            if(cc.equals("(") || cc.equals("{") || cc.equals("[") || cc.equals("<")) {
                stack.push(cc);
            }
            else if(cc.equals(")")){
                if(stack.peek().equals("(")){
                    stack.pop();
                }else{
                    System.out.println("isnt balanced");
                    System.exit(0);
                }
            }else if(cc.equals("}")){
                if(stack.peek().equals("{")){
                    stack.pop();
                }else{
                    System.out.println("isnt balanced");
                    System.exit(0);
                }
            }else if(cc.equals("]")){
                if(stack.peek().equals("[")){
                    stack.pop();
                }else{
                    System.out.println("isnt balanced");
                    System.exit(0);
                }
            }else if(cc.equals(">")){
                if(stack.peek().equals("<")){
                    stack.pop();
                }else{
                    System.out.println("isnt balanced");
                    System.exit(0);
                }
            }else{
                System.out.println("not valid");
                System.exit(0);
            }
        }
        for (String cc: stack) {
            System.out.println(cc);

        }
        if(stack.isEmpty()){
            System.out.println("is balanced");
        }else{
            System.out.println("isnt balanced due to no enufff close");
        }
    }

    //solution
//    public static boolean balancedBrackets(String s) {

//        Stack<Character> stack = new Stack<Character>();
//        HashMap<Character, Character> bracketPairs = new HashMap<Character, Character>();
//        bracketPairs.put(')', '(');
//        bracketPairs.put(']', '[');
//        bracketPairs.put('}', '{');
//        bracketPairs.put('>', '<');
//
//        for (int i = 0; i < s.length(); i += 1) {
//
//            // If character is opening bracket
//            if (bracketPairs.containsValue(s.charAt(i))) {
//                stack.push(s.charAt(i));
//            }
//            // Else, if character is closing bracket
//            else if (bracketPairs.containsKey(s.charAt(i))) {
//                // Closing bracket without matching opening bracket
//                if (stack.isEmpty()) {
//                    return false;
//                }
//                // Check that most recent bracket on stack matches
//                Character mostRecentBracket = stack.pop();
//                if (!mostRecentBracket.equals(bracketPairs.get(s.charAt(i)))) {
//                    return false;
//                }
//            }
//        }
//
//        return stack.isEmpty();
//    }

//    What is the runtime complexity of your solutions for Step 1 and Step 2?
//      O(n)
//    What is the runtime complexity for each solution?
//      O(n)
//    How do the solutions compare to yours? What improvements do you think you could have made to your solution?
//      They are the same though the solution is neater. i couldve implemented a hashmap
//    How would the implementation of the Stack from Step 3 change if you were to implement a queue?
//        queues would enqueue and dequeue, so enqueue until reach appropriate close for the dequeued open and keep queue and enqueue in that manner

}