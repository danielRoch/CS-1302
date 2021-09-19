package MindTap.Unit13.thirteenDashSix;

import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
public class ValidateCheckDigits {
    public static void main(String[] args) {
        Path fileIn = Paths.get("C:\\Users\\droc1\\Documents\\GSU\\Sophmore Year Semester 1\\CS 1302\\src\\MindTap\\Unit13\\thirteenDashSix\\AcctNumsIn.txt");
        Path fileOut = Paths.get("C:\\Users\\droc1\\Documents\\GSU\\Sophmore Year Semester 1\\CS 1302\\src\\MindTap\\Unit13\\thirteenDashSix\\AcctNumsOut.txt");
       
        // Write your code here
        InputStream input = null;
        OutputStream output = null;

        try {
            input = Files.newInputStream(fileIn);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            output = new BufferedOutputStream(Files.newOutputStream(fileOut, CREATE));

            String line = reader.readLine();

            while(line != null) {
                int lineLength = line.length();
                line = line + "\n";
                byte[] data = line.getBytes();
                int sumOfFirst5Char = 0;
                for (int i = 0; i < lineLength - 1; i++) {
                    sumOfFirst5Char += Integer.parseInt(String.valueOf((line.charAt(i))));
                }

                int moduloOfFirst5CharBy10 = sumOfFirst5Char % 10;
                int finalCharacter = Integer.parseInt(String.valueOf((line.charAt(5))));

                if (finalCharacter == moduloOfFirst5CharBy10) {
                    output.write(data);
                }
                line= reader.readLine();
            }

            reader.close();
            input.close();
            output.flush();
            output.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

