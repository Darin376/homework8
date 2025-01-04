package teachmeskills.lesson8.example1.apstract.card;

import java.util.Date;

public  abstract class BaseCard {
    int CardNumber;
    double balance;
    Date vaiteDate;

    public BaseCard(int cardNumber, double balance, Date vaiteDate) {
        CardNumber = cardNumber;
        this.balance = balance;
        this.vaiteDate = vaiteDate;
    }

    public void cardInfo () {
        System.out.println("Card Number: " + CardNumber + " balanse " + balance);
    };
    public  abstract boolean sanksinfo();
}
