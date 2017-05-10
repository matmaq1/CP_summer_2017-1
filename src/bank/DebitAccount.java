package bank;

/**
 * Created by Mateusz on 19.04.2017.
 */
public class DebitAccount extends Account { // extends = inheritance


    public DebitAccount(Long accountId, Customer customer, String currency) {

        super(accountId, customer, currency);
    }
}
//colleaction  interface ->: list (array list)