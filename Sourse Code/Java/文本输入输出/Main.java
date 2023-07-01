import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //   YOUR CODE HERE
        File fileC = new File("..//c.txt");

        if (!fileC.exists()) {
            fileC.createNewFile();
        }

        FileReader frA = new FileReader("..//a.txt");
        FileReader frB = new FileReader("..//b.txt");

        BufferedReader brA = new BufferedReader(frA);
        BufferedReader brB = new BufferedReader(frB);

        String A = brA.readLine();
        String B = brB.readLine();

        int result = (Integer.parseInt(A) + Integer.parseInt(B));

        FileWriter fw = new FileWriter(fileC.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("" + result);

        bw.close();
        brA.close();
        brB.close();

    }
}

