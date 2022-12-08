import org.w3c.dom.Text;

import javax.swing.*;
import java.io.*;
import java.nio.file.Paths;
import java.util.*;
import java.nio.*;


    public class Main {


        public static void main(String[] args) throws IOException {

        int count = 0;

        JFileChooser chooser = new JFileChooser();

        int checkInput = chooser.showOpenDialog(null);

        if (checkInput == JFileChooser.APPROVE_OPTION)
        {
            int linesTotal = 0;
            int wordsTotal = 0;
            int charsTotal = 0;

            File input = chooser.getSelectedFile();

            System.out.println("File name: " + input.getName());

            System.out.println("Path: " + input.getAbsolutePath());

            Scanner scannedInput = new Scanner(Paths.get(input.toURI()));

            List<Text> text = new ArrayList<>();

            while (scannedInput.hasNextLine())
            {

                count++;

                String line = scannedInput.nextLine();

                String[] strArray = null;

                strArray = line.split(" ");

                wordsTotal = wordsTotal + strArray.length;

                for (int i = 0; i < line.length(); i++)
                {
                    if (line.charAt(i) != ' ')
                    {
                        charsTotal++;
                    }
                }
            }

            System.out.println("There are " + count + " lines, " + wordsTotal + " words, and " + charsTotal + " characters.");


        }

        }


    }





