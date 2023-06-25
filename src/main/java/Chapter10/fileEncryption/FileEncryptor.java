package Chapter10.fileEncryption;

import util.FileUtil;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * File Encryption is the science of writing the contents of a file in a secret code.
 *
 * Your encryption program should work like a filter, reading the contents of one file, modifying the data,
 * into a code, then writing the coded contents out to a second file. The second file will be a version
 * of the first one, but written in that secret code.
 *
 * Although there are complex encryption techniques, you should come up with a simple one of your own.
 *
 * Ex: You could read the first file
 * one character at a time
 * and add 10 to the character code
 * of each character
 * before writing it to another file.
 *
 */
public class FileEncryptor {
    public static void main(String[] args) throws IOException {
       String fileName = "test.dat";
//        String filePath = directory + fileName;
//        RandomAccessFile unencryptedFile = FileUtil.openReadWriteRandomAccessFile(filePath);
//
//        if(unencryptedFile == null){
//            System.out.println("ERROR FILE IS NULL.");
//        } else {
//            FileUtil.writeCharactersToRandomAccessFile(unencryptedFile,"Hello I am input", true);
//            FileUtil.closeRandomAccessFile(unencryptedFile);
//        }
        try{
            final String SOURCE_FILE = "M:\\IT\\IT projects\\java-book\\javapractice\\src\\main\\java\\Chapter10\\fileEncryption\\testFileDirectory\\test.txt";
            final String ENCRYPTION_FILE_PATH = "M:\\IT\\IT projects\\java-book\\javapractice\\src\\main\\java\\Chapter10\\fileEncryption\\testFileDirectory\\encrypted\\encryptedFile.txt";
            String encryptedContent = FileUtil.encryptContents(SOURCE_FILE,10);
            System.out.println("Encrypted text: " + encryptedContent);
            FileUtil.writeFile(ENCRYPTION_FILE_PATH,encryptedContent);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
