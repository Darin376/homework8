package teachmeskills.lesson8.example1.apstract.card;

import java.util.Date;

public class BelCard extends BaseCard {

    public BelCard(int cardNumber, double balance, Date vaiteDate) {
        super(cardNumber, balance, vaiteDate);
    }

    @Override
    public boolean sanksinfo() {
        return false;
    }


}
