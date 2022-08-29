package FileWriterReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReader {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("C://Users/alexander/Desktop/ud282-master/Progress/src/FileWriterReader/1.txt", true);
        String text = "Hello World";
        writer.write(text);
        writer.append("\n");
        writer.close();

        FileReader reader = new FileReader("C://Users/alexander/Desktop/ud282-master/Progress/src/FileWriterReader/1.txt");
        int c;
        while ((c=reader.read())!= -1){
            System.out.print((char) c);
            reader.close();
        }
    }
}
