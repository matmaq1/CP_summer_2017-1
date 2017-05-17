package bank.expections;

/**
 * Created by Mateusz on 17.05.2017.
 */
public class WrongCurrency extends BankExpection {
    public WrongCurrency(String message) {
        super(message);
    }
}
