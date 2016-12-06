import java.io.File;
import java.util.Scanner;

public class ScannerConstructorDemo
{
    public static void main(String[] args)
    {
        try
        {
            Scanner keyboardInput = new Scanner(System.in);
            System.out.print("Enter the file name with extention : ");
            File myFile = new File(keyboardInput.nextLine());

			// call the constructor that reads a file
            Scanner fileInput = new Scanner(myFile);

            while (fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                System.out.println(line);
            }
            fileInput.close();

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}