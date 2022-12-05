package day03.src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

/**
 * FilesDemo 
*/

public class FilesDemo {
    public static void main(String[] args) {

        String filePath = "src/demo.txt";
        ReadFile(filePath);
        
        String filePath2 = "src/output.txt";
        WriteFile(filePath2);

    }

    public static void ReadFile(String fname) {
        
        // Path object
        File fobj = Paths.get(fname).toFile();

        if (fobj.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File not found.");
        }
        // Read Object
    
        try {
            FileReader fr = new FileReader(fobj);
            BufferedReader bdf = new BufferedReader(fr);
            String line;

            // String line = bdf.readLine();
            // System.out.println("First line = > " + line);

            while (null != (line = bdf.readLine())) {

            }

            line = bdf.readLine();
            System.out.println("Second line = > " + line);

            bdf.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found. PLease check input file: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("Unable to read line: " + e.getMessage());
        }
    }
        public static void WriteFile(String fname) {
            try {
                FileWriter fw = new FileWriter(fname, false); // append mode / write mo
                // fw.writeln("apple");
                // fw.writeln("orange");
                // fw.writeln("pear");

                BufferedWriter bfw = new BufferedWriter(fw);
                bfw.write("apple");
                bfw.write("orange");
                bfw.write("pear");

                fw.flush();
                fw.close();

            } catch (IOException e) {
                System.out.println("Unable to write line: " + e.getMessage());
            }
        
        }


}


