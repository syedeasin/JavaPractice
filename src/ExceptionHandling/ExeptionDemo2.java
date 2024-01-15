package ExceptionHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ExeptionDemo2 {
    public static void main(String[] args) {
        String text = "Hello, this is easin, and it's a text file to learn exception handling";
        try{
            System.out.println("Entered on try block");
            Files.writeString(Path.of("/home/syed/Desktop/text.txt"),text,
                    StandardOpenOption.WRITE);
        }
        catch (IOException easin)
        {
            System.out.println("Entered on catch block");
            easin.printStackTrace();
        }
    }
}
