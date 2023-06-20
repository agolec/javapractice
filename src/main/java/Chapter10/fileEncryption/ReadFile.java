package Chapter10.fileEncryption;

import util.FileUtil;

import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        String directory = "M:\\IT\\IT projects\\java-book\\javapractice\\src\\main\\java\\Chapter10\\fileEncryption\\testFileDirectory\\";
        String fileName = "test.dat";
        String filePath = directory + fileName;

        String fileContents = "";
        RandomAccessFile unencryptedFile = FileUtil.openReadWriteRandomAccessFile(filePath);

        if(unencryptedFile == null){
            System.out.println("ERROR FILE IS NULL.");
        } else {
            fileContents = FileUtil.readFileContents(unencryptedFile);
            FileUtil.closeRandomAccessFile(unencryptedFile);
        }

        System.out.println("File contents are: " + fileContents);
    }
}
