package Chapter7.ChargeAccount;

import java.io.FileNotFoundException;

public class ChargeAccountTest {

    public static void main(String[] args) throws FileNotFoundException {

        AccountValidation validation = new AccountValidation("src\\Chapter7\\ChargeAccount\\ValidAccounts.txt");

        int randoAccountNumber = 505052;
        System.out.println("Passing in account number: "+ randoAccountNumber );

        if(validation.isValid(randoAccountNumber)){
            System.out.println("Account number valid");
        }else{
            System.out.println("Account invalid");
        }
    }
}
