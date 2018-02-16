import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

class UnderFlowException extends Exception {
    UnderFlowException(String message) {
        super(message);
    }
}

class OverFlowException extends Exception {
    OverFlowException(String message) {
        super(message);
    }
}

class SpecialStack {
    ArrayList<Integer> stack;
    Stack<Integer> helperStack;
    int size;
    SpecialStack(int size){
        this.size = size;
        stack = new ArrayList<>();
        helperStack = new Stack<>();
    }
    public boolean isFull(){
         if(stack.size() == size) {
             System.out.println("Stack is full.");
             return true;
         } else {
             return false;
         }
    }
    public boolean isEmpty(){
        if(stack.size() == 0){
//            System.out.println("Stack is empty.");
            return true;
        } else {
            return false;
        }
    }
    public void push(int n) throws OverFlowException{
        if(isEmpty()) {
            stack.add(n);
            helperStack.push(n);
        } else if(!isFull()) {
            stack.add(n);
            if (n < helperStack.peek()) {
                helperStack.push(n);
            } else {
                helperStack.push(helperStack.peek());
            }
        } else {
            throw new OverFlowException("Stack is full");
        }
    }
    public int pop() throws UnderFlowException {
        if(!isEmpty()) {
            helperStack.pop();
            int popppedValue = stack.remove(stack.size() - 1);
            return  popppedValue;
        } else {
            throw new UnderFlowException("Stack is empty.");
        }
    }
    public int getMin() throws UnderFlowException {
        if(!isEmpty()) {
            return helperStack.peek();
        } else {
            throw new UnderFlowException("Stack is empty.");
        }
    }
}
public class Ques7 {
    public static void main(String[] args) {
        SpecialStack stack = new SpecialStack(5);
        System.out.println("1.Push");
        System.out.println("2.Pop");
        System.out.println("3.Is Full");
        System.out.println("4.Is Empty");
        System.out.println("5.Get Min");
        System.out.println("6.Exit");
        try {
            boolean flag = false;
            Scanner sc = new Scanner(System.in);
            int choice;
            int n;
            int p;
            while(!flag){
                System.out.println("Enter your choice");
                choice = sc.nextInt();
                switch (choice) {
                    case (1) : {
                        System.out.println("Enter number to push");
                        n = sc.nextInt();
                        stack.push(n);
                        break;
                    }
                    case (2) : {
                        p = stack.pop();
                        System.out.println(p);
                        break;
                    }
                    case (3) : {
                        System.out.println(stack.isEmpty());
                        break;
                    }
                    case (4) : {
                        System.out.println(stack.isFull());
                        break;
                    }
                    case (5) : {
                        System.out.println(stack.getMin());
                        break;
                    }
                    case (6) : {
                        flag = true;
                        break;
                    }
                }
            }
        } catch(UnderFlowException e) {
            System.out.println(e.getMessage());
        } catch(OverFlowException e) {
            System.out.println(e.getMessage());
        }
    }
}
