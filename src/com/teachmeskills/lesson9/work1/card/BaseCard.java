package com.teachmeskills.lesson9.work1.card;

import java.util.Date;

public abstract class BaseCard {
    private String CardNumberOne;
    private int balanceONe;
    private Date vaiteDate;

    public BaseCard(String CardNumberOne, int balanceONe, Date vaiteDate) {
        this.CardNumberOne = CardNumberOne;
        this.balanceONe = balanceONe;
        this.vaiteDate = vaiteDate;
    }

    public abstract boolean checkCardBalansInfo();

    public void setBalance() {
        System.out.println(CardNumberOne + " -> " + balanceONe + " -> " + vaiteDate);
    }

    public String getCardNumberOne() {
        return CardNumberOne;
    }

    public void setCardNumberOne(String cardNumberOne) {
        CardNumberOne = cardNumberOne;
    }

    public int getBalanceONe() {

        return balanceONe;
    }

    public void setBalanceONe(int balanceONe) {
        this.balanceONe = balanceONe;
    }

    public Date getVaiteDate() {
        return vaiteDate;
    }

    public void setVaiteDate(Date vaiteDate) {
        this.vaiteDate = vaiteDate;
    }
}
