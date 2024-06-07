import java.util.Stack;

public class Parenthesis {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    return false;
                } else {
                    char top=st.peek();
                    if(c==')' && top=='(' || c==']'&& top=='[' || c=='}'&& top=='{')
                    {
                        st.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String [] s)
    {
        String text="()[]{}";
        boolean ans=isValid(text);
        if(ans) {
            System.out.println("The string is valid");
        }
        else
        {
            System.out.println("The string is not valid");
        }
    }
}
