package util;

import java.io.*;
import java.util.Scanner;

public class FileUtil {
    static RandomAccessFile randomAccessFile;

    /**
     *
     * @param fileName - file name to attempt to open.
     * @return an instance of a scanner object that will either be connected to a file, if the file exists,
     *      or null, if the file does not exist.
     */
    public static Scanner openFile(String fileName){
        Scanner scan;
        try{
            File file = new File(fileName);
            scan = new Scanner(file);
        } catch (FileNotFoundException e){
            scan = null;
        }
        return scan;
    }

    /**
     *
     * @param scan a scanner from the main program that is attached to a file.
     * @return true if the
     */
    public static boolean doesFileExist(Scanner scan){
        boolean fileExists;
        if(scan == null){
            fileExists = false;
        }
        else {
            fileExists = true;
        }
        return fileExists;
    }
    public static RandomAccessFile openReadWriteRandomAccessFile(String fileName) throws IOException {
        try{
            randomAccessFile = new RandomAccessFile(fileName, "rw");

        } catch (IOException e){
            System.out.println("ERROR: File not found.");
            randomAccessFile = null;
        }
        return randomAccessFile;

    }
    public static void writeCharactersToRandomAccessFile(RandomAccessFile fileToWriteTo, String inputForWriting) throws IOException {
        if(fileToWriteTo == null){

        }else {
            System.out.println("Writing to file. . . ");

            try {
                for (int i = 0; i < inputForWriting.length(); i++) {
                    fileToWriteTo.writeChar(inputForWriting.charAt(i));
                }
            } catch(IOException e){
                System.out.println("Error: IOException: " + e.getMessage());
            }
        }
    }
    public static void writeCharactersToRandomAccessFile(RandomAccessFile fileToWriteTo, String inputForWriting,boolean encrypt) throws IOException {
        if(fileToWriteTo == null){

        }else {
            System.out.println("Writing to file. . . ");

            if(encrypt) {
                try {
                    for (int i = 0; i < inputForWriting.length(); i++) {
                        fileToWriteTo.writeChar(inputForWriting.charAt(i) + 2);
                    }
                } catch (IOException e) {
                    System.out.println("Error: IOException: " + e.getMessage());
                }
            }
        }
    }
    public static String readFileContents(RandomAccessFile fileToReadFrom) throws IOException {
        final int CHAR_SIZE = 2;
        long byteNumber = 0;
        byte pointerPosition = 0;
        char currentCharacter;
        StringBuffer buffer = new StringBuffer();
        while(fileToReadFrom.getFilePointer() < fileToReadFrom.length()){
            byteNumber = CHAR_SIZE * pointerPosition;
            fileToReadFrom.seek(byteNumber);
            currentCharacter = fileToReadFrom.readChar();
            buffer.append(currentCharacter);
            pointerPosition++;
        }
        return buffer.toString();
    }
    public static void closeRandomAccessFile(RandomAccessFile fileToClose) throws IOException {
        fileToClose.close();
    }
}
