package teachmeskills.lesson8.example1.apstract.card;

import java.util.Date;

public class VisaCard extends BaseCard {

    String quwerentyCode;
    String country;

    public VisaCard(int cardNumber, double balance, Date vaiteDate, String quwerentyCode, String country) {
        super(cardNumber, balance, vaiteDate);
        this.quwerentyCode = quwerentyCode;
        this.country = country;
    }

    @Override
    public boolean sanksinfo() {
        return false;
    }
}
