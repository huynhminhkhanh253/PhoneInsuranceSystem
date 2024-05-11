package JavaCore.FileHandling;

import java.io.*;

public class FileHandling {
    /*Writing File*/

    public static void bufferwriter() throws IOException {
        {
            BufferedWriter bufferedWriter = null;
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "/Java/src/JavaCore/FileHandling/input_bufferwriter.txt")); // dynamic path
                bufferedWriter.write("Hello, wrting to input_bufferwriter.txt from buffer writer");
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace(); // throw error type
            } finally {
                bufferedWriter.close(); // always implement no matter what
                // what happen if you dont close, java may handle closing by garbage collector, but it not guarante when
                // for large program if you dont close it may cause of run out of memory (in heap space)
            }
        }
    }

    public static void filewriter() throws IOException {
        {
            FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter(System.getProperty("user.dir") + "/Java/src/JavaCore/FileHandling/input_filewriter.txt"); // dynamic path
                fileWriter.write("Hello, wrting to input_filewriter from file writer");
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace(); // throw error type
            } finally {
                fileWriter.close(); // always implement no matter what
            }
        }
    }
    /*Reading file*/
    public static void bufferreader() throws IOException {
        System.out.println("***Reading by buffer reader***");
        BufferedReader bufferReader = null;
        try {
            String line;
            bufferReader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/Java/src/JavaCore/FileHandling/output.txt"));
            while ((line = bufferReader.readLine()) != null) {
                System.out.println(line); // reading all the line
            }
        } catch (IOException e) {
            e.printStackTrace(); // throw error type
        } finally {
            bufferReader.close();
        }

    }

    public static void filereader() throws IOException {
        System.out.println("***Reading by file reader***");
        FileReader fileReader = null;
        try {
            int i;
            fileReader = new FileReader(System.getProperty("user.dir") + "/Java/src/JavaCore/FileHandling/output.txt");
            while ((i = fileReader.read()) != -1) {
                System.out.print((char)i); // reading all the line
            }
        } catch (IOException e) {
            e.printStackTrace(); // throw error type
        } finally {
            fileReader.close();
        }

    }
}
