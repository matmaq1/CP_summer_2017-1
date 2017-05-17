package bank;

import bank.expections.BankExpection;
import bank.expections.NegativeAmountExpection;
import bank.expections.NotEoughMoneyExpection;

import java.math.BigDecimal;

/**
 * Created by Mateusz on 19.04.2017.
 */
public class PlayWithBankIYKWIM {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer customer1 = bank.createCustomer("Janusz", "KorwinMikke");
        Customer customer2 = bank.createCustomer("Volvo", "Plsfix");
        Account acc1 = bank.createAccount(customer1, false, "USD");
        Account acc2 = bank.createAccount(customer2, false, "EUR");
        Account acc3 = bank.createAccount(customer2, true, "EUR");
        Account acc4 = bank.createAccount(customer2, false, "EUR");
        try {
            acc4.deposit(new BigDecimal(90));
            acc3.deposit(new BigDecimal(90));
            bank.transfer(2L,3L,50d);
        } catch (BankExpection ne) {
            System.out.println("something went wrong: "  +ne.getMessage() );
        }
        System.out.println(acc4.getBalance());
        System.out.println(bank);
    }
}
