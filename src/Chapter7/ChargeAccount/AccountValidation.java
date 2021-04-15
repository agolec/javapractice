package Chapter7.ChargeAccount;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountValidation {

    List<Integer> validAccounts = new ArrayList<Integer>();

    public AccountValidation(String filePath) throws FileNotFoundException {

        try{
            File accountFile = new File(filePath);
            //use scanner(accountFile) to set up a scanner to iterate over.
            Scanner inputFile = new Scanner(accountFile);

            while(inputFile.hasNextInt()){
                validAccounts.add(inputFile.nextInt());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("unable to read from file.");
        }



    }

    public boolean isValid(int userAccountNumber){
        boolean found = false;
        int index = 0;
        while(!found && index < validAccounts.size()){
            if( validAccounts.get(index) == userAccountNumber){
                found = true;
            }
            else{
                found = false;
                index++;
            }
        }
        return found;
    }
}
