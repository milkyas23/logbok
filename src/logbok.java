import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class logbok {
    MVCViewForm view;

    public logbok() {
        JFrame frame = new JFrame("MVCViewForm");
        view = new MVCViewForm();
        frame.setContentPane(view.getMVCpannel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        view.addListener(new PublishListener());
        System.out.println(view.getText());

    }

    public static void main(String[] args) {

        logbok l = new logbok();


        try {
            l.CharStreamExample();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    String textFile = "meddelande.txt";
    String data = "medelande";

    private void CharStreamExample() throws IOException {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new BufferedWriter(new FileWriter(textFile)));
            out.println(data);

        } finally {
            out.close();
        }

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(textFile));
            System.out.println("Reading from textfile " + textFile);
            String s = in.readLine();
            System.out.println(s);

        } finally {
            in.close();
        }
    }

    private class PublishListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println(view.getText() + " " + view.getUsername());
        }
    }

}
