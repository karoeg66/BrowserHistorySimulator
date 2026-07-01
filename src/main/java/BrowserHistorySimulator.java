import javax.swing.*;

public class BrowserHistorySimulator {
    Stack stack = new Stack();
    public void visitPage(String url) {
        stack.push(url);
    }

    public String back() {
        String message = "";
        try {
            stack.pop();
            message = "Going back... Now you are on : " + stack.peek() + ".com";
        }catch(Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return message;
    }

    public String currentPage() {
        String message = "";
        try {
        message = "Current page: " + stack.peek() + ".com";
    } catch (Exception e) {
        System.err.println(e.getMessage());}
        return message;
    }
}
