package com.teachmeskills.lesson9.work1.card.fabric;

import com.teachmeskills.lesson9.work1.card.BaseCard;
import com.teachmeskills.lesson9.work1.card.imple.BelCard;
import com.teachmeskills.lesson9.work1.card.imple.VisaCard;

import java.util.Date;

public class CardsFabric {

    public static BaseCard[] crieteCards() {
        BaseCard card1 = new BelCard("233", 11, new Date());
        BaseCard card2 = new BelCard("2312", 11, new Date());
        BaseCard card3 = new VisaCard("2131333", 23, new Date(), "Belka");
        BaseCard card4 = new VisaCard("2221133", 25, new Date(), "Belka");

        BaseCard[] cards = new BaseCard[4];
        cards[0] = card1;
        cards[1] = card2;
        cards[2] = card3;
        cards[3] = card4;
        return cards;
    };
}
