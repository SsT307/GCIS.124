import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FourthClass {
    public static void main (String [] args) throws IOException{

        /* ------------------------ checking if a file exists ----------------------- */
        File file1 = new File("Using.txt");
        System.out.println(file1.exists()); // Checking if the file exists

        /* ----------------------- reading the input of a file ---------------------- */
        try(FileReader fileReading = new FileReader("Using.txt");
        BufferedReader reading = new BufferedReader(fileReading))
        {
        String line = reading.readLine();
        System.out.println(line);
        reading.close();
        fileReading.close();
        }

        /* --------------------------- overwriting a file --------------------------- */
        FileWriter fileWriting = new FileWriter("Using.txt");
        PrintWriter writing = new PrintWriter(fileWriting);
        writing.write("I am the best!");
        writing.close();
        fileWriting.close();
    }

}
