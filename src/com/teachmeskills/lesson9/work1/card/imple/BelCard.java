package com.teachmeskills.lesson9.work1.card.imple;

import com.teachmeskills.lesson9.work1.card.BaseCard;

import java.util.Date;

public class BelCard extends BaseCard {


    public BelCard(String CardNumberOne, int balanceONe, Date vaiteDate) {
        super(CardNumberOne, balanceONe, vaiteDate);

    }

    @Override
    public boolean checkCardBalansInfo() {
            if(super.getBalanceONe()>0) {
                return true;
            } else  {
                return false;
            }
    };
}
