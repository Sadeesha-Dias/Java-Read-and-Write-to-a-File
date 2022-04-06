package sadeesha;

import java.io.*;
import java.util.Scanner;

public class ReadandWrite {
    public static void main(String[] args) {

        //region - Taking user input
        Scanner userTextScan = new Scanner(System.in);
        System.out.println("Enter the desired text: ");

        String text = userTextScan.nextLine();

        //endregion - Taking user input

        //region - Writing to a file
        //this File Writer throws a IO exception. Hence, we are handling it using a try catch block
        try {
            BufferedWriter _writer = new BufferedWriter(new FileWriter("output_file.txt", true));
            _writer.write("\n" + text);
            _writer.close(); // #---- Always make sure to close the BufferWritter object. Otherwise, nothing will be written into the file ----#
        } catch (IOException e) {
            e.printStackTrace();
        }

        //endregion - Writing to a file

        //region - Reading from a file
        try {
            BufferedReader _reader = new BufferedReader(new FileReader("output_file.txt"));

            String readTextLine;
            while((readTextLine = _reader.readLine()) != null){
                System.out.println(readTextLine);
            }
            _reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //endregion

    }
}
