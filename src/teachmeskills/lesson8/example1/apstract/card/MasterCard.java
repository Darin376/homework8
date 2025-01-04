package teachmeskills.lesson8.example1.apstract.card;

import java.util.Date;

public class MasterCard extends BaseCard {

    String quwerentyCode;

    public MasterCard(int cardNumber, double balance, Date vaiteDate, String quwerentyCode) {
        super(cardNumber, balance, vaiteDate);
        this.quwerentyCode = quwerentyCode;
    }

    @Override
    public boolean sanksinfo() {
        return false;
    }
}
