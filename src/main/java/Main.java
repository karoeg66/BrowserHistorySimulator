import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Interfaz interfaz  = new Interfaz();
        JFrame frame = new JFrame();
        frame.add(interfaz.getInterfazPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);
    }
}
