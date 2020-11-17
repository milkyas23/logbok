import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MVCViewForm {
    private JPanel MVCpannel;
    private JButton publishButton;
    private JTextArea programmeringTextArea;
    private JTable table1;
    private JTextArea username;



    public static void main(String[] args) {
        JFrame frame = new JFrame("MVCViewForm");
        frame.setContentPane(new MVCViewForm().MVCpannel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void addListener(ActionListener listenForCalcButton) {
        publishButton.addActionListener(listenForCalcButton);
    }

    public String getUsername() {
        return username.getName();
    }

    public String getText() {
        return programmeringTextArea.getText();
    }

    public JPanel getMVCpannel() {
        return MVCpannel;
    }

    private void createUIComponents() {

        // TODO: place custom component creation code here
    }
}
