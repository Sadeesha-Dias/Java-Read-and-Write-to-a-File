package sadeesha;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadandWrite {
    public static void main(String[] args) {

        //region - taking user input
        Scanner userTextScan = new Scanner(System.in);
        System.out.println("Enter the desired text: ");

        String text = userTextScan.nextLine();

        //endregion

        //region - writing to a file
        //this File Writer throws a IO exception. Hence, we are handling it using a try catch block
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output_file.txt", true));
            writer.write("\n" + text);
            writer.close(); // #---- Always make sure to close the BufferWritter object. Otherwise, nothing will be written into the file ----#
        } catch (IOException e) {
            e.printStackTrace();
        }

        //endregion
    }
}
