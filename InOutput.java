package InPutOutPut;

import java.io.*;
public class InOutput {
    public static void main(String[] args) throws IOException {
        String str = "\nMoscow";
        String str0 = "\nTula";
        String str1 = "\nKrasnodar";

        FileOutputStream fos = new FileOutputStream("C://Users/alexander/Desktop/ud282-master/Progress/src/InPutOutPut/1.txt", true);
        byte[] buffer = str.getBytes();
        fos.write(buffer);
        int length = str.length();
        System.out.print("\nLength line 1 = " + length+" ");

        buffer = str0.getBytes();
        fos.write(buffer);
        int length0 = str0.length();
        System.out.print("\nLength line 2 = " + length0);

        buffer = str1.getBytes();
        fos.write(buffer);
        int length1 = str1.length();
        System.out.print("\nLength line 3 = " + length1);


        FileInputStream fin = new FileInputStream("C://Users/alexander/Desktop/ud282-master/Progress/src/InPutOutPut/1.txt");

        int i = -1;
        while ((i = fin.read()) != -1) {
            System.out.print((char) i);
        }
        System.out.print("\n");

//        File fos  = new File("C://Users/alexander/Desktop/ud282-master/Progress/src/InPutOutPut/2.txt");



        fin.close();
//        FileOutputStream fos0 = new FileOutputStream("C://Users/alexander/Desktop/ud282-master/Progress/src/InPutOutPut/2.txt");

    }
}
