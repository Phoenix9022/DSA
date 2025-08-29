import java.util.Stack;

public class Stack1 {
    
        int[] stack = new int[10];
        int top = -1;

        boolean push(int value) {
            if (top < 9) {
                stack[++top] = value;
                return true;
            } else {
                return false;
            }
        }

        int pop() {
            if (top >= 0) {
                int value = stack[top--];
                return value;
            } else {
                return -1;  
            }
        }

        public static void main(String[] args) {
            Stack1 stack = new Stack1();
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.pop();
            System.out.println("Top element popped from stack:");
            for (int i = 0; i <= stack.top; i++) {
                System.out.print(stack.stack[i] + " ");
            }       
        }
    }