package Chapter10.fileEncryption;

import java.io.RandomAccessFile;

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
    final int CHAR_SIZE = 2;
    String fileString = "";

}
