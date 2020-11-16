import javax.swing.*;

public class MVCViewForm {
    private JPanel MVCpannel;
    private JButton publishButton;
    private JTextArea programmeringTextArea;
    private JTable table1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("MVCViewForm");
        frame.setContentPane(new MVCViewForm().MVCpannel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }






    private void createUIComponents() {

        // TODO: place custom component creation code here
    }
}
