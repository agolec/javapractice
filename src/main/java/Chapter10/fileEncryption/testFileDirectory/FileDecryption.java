package Chapter10.fileEncryption.testFileDirectory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDecryption {
    public static String encryptedFilePath = "M:\\IT\\IT projects\\java-book\\javapractice\\src\\main\\java\\Chapter10\\fileEncryption\\testFileDirectory\\encrypted\\encryptedFile.txt";
    public static String decryptedFilePath = "M:\\IT\\IT projects\\java-book\\javapractice\\src\\main\\java\\Chapter10\\fileEncryption\\testFileDirectory\\decrypted\\decryptedFile.txt";
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(new File(encryptedFilePath));
            StringBuilder sb = new StringBuilder();

            while(sc.hasNext()){
                sb.append(sc.nextLine());
            }
            String line = "";
            for(int i = 0; i < sb.length();i++){
                char ch = sb.toString().charAt(i);
                line += ((char) (ch - 10));
            }

            //write contents of decrypted file to new directory.
            FileWriter fw = new FileWriter(decryptedFilePath);
            fw.write(line);
            fw.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
