/*Solution to 2021, Day 1: Sonar Sweep*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SonarSweep
{
    public static void main(String []args)
    {
        File inputFile = new File("input.txt");
        Scanner scanner;

        try
        {
            scanner = new Scanner(inputFile);
            int previousDepth = 0, counter = -1;
            while (scanner.hasNextInt())
            {
                int currentDepth = scanner.nextInt();
                if (currentDepth > previousDepth)
                {
                    counter ++;
                }
                previousDepth = currentDepth;
            }

            System.out.println(counter);
        }
        catch (FileNotFoundException error)
        {
            System.out.println("ERROR" + error.getMessage());
        }
    }
}