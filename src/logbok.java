import java.io.*;

public class logbok {
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

    public static void main(String[] args) {
        logbok l = new logbok();
        try {
            l.CharStreamExample();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
