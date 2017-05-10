package bank;

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
        Account acc3 = bank.createAccount(customer2, true, "CUS");
        Account acc4 = bank.createAccount(customer2, false, "PLN");
        BigDecimal deposit = acc4.deposit(new BigDecimal(50));
        System.out.println(deposit);
        System.out.println(bank);
    }
}
