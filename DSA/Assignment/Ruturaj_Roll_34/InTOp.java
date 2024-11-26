import java.util.Scanner;
import java.util.Stack;

public class InTOp {

   
    static int precedence(char c) {
        return (c == '+' || c == '-') ? 1 :
        (c == '*' || c == '/') ? 2 :
        (c == '^') ? 3 : 0;
    }

    
    static String Converting(String word) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

      
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            }
            
            else if (ch == '(') {
                stack.push(ch);
            }
          
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); 
            }
           
            else {
                
                    while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                        postfix.append(stack.pop());
                    }
                    stack.push(ch); 
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter expression");
        System.out.println("-----------------------------------------");
        String infix = sc.nextLine();
        System.out.println("Infix: " +infix);
        System.out.println("Postfix: " +Converting(infix));
        System.out.println("------------------------------------------");
        sc.close();
    }
}
