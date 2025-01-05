package com.teachmeskills.lesson9.work1.card.imple;

import com.teachmeskills.lesson9.work1.card.BaseCard;

import java.util.Date;

public class VisaCard extends BaseCard {

    String contry;

    public VisaCard(String CardNumberOne, int balanceONe, Date vaiteDate,String contry) {
        super(CardNumberOne, balanceONe, vaiteDate);
        this.contry =contry;
    }


    @Override
    public boolean checkCardBalansInfo() {
        return true;
    }
}
