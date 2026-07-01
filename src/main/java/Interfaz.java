import javax.management.StringValueExp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz {
    private JButton backButton;
    private JButton visitPageButton;
    private JButton currentPageButton;
    private JPanel interfazPanel;
    private JLabel lblCurrentPage;
    private JLabel lblBack;
    BrowserHistorySimulator browserHistorySimulator = new BrowserHistorySimulator();
    Timer timer;
    Timer timer2;

    public Interfaz() {
        lblBack.setVisible(false);
        lblCurrentPage.setVisible(false);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblBack.setText(browserHistorySimulator.back());
                lblBack.setVisible(true);
                timer2 = new Timer(3000, event1 ->
                        lblBack.setVisible(false));
                timer2.start();
            }
        });

        visitPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String url = JOptionPane.showInputDialog(interfazPanel, "Ingrese la url que quiere visitar");
                browserHistorySimulator.visitPage(url);
            }
        });
        currentPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblCurrentPage.setText(browserHistorySimulator.currentPage());
                lblCurrentPage.setVisible(true);;
                timer = new Timer(4000, event ->
                        lblCurrentPage.setVisible(false));
                timer.start();
            }
        });
    }

    public JPanel getInterfazPanel() {
        return interfazPanel;
    }
}
