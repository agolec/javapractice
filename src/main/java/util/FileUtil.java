package util;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileUtil {
    static RandomAccessFile randomAccessFile;
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
